// Hands-on 2: Tailrec Optimization
// Tugas: factorialBiasa() di bawah akan StackOverflowError untuk n besar.
// Buat versi yang aman menggunakan `tailrec`.

fun factorialBiasa(n: Long, acc: Long = 1): Long {
    if (n <= 1) return acc
    return factorialBiasa(n - 1, acc * n) // rekursi di posisi terakhir (tail call)
}

tailrec fun factorialTailrec(n: Long, acc: Long = 1): Long {
    if (n <= 1) return acc
    return factorialTailrec(n - 1, acc * n)
}

fun main() {
    println("factorialBiasa(20) = ${factorialBiasa(20)}") // aman, n kecil

    println("factorialTailrec(20) = ${factorialTailrec(20)}")

    // Uji dengan n besar: factorialBiasa akan StackOverflowError,
    // factorialTailrec harus tetap aman (walau hasilnya overflow Long, tidak apa).
    try {
        println("factorialBiasa(100000) = ${factorialBiasa(100000)}")
    } catch (e: StackOverflowError) {
        println("factorialBiasa(100000) -> StackOverflowError! (dibatasi ukuran stack JVM)")
    }

    println("factorialTailrec(100000) = ${factorialTailrec(100000)} (tidak overflow stack)")
}
