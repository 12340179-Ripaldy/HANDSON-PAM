import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

// Hands-on 2: Routing & JSON Sederhana
// Tugas: Tambahkan route GET /users yang mengembalikan daftar user
// dalam format JSON (dibangun manual dari List<Pair<String, String>>,
// tanpa library JSON), lengkap dengan header Content-Type yang benar.

data class User(val id: Int, val name: String)

val users = listOf(
    User(1, "Andi"),
    User(2, "Budi"),
    User(3, "Citra")
)

fun usersToJson(users: List<User>): String {
    return users.joinToString(
        prefix = "[",
        postfix = "]",
        separator = ","
    ) { user ->
        """{"id":${user.id},"name":"${user.name}"}"""
    }
}

fun main() {
    val server = HttpServer.create(InetSocketAddress("0.0.0.0", 8080), 0)

    server.createContext("/users") { exchange ->
        val jsonBody = usersToJson(users).toByteArray()
        exchange.responseHeaders.set("Content-Type", "application/json")
        exchange.sendResponseHeaders(200, jsonBody.size.toLong())
        exchange.responseBody.use { os ->
            os.write(jsonBody)
        }
    }

    server.start()
    println("Server berjalan di http://localhost:8080 — coba: curl http://localhost:8080/users")

    Thread.sleep(10_000)
    server.stop(0)
    println("Server dihentikan")
}
