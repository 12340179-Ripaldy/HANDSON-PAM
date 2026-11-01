# Hands-on Pertemuan 10 (Kotlin Dasar) — Build Systems

## Daftar Latihan

### 1. handson1-latihan — Resource dan Packaging
Membaca file `app.properties` yang berada di folder `src/main/resources` melalui classloader (`getResourceAsStream`) dan menampilkan isinya.

- Konsep: konvensi resource Gradle, classpath, `java.util.Properties`.

### 2. handson2-latihan — Custom Gradle Task
Melengkapi custom task `printProjectInfo` pada `build.gradle.kts` untuk mencetak nama proyek, versi proyek, dan versi Gradle saat task dijalankan.

- Konsep: `tasks.register`, `doLast`, fase konfigurasi dan eksekusi Gradle.

### 3. handson3-latihan — Dependency Declaration
Menambahkan dependency `kotlinx-datetime` pada `build.gradle.kts` agar kode pada `Latihan.kt` dapat menggunakan library tersebut untuk menampilkan tanggal.

- Konsep: blok `dependencies {}`, koordinat `groupId:artifactId:version`, `implementation`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `app.properties` mengembalikan nilai `null` | Lokasi atau nama file tidak sesuai dengan yang dipanggil di classloader | Pastikan file berada di `src/main/resources/app.properties` |
| `Task 'printProjectInfo' not found` | Nama task salah ketik atau dijalankan pada modul yang berbeda | Jalankan dengan perintah `./gradlew :handson2-latihan:printProjectInfo` |
| `Unresolved reference: datetime` | Dependency belum ditambahkan di `build.gradle.kts` atau belum di-sync | Tambahkan `implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")` lalu lakukan sync Gradle |
