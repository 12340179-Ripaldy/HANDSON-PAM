// Hands-on 2: Bounded Type Parameter
// Tugas: Buat fungsi generik findMax yang mencari nilai terbesar dari sebuah
// List<T>, dengan syarat T harus bisa dibandingkan (Comparable<T>).
// Ini mirip alasan quickSort butuh constraint T : Comparable<T> di slide.

// TODO 1 & 2: Tambahkan bounded type parameter <T : Comparable<T>> pada fungsi
// findMax di bawah ini, lalu implementasikan logikanya.
fun <T : Comparable<T>> findMax(items: List<T>): T {
    
    // TODO 3: Lempar IllegalArgumentException jika items kosong
    if (items.isEmpty()) {
        throw IllegalArgumentException("Daftar tidak boleh kosong")
    }
    // TODO 4: Iterasi list, bandingkan setiap elemen dengan compareTo, simpan yang terbesar
    var maxItem = items[0]
    for (item in items) {
        if (item.compareTo(maxItem) > 0) {
            maxItem = item
        }
    }
    
    return maxItem
}
fun main() {
    // Jalankan semua baris ini (Hapus '//' di depan dua baris terakhir)
    println(findMax(listOf(3, 7, 2, 9, 4)))          // Output: 9
    println(findMax(listOf(1.5, 2.8, 0.3)))          // Output: 2.8
    println(findMax(listOf("apel", "jeruk", "duku")))// Output: jeruk
}
