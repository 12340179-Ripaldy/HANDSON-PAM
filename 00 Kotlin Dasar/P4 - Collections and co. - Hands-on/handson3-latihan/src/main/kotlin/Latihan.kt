// Hands-on 3: Sequence vs List (Lazy Evaluation)
// Tugas: Bandingkan List (eager) vs Sequence (lazy) saat memproses data besar
// dengan operasi filter + map berantai.
//
// CATATAN: File ini SENGAJA belum bisa dijalankan dengan benar sampai kamu
// melengkapi semua TODO — bagian "Kode kamu di sini" masih placeholder.

fun prosesDenganList(data: List<Int>): List<Int> {
    // TODO 1: filter angka genap, lalu map kuadratkan, lalu take(5)
    // Karena List itu EAGER, filter akan memproses SELURUH `data`
    // sebelum map dijalankan, padahal kita cuma butuh 5 hasil pertama.

    TODO("Kode kamu di sini...")
}

fun prosesDenganSequence(data: List<Int>): List<Int> {
    // TODO 2: ubah `data` menjadi Sequence dengan asSequence(),
    // lalu filter angka genap, map kuadratkan, take(5),
    // dan panggil operasi terminal toList() di akhir.
    // Karena Sequence itu LAZY, setiap elemen diproses satu per satu
    // melalui SELURUH pipeline sampai 5 hasil ditemukan — jauh lebih hemat.

    TODO("Kode kamu di sini...")
}

fun main() {
    val data = (1..1_000_000).toList()

    val startList = System.currentTimeMillis()
    val hasilList = prosesDenganList(data)
    val waktuList = System.currentTimeMillis() - startList
    println("List  : $hasilList (${waktuList}ms)")

    val startSeq = System.currentTimeMillis()
    val hasilSequence = prosesDenganSequence(data)
    val waktuSequence = System.currentTimeMillis() - startSeq
    println("Sequence: $hasilSequence (${waktuSequence}ms)")

    // Expected: kedua hasil = [4, 16, 36, 64, 100], tapi Sequence jauh lebih
    // cepat karena tidak perlu membuat List perantara berukuran 1 juta elemen.
}
