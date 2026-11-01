import kotlinx.coroutines.*

// Hands-on 3: Structured Concurrency & Cancellation
// Tugas: Implementasikan DownloadManager yang men-download beberapa "file"
// (disimulasikan dengan delay) sebagai child coroutine dari satu Job. Jika
// Job tersebut dibatalkan (cancel), SEMUA child coroutine yang belum
// selesai harus ikut berhenti (ini yang disebut structured concurrency).

class DownloadManager(private val scope: CoroutineScope) {

    fun downloadFile(name: String, durationMs: Long): Job {
        val job = scope.launch {
            delay(durationMs)
            println("$name selesai di-download")
        }
        return job
    }
}

fun main() = runBlocking {
    val parentJob = Job()
    val scope = CoroutineScope(parentJob)

    val manager = DownloadManager(scope)

    manager.downloadFile("foto.jpg", 1000)
    manager.downloadFile("video.mp4", 3000)
    manager.downloadFile("dokumen.pdf", 1500)

    delay(1200) // Beri waktu foto.jpg selesai

    println("Membatalkan sisa download...")
    parentJob.cancel()

    delay(2000) // Tunggu untuk membuktikan video.mp4 memang tidak selesai
    println("Selesai.")
}
