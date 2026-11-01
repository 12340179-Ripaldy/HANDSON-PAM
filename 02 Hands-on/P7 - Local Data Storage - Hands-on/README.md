# Hands-on Pertemuan 7 — Local Data Persistence

## Daftar Latihan

### 1. Handson1Preferensi.kt — Preferensi Key-Value Sederhana
Menyimpan dan menampilkan jumlah berapa kali aplikasi dibuka secara persisten menggunakan tabel `Preferensi` pada SQLDelight.

- Konsep: penyimpanan key-value lokal, `executeAsOneOrNull()`, operasi `INSERT OR REPLACE` (upsert).

### 2. Handson2Repository.kt — SQLDelight Insert dan Query
Melengkapi `CatatanRepository` (`getAll()`, `tambah()`, dan `hapus()`) yang membungkus query SQLDelight dari skema `Catatan.sq`.

- Konsep: `expect` dan `actual` pada `DatabaseDriverFactory`, `AppDatabase`, serta pembacaan data reaktif menggunakan `asFlow().mapToList(...)`.

### 3. Handson3OfflineNotes.kt — Offline-First Catatan
Menggunakan `CatatanRepository` untuk menampilkan daftar catatan di dalam `LazyColumn`, form tambah catatan baru, dan tombol hapus per item.

- Konsep: `collectAsState`, `LazyColumn`, arsitektur offline-first.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Unresolved reference: AppDatabase` | Kode SQLDelight belum di-generate | Lakukan sync ulang Gradle atau jalankan task `:composeApp:generateCommonMainAppDatabaseInterface` |
| `[SQLITE_ERROR] no such table: Catatan` di Desktop | Skema database belum dibuat pada driver JDBC | Pastikan `AppDatabase.Schema.create(driver)` dipanggil pada `DatabaseDriverFactory.desktop.kt` |
| Data ter-reset saat aplikasi Desktop ditutup | Driver desktop menggunakan mode in-memory (`JdbcSqliteDriver.IN_MEMORY`) | Gunakan path file lokal `JdbcSqliteDriver("jdbc:sqlite:catatan.db")` jika ingin data tersimpan ke file di Desktop |
