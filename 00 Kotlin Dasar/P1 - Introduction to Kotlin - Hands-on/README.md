# Hands-on Pertemuan 1 (Kotlin Dasar) — Introduction to Kotlin

## Daftar Latihan

### 1. handson1-latihan — Variabel, Fungsi, dan String Template
Melengkapi fungsi `describeProfile()` untuk mencetak deskripsi profil menggunakan string template, default parameter, serta penanganan nilai nullable `Int?`.

- Konsep: `val` dan `var`, string template (`$var`, `${expr}`), default parameter, named argument, safe call (`?.`), elvis operator (`?:`).

### 2. handson2-latihan — Control Flow dengan when Expression
Melengkapi fungsi `gradeOf()` yang mengklasifikasikan nilai ujian (0-100) menjadi huruf mutu A sampai E menggunakan `when` sebagai expression dalam single-expression function.

- Konsep: `when` sebagai expression, range (`in 90..100`), single-expression function (`fun ... = ...`).

### 3. handson3-latihan — Loops, Ranges, dan Null Safety
Melengkapi class `ScoreBoard` untuk menyaring skor valid (membuang nilai `null`) yang memenuhi batas kelulusan, serta mencetak bilangan ganjil menggunakan range dengan `step`.

- Konsep: `filterNotNull()`, `filter`, `sortedDescending()`, range dengan `step`, class dengan constructor property.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Val cannot be reassigned` | Mencoba mengubah nilai variabel `val` setelah diinisialisasi | Gunakan `var` jika nilainya perlu diubah |
| `Unresolved reference: skorValid` | Property `skorValid` belum dideklarasikan di dalam class | Tambahkan deklarasi `val skorValid: List<Int> = skorMentah.filterNotNull()` |
| `NotImplementedError` | Fungsi masih memanggil `TODO()` | Ganti pemanggilan `TODO()` dengan implementasi fungsi yang sesuai |
