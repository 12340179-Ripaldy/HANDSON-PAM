# Hands-on Pertemuan 1 — Pengenalan Kotlin Multiplatform dan Setup Environment

## Daftar Latihan

### 1. Handson1PlatformInfo.kt — Expect/Actual
Melengkapi fungsi `getGreetingMessage()` untuk menampilkan pesan sapaan yang menyebutkan nama platform melalui `getPlatformName()` menggunakan pola `expect` dan `actual`.

- Konsep: `expect fun` (commonMain), `actual fun` (androidMain, iosMain, desktopMain).

### 2. Handson2Counter.kt — State dan Recomposition
Mengimplementasikan counter sederhana dengan tombol tambah (`+`) dan kurang (`-`) menggunakan `remember { mutableStateOf(0) }`.

- Konsep: `remember`, `mutableStateOf`, recomposition, property delegate `by`.

### 3. Handson3ProfileCard.kt — Layout Dasar
Menyusun kartu profil yang menampilkan nama, NIM, dan platform menggunakan komponen `Card`, `Column`, `Row`, dan `Modifier`.

- Konsep: `Card`, layout composable (`Column`, `Row`), penggunaan `Modifier`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Gradle sync failed` | SDK atau JDK tidak ditemukan | Pastikan `JAVA_HOME` dan `ANDROID_HOME` sudah diatur |
| `SDK location not found` | File `local.properties` tidak ada | Buat file `local.properties` berisi `sdk.dir=path/to/sdk` |
| `Kotlin version mismatch` | Versi Kotlin tidak kompatibel dengan Compose Multiplatform | Sesuaikan versi plugin Kotlin dan Compose Multiplatform di `gradle/libs.versions.toml` |
