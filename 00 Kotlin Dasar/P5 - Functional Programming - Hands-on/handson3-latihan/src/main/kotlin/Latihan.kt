// Hands-on 3: Closure — Counter Factory
// Tugas: Implementasikan `makeCounter()` yang mengembalikan sebuah fungsi
// closure. Setiap kali closure tersebut dipanggil, ia harus mengembalikan
// angka berikutnya (1, 2, 3, ...) dengan MENGINGAT state count-nya sendiri
// di luar scope fungsi `makeCounter`.
//
// CATATAN: File ini SENGAJA belum bisa di-compile sampai kamu melengkapi
// semua TODO di bawah — itu normal untuk latihan ini!

fun makeCounter(): () -> Int {
    // TODO 1: Deklarasikan `var count` bertipe Int, mulai dari 0.
    // Variabel ini akan "ditangkap" (captured) oleh closure di bawah.

    // TODO 2: Kembalikan sebuah lambda `() -> Int` yang menambah `count`
    // lalu mengembalikan nilai barunya.
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

    println(counterA()) // 1
    println(counterA()) // 2
    println(counterA()) // 3

    println(counterB()) // 1 (counterB independen dari counterA)
    println(counterB()) // 2
}
