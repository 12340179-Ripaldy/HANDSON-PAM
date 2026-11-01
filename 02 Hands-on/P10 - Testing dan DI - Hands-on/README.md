# Hands-on Pertemuan 10 — Testing dan Dependency Injection

## Daftar Latihan

### 1. CounterTest.kt — Unit Test Dasar (Arrange-Act-Assert)
Menguji fungsi `Counter.increment()`, `decrement()` (minimum 0), dan `reset()` menggunakan `kotlin.test.assertEquals`.

- Konsep: pola Arrange-Act-Assert (AAA), `kotlin.test`, unit testing.

### 2. SessionLoggerTest.kt — Test Double (Fake ClockProvider)
Melengkapi `FakeClockProvider` yang mendelegasikan waktu ke `TestTimeSource`, kemudian menggunakannya untuk menguji `SessionLogger` secara deterministik.

- Konsep: test double (fake), `TestTimeSource`, delegasi interface Kotlin (`by`).

### 3. KoinModuleTest.kt — Koin DI Module
Memverifikasi bahwa dependency di dalam `appModule` dapat di-resolve oleh Koin dengan benar menggunakan `KoinTest` dan `by inject<T>()`.

- Konsep: Koin `module { }`, `startKoin` dan `stopKoin`, `KoinTest`

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| Hasil test berbasis waktu tidak konsisten (flaky) | Test menggunakan waktu sistem asli yang berubah-ubah | Gunakan test double seperti `FakeClockProvider` dengan `TestTimeSource` |
| `KoinAppAlreadyStartedException` | `startKoin` dipanggil kembali tanpa menghentikan instance sebelumnya | Pastikan `stopKoin()` selalu dipanggil pada blok `@AfterTest` |
| `NoBeanDefFoundException` saat `inject()` | Modul belum didaftarkan pada konfigurasi Koin | Pastikan `modules(appModule)` dipanggil di dalam `startKoin` |
