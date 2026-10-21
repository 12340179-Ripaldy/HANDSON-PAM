// Hands-on 2: Bounded Type Parameter
// Tugas: Buat fungsi generik findMax yang mencari nilai terbesar dari sebuah
// List<T>, dengan syarat T harus bisa dibandingkan (Comparable<T>).
// Ini mirip alasan quickSort butuh constraint T : Comparable<T> di slide.

// TODO 1: Tambahkan bounded type parameter <T : Comparable<T>> pada fungsi
// findMax di bawah ini, lalu implementasikan logikanya.
fun findMax(items: List<Int>): Int {
    // TODO 2: Ganti signature di atas menjadi generik: fun <T : Comparable<T>> findMax(items: List<T>): T
    // TODO 3: Lempar IllegalArgumentException jika items kosong
    // TODO 4: Iterasi list, bandingkan setiap elemen dengan compareTo, simpan yang terbesar
    TODO("Implementasikan findMax generik")
}

fun main() {
    println(findMax(listOf(3, 7, 2, 9, 4)))          // 9
    // println(findMax(listOf(1.5, 2.8, 0.3)))        // 2.8
    // println(findMax(listOf("apel", "jeruk", "duku"))) // "jeruk" (alfabetis)
}
