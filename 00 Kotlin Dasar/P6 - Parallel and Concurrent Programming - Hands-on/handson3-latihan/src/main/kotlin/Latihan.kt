import java.util.concurrent.LinkedBlockingQueue
import kotlin.concurrent.thread

// Hands-on 3: Producer-Consumer dengan BlockingQueue
// Tugas: Implementasikan pola producer-consumer menggunakan LinkedBlockingQueue.
// Satu thread producer menaruh 5 pesan ke queue (dengan delay 200ms per pesan),
// satu thread consumer mengambil dan mencetak pesan itu satu per satu.
// Consumer harus berhenti setelah menerima tanda "selesai" dari producer.

const val PESAN_SELESAI = "SELESAI"

fun main() {
    val queue = LinkedBlockingQueue<String>()

    val producer = thread {
        for (i in 1..5) {
            val pesan = "Pesan #$i"
            queue.put(pesan)
            println("[Producer] mengirim: $pesan")
            Thread.sleep(200)
        }
        queue.put(PESAN_SELESAI)
    }

    val consumer = thread {
        while (true) {
            val pesan = queue.take()
            if (pesan == PESAN_SELESAI) {
                break
            }
            println("[Consumer] menerima: $pesan")
        }
    }

    producer.join()
    consumer.join()
    println("Selesai!")
}
