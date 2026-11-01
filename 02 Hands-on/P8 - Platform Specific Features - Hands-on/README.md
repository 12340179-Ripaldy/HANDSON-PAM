# Hands-on Pertemuan 8 — Platform Specific Features dan Dependency Injection

## Daftar Latihan

### 1. Handson1Vibrate.kt — Expect/Actual Getar Perangkat
Memanggil fungsi `vibrate()` yang diimplementasikan secara spesifik per platform (Android menggunakan `Vibrator`/`VibratorManager`, iOS menggunakan `UIImpactFeedbackGenerator`, dan Desktop menggunakan log konsol).

- Konsep: `expect` dan `actual` untuk mengakses API native perangkat.

### 2. Handson2Permission.kt — Permission Check
Memeriksa status izin kamera perangkat menggunakan fungsi `hasCameraPermission()` secara multiplatform.

- Konsep: pemeriksaan runtime permission antar platform.

### 3. Handson3Di.kt — Dependency Injection dengan Koin
Mengambil instance `GreetingRepository` yang telah didaftarkan pada `appModule` menggunakan `koinInject<GreetingRepository>()` di dalam fungsi Composable.

- Konsep: Koin `module { single<T> { ... } }`, `startKoin`, dan `koinInject()`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `NoBeanDefFoundException` saat `koinInject()` | `koinInject()` dipanggil sebelum `initKoin()` dijalankan | Pastikan `initKoin()` sudah dipanggil pada entry point platform sebelum `App()` |
| `KoinAppAlreadyStartedException` | `startKoin` dipanggil lebih dari satu kali dalam satu proses | Periksa `if (GlobalContext.getOrNull() == null)` sebelum memanggil `initKoin()` |
| `Expect/actual mismatch` | Signature fungsi `actual` tidak sama persis dengan deklarasi `expect` | Pastikan nama fungsi, parameter, dan tipe kembalian sama di semua source set |
