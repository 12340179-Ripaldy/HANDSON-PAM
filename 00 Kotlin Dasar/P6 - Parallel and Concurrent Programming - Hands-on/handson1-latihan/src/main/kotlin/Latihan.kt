import kotlin.concurrent.thread

// Hands-on 1: Race Condition
// Tugas: Dua thread meng-increment sebuah shared counter (var c) sebanyak
// 100_000x masing-masing secara BERSAMAAN. Karena c++ bukan operasi atomik
// (baca-ubah-tulis, bisa saling menyela/interleave antar thread), hasil akhirnya
// SERING SALAH (bukan 200_000) — itulah race condition.

class Counter {
    private var c = 0

    fun increment() {
        synchronized(this) {
            c++
        }
    }

    fun value(): Int {
        synchronized(this) {
            return c
        }
    }
}

fun main() {
    val counter = Counter()
    val iterasi = 100_000

    val t1 = thread {
        repeat(iterasi) { counter.increment() }
    }
    val t2 = thread {
        repeat(iterasi) { counter.increment() }
    }

    t1.join()
    t2.join()

    println("Hasil akhir: ${counter.value()} (seharusnya ${iterasi * 2})")
}
