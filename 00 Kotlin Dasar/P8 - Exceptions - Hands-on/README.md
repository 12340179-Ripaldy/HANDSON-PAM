# Hands-on Pertemuan 8 (Kotlin Dasar) — Exceptions

## Daftar Latihan

### 1. handson1-latihan — Try-Catch-Finally Dasar
Melengkapi fungsi `safeDivide(a, b)` untuk menangani `ArithmeticException` (pembagian dengan nol) tanpa menghentikan program serta memastikan blok `finally` selalu dieksekusi.

- Konsep: `try`, `catch`, `finally`, `ArithmeticException`.

### 2. handson2-latihan — Custom Exception dan Exception Hierarchy
Membuat `class InsufficientBalanceException : Exception` untuk menangani kondisi saldo tidak mencukupi pada `BankAccount.withdraw()`.

- Konsep: custom exception class, hierarki `Throwable` dan `Exception`, `require()`.

### 3. handson3-latihan — try-expression, require(), error(), dan multi-catch
Mengimplementasikan `parseTiket(input: String): Tiket` untuk mem-parsing teks menggunakan `try` sebagai expression, `require()` untuk validasi input, dan `error()` untuk kondisi tidak valid, lalu menanganinya di `main()`.

- Konsep: `try` sebagai expression, `require()` (`IllegalArgumentException`), `error()` (`IllegalStateException`), penanganan beberapa jenis exception.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| Error tidak terlihat saat terjadi kegagalan | Blok `catch` dibiarkan kosong tanpa pencatatan pesan error | Cetak atau catat pesan exception di dalam blok `catch` |
| Kode di dalam `finally` tetap berjalan saat terjadi exception | Blok `finally` memang selalu dieksekusi baik saat sukses maupun gagal | Gunakan `finally` khusus untuk pembersihan resource atau logging |
| `NullPointerException` tidak tertangkap oleh custom exception | Tipe exception yang dilempar berbeda dari yang ditangkap pada `catch` | Tambahkan blok `catch` yang sesuai atau hindari penggunaan operator `!!` |
