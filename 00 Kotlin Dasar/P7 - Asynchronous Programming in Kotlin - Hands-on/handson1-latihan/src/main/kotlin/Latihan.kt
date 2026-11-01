import kotlinx.coroutines.*

// Hands-on 1: Suspend Function Dasar
// Tugas: Buat suspend function checkOrderStatus() yang mensimulasikan
// panggilan ke server untuk mengecek status pesanan (delay 2 detik),
// lalu panggil dari dalam coroutine sehingga main thread TIDAK ter-blok
// selama menunggu.

suspend fun checkOrderStatus(orderId: String): String {
    delay(2000)
    return "Order $orderId: SHIPPED"
}

fun main() = runBlocking {
    println("Menunggu status pesanan...")
    val status = checkOrderStatus("A100")
    println(status)
}
