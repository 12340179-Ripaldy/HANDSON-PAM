import kotlinx.coroutines.*

// Hands-on 2: launch vs async
// Tugas: Ada 2 tugas simulasi — mencatat log (tidak perlu hasil) dan
// menghitung total harga belanja (perlu hasil untuk ditampilkan).
// Gunakan coroutine builder yang TEPAT untuk masing-masing:
// - launch  -> fire-and-forget, cocok untuk tugas yang tidak butuh nilai balik.
// - async   -> mengembalikan Deferred<T>, cocok kalau hasilnya dibutuhkan.

suspend fun writeAccessLog(message: String) {
    delay(500)
    println("[LOG] $message")
}

suspend fun calculateTotalPrice(prices: List<Int>): Int {
    delay(700)
    return prices.sum()
}

fun main() = runBlocking {
    val prices = listOf(15000, 25000, 10000)

    launch {
        writeAccessLog("Checkout dimulai")
    }

    val deferredTotal = async {
        calculateTotalPrice(prices)
    }

    val total = deferredTotal.await()
    println("Total belanja: Rp$total")
}
