// Hands-on 3: Sequence vs List (Lazy Evaluation)
// Tugas: Bandingkan List (eager) vs Sequence (lazy) saat memproses data besar
// dengan operasi filter + map berantai.

fun prosesDenganList(data: List<Int>): List<Int> {
    return data
        .filter { it % 2 == 0 }
        .map { it * it }
        .take(5)
}

fun prosesDenganSequence(data: List<Int>): List<Int> {
    return data
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it * it }
        .take(5)
        .toList()
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
