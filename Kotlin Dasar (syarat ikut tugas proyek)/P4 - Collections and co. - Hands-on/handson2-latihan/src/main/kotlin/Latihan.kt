// Hands-on 2: Grouping & Aggregation
// Tugas: Dari daftar transaksi, hitung total nominal per kategori.
// Konsep: groupBy, sumOf, associateBy, Map

data class Transaksi(val id: String, val kategori: String, val nominal: Int)

fun totalPerKategori(transaksi: List<Transaksi>): Map<String, Int> {
    // TODO 1: Kelompokkan (groupBy) transaksi berdasarkan kategori
    // TODO 2: Untuk setiap grup, jumlahkan (sumOf) nominal-nya
    // Hasil akhir: Map<kategori, totalNominal>
    return transaksi
        .groupBy { it.kategori }
        .mapValues { grup -> grup.value.sumOf { it.nominal } }
}

fun transaksiById(transaksi: List<Transaksi>): Map<String, Transaksi> {
    // TODO 3: Buat Map dari List, dengan `id` transaksi sebagai key,
    //         menggunakan associateBy (agar bisa lookup transaksi via ID)
    return transaksi.associateBy { it.id }
}

fun main() {
    val transaksi = listOf(
        Transaksi("TRX01", "Makanan", 50_000),
        Transaksi("TRX02", "Transportasi", 20_000),
        Transaksi("TRX03", "Makanan", 35_000),
        Transaksi("TRX04", "Hiburan", 100_000),
        Transaksi("TRX05", "Transportasi", 15_000)
    )

    println("Total per kategori: ${totalPerKategori(transaksi)}")
    // Expected: {Makanan=85000, Transportasi=35000, Hiburan=100000}

    val byId = transaksiById(transaksi)
    println("Cari TRX03: ${byId["TRX03"]}")
    // Expected: Transaksi(id=TRX03, kategori=Makanan, nominal=35000)
}

// Output:
// Total per kategori: {Makanan=85000, Transportasi=35000, Hiburan=100000}
// Cari TRX03: Transaksi(id=TRX03, kategori=Makanan, nominal=35000)
