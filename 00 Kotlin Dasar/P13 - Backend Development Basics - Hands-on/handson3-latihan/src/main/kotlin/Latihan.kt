import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

// Hands-on 3: Request Handling & Status Code
// Tugas:
//   1. Handle POST /echo — baca body request, lalu kembalikan body yang
//      sama persis sebagai response (status 200).
//   2. Tambahkan handler default ("/") yang mengembalikan status 404
//      Not Found untuk semua path yang tidak dikenal.

fun main() {
    val server = HttpServer.create(InetSocketAddress("0.0.0.0", 8080), 0)

    server.createContext("/echo") { exchange ->
        if (exchange.requestMethod != "POST") {
            exchange.sendResponseHeaders(405, -1)
            exchange.close()
            return@createContext
        }

        val requestBytes: ByteArray = exchange.requestBody.readBytes()

        exchange.sendResponseHeaders(200, requestBytes.size.toLong())
        exchange.responseBody.use { os ->
            os.write(requestBytes)
        }
    }

    server.createContext("/") { exchange ->
        val path = exchange.requestURI.path
        val notFoundBody = "Not Found: $path".toByteArray()
        exchange.sendResponseHeaders(404, notFoundBody.size.toLong())
        exchange.responseBody.use { os ->
            os.write(notFoundBody)
        }
    }

    server.start()
    println("Server berjalan di http://localhost:8080")
    println("Coba: curl -X POST -d 'halo dunia' http://localhost:8080/echo")
    println("Coba: curl -i http://localhost:8080/tidak-ada")

    Thread.sleep(10_000)
    server.stop(0)
    println("Server dihentikan")
}
