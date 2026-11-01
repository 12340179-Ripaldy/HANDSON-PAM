# Hands-on Pertemuan 5 (Kotlin Dasar) — Functional Programming

## Daftar Latihan

### 1. handson1-latihan — Higher-Order Function
Melengkapi fungsi `calculate(a, b, operation)` yang menerima parameter fungsi untuk menjalankan operasi matematika (tambah, kurang, kali) menggunakan lambda expression.

- Konsep: higher-order function, function type `(Int, Int) -> Int`, trailing lambda syntax.

### 2. handson2-latihan — Lambda dan Function Reference
Menyusun pipeline `filter` dan `map` pada daftar nama mahasiswa menggunakan dua pendekatan: lambda expression secara langsung dan function reference (`::isEvenLength`, `::toUpper`).

- Konsep: lambda expression, function reference (`::`), first-class function.

### 3. handson3-latihan — Closure (Counter Factory)
Mengimplementasikan fungsi `makeCounter(): () -> Int` yang mengembalikan closure untuk menyimpan dan menambah nilai variabel `count` setiap kali fungsi tersebut dipanggil.

- Konsep: closure, variable capturing, state pada fungsi.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `A function type was expected` | Mengirimkan nilai biasa ke parameter yang mengharapkan tipe fungsi | Kirimkan lambda expression `{ a, b -> a + b }` atau function reference `::tambah` |
| Function reference tidak cocok | Parameter atau return type dari `::namaFungsi` tidak sesuai dengan tipe yang diminta | Pastikan signature fungsi sama persis dengan tipe parameter fungsi |
| Nilai counter pada closure tidak bertambah | Pemanggilan `makeCounter()` dilakukan berulang kali alih-alih menyimpan instance-nya | Simpan hasil `val c = makeCounter()` ke dalam variabel, lalu panggil `c()` |
