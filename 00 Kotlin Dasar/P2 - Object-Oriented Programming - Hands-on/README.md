# Hands-on Pertemuan 2 (Kotlin Dasar) — Object-Oriented Programming

## Daftar Latihan

### 1. handson1-latihan — Class dan Inheritance
Membuat hierarki class `Vehicle` (`open class`) beserta class turunan `Car` dan `Motorcycle` yang meng-override fungsi `describe()` untuk menampilkan informasi spesifik kendaraan.

- Konsep: `open class`, `override`, primary constructor, `super`, polymorphism melalui `List<Vehicle>`.

### 2. handson2-latihan — Interface dan Data Class
Membuat interface `Payable` dengan fungsi `calculateSalary()` dan mengimplementasikannya pada `data class Employee`, serta memanfaatkan `copy()` dan `equals()`.

- Konsep: `interface`, `data class`, `copy()`, `equals()`, dan `toString()`.

### 3. handson3-latihan — Sealed Class untuk State
Memodelkan hasil pemanggilan jaringan sebagai `sealed class NetworkResult` dengan tiga state (`Loading`, `Success`, dan `Error`), lalu menanganinya menggunakan `when` expression yang exhaustive.

- Konsep: `sealed class`, `object` singleton, `when` exhaustive.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `This type is final, so it cannot be inherited from` | Class induk belum ditandai dengan keyword `open` | Tambahkan `open` pada deklarasi class dan fungsi yang ingin di-override |
| `'describe' overrides nothing` | Fungsi pada class induk belum `open` atau parameter tidak cocok | Pastikan fungsi induk menggunakan `open fun` dengan signature yang sama |
| `'when' expression must be exhaustive` | Belum semua subclass dari `sealed class` ditangani pada `when` | Tambahkan cabang untuk seluruh subclass dari `sealed class` tersebut |
