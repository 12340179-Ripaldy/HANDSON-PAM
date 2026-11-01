// Hands-on 1: Try-Catch-Finally Dasar
// Tugas: Lengkapi fungsi safeDivide agar menangani pembagian dengan nol
// menggunakan try-catch-finally, tanpa membuat program crash.

fun safeDivide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Tidak dapat membagi $a dengan nol (${e.message})")
        0
    } finally {
        println("safeDivide($a, $b) selesai diproses")
    }
}

fun main() {
    println("Hasil 1: ${safeDivide(10, 2)}")  // sukses -> 5
    println("Hasil 2: ${safeDivide(10, 0)}")  // b == 0 -> harus ditangani, hasil 0
    println("Hasil 3: ${safeDivide(9, 3)}")   // sukses -> 3
}
