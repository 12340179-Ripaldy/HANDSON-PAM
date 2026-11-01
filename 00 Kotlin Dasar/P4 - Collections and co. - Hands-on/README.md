# Hands-on Pertemuan 4 (Kotlin Dasar) — Collections and Co.

## Daftar Latihan

### 1. handson1-latihan — Transformasi Collection
Menyaring daftar `Product` (nama, harga, stok) untuk menghasilkan daftar nama produk dengan harga di atas batas tertentu yang diurutkan dari harga termurah.

- Konsep: `filter`, `sortedBy`, `map`.

### 2. handson2-latihan — Grouping dan Aggregation
Mengelompokkan daftar `Transaksi` (id, kategori, nominal) untuk menghitung total nominal per kategori serta membuat indeks pencarian transaksi berdasarkan ID.

- Konsep: `groupBy`, `mapValues`, `sumOf`, `associateBy`.

### 3. handson3-latihan — Sequence vs List (Lazy Evaluation)
Membandingkan evaluasi pipeline `filter -> map -> take(5)` pada data berukuran besar menggunakan `List` (eager evaluation) dan `Sequence` (lazy evaluation).

- Konsep: `asSequence()`, evaluasi lazy vs eager, terminal operation (`toList()`).

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `ConcurrentModificationException` | Mengubah isi `MutableList` secara langsung saat sedang di-iterasi | Gunakan fungsi filter/salinan list atau `MutableIterator.remove()` |
| `NoSuchElementException` pada `first()` / `single()` | Memanggil `first()` atau `single()` pada collection yang kosong | Gunakan `firstOrNull()` atau `singleOrNull()` untuk menangani kondisi kosong |
| Hasil `Sequence` mencetak referensi objek `TakeSequence@...` | Operasi terminal belum dipanggil di akhir rangkaian `Sequence` | Tambahkan `.toList()` di akhir operasi sequence |
