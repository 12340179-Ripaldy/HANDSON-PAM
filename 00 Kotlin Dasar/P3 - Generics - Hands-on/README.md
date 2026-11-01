# Hands-on Pertemuan 3 (Kotlin Dasar) — Generics

## Daftar Latihan

### 1. handson1-latihan — Generic Class Box<T>
Melengkapi class generik `Box<T>` dengan fungsi `map<R>(transform: (T) -> R): Box<R>` untuk mentransformasikan nilai di dalam Box menjadi Box baru dengan tipe yang berbeda.

- Konsep: generic class, type parameter, type inference.

### 2. handson2-latihan — Bounded Type Parameter
Mengimplementasikan fungsi generik `findMax` untuk mencari nilai terbesar dari sebuah `List<T>` menggunakan batasan tipe `T : Comparable<T>`.

- Konsep: bounded type parameter (upper bound), `Comparable<T>`.

### 3. handson3-latihan — Variance (out)
Menambahkan modifier variance pada `Container<T>` agar `Container<Cat>` dapat diterima sebagai `Container<Animal>`.

- Konsep: declaration-site variance, covariance (`out`), subtyping pada tipe generik.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Type mismatch. Required: Container<Animal>. Found: Container<Cat>` | Tipe generik di Kotlin bersifat invariant secara default | Tambahkan modifier `out` pada parameter tipe (`class Container<out T>`) |
| `Type parameter T is declared as 'out' but occurs in 'in' position` | Parameter bertanda `out` digunakan sebagai parameter input fungsi | Pastikan tipe `out` hanya digunakan sebagai nilai kembalian (output) |
| `Cannot use 'T' as reified type parameter` | Informasi tipe generik dihapus saat kompilasi (type erasure) | Gunakan bounded type parameter atau fungsi `inline` dengan `reified` |
