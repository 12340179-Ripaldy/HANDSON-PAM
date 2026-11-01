# Hands-on Pertemuan 11 (Kotlin Dasar) — The Java Virtual Machine and the Kotlin Compiler

## Daftar Latihan

### 1. handson1-latihan — Inline Function dan Reified Generics
Melengkapi fungsi `isType()` untuk memeriksa tipe generik pada saat runtime menggunakan `value is T` dengan keyword `inline` dan `reified`.

- Konsep: type erasure pada JVM, `inline`, `reified`.

### 2. handson2-latihan — Tailrec Optimization
Mengubah fungsi rekursif faktorial menjadi fungsi `tailrec` dengan akumulator agar dioptimasi oleh compiler menjadi perulangan biasa dan terhindar dari `StackOverflowError`.

- Konsep: stack frame JVM, tail call, `tailrec`.

### 3. handson3-latihan — companion object dan @JvmStatic
Menambahkan anotasi `@JvmStatic` pada fungsi di dalam `companion object` agar menghasilkan static method pada level bytecode JVM dan dapat diverifikasi melalui reflection Java.

- Konsep: `companion object`, `@JvmStatic`, interoperabilitas Java, `java.lang.Class`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `StackOverflowError` saat memanggil fungsi rekursif dengan nilai besar | Rekursi biasa memenuhi memori stack karena pemanggilan rekursif bukan di posisi akhir | Gunakan `tailrec` dan pastikan pemanggilan rekursif menjadi ekspresi terakhir |
| `Cannot use 'T' as reified type parameter` | Pemeriksaan `is T` digunakan tanpa modifier `inline` dan `reified` | Tambahkan `inline` pada fungsi dan `reified` pada parameter tipe `<reified T>` |
| Method tidak terdeteksi sebagai static pada `Class.methods` | Fungsi di dalam `companion object` belum diberi anotasi `@JvmStatic` | Tambahkan `@JvmStatic` di atas deklarasi fungsi |
