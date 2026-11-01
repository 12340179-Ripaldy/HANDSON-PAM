import java.util.concurrent.Callable
import java.util.concurrent.Executors

// Hands-on 2: ExecutorService & Future
// Tugas: Jalankan 4 "task" perhitungan yang lambat (simulasi delay dengan
// Thread.sleep) secara PARALEL menggunakan thread pool, lalu kumpulkan semua
// hasilnya. Jika dijalankan sequential, total waktu ~4 detik. Dengan thread
// pool 4 pekerja, seharusnya total waktu ~1 detik.

fun hitungKuadrat(n: Int): Int {
    Thread.sleep(1000) // Simulasi kerja berat
    return n * n
}

fun main() {
    val angka = listOf(1, 2, 3, 4)
    val startTime = System.currentTimeMillis()

    val executor = Executors.newFixedThreadPool(4)

    val futures = angka.map { n -> executor.submit(Callable { hitungKuadrat(n) }) }

    val hasil = futures.map { it.get() }
    println("Hasil: $hasil")

    executor.shutdown()

    val endTime = System.currentTimeMillis()
    println("Waktu: ${endTime - startTime}ms")
}
