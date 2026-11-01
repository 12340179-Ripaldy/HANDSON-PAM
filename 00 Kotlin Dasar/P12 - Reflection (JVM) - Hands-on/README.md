# Hands-on Pertemuan 12 (Kotlin Dasar) — Reflection (JVM)

## Daftar Latihan

### 1. handson1-latihan — Inspeksi Kelas dengan KClass
Menggunakan `product::class` untuk memperoleh `KClass<Product>`, kemudian mencetak nama kelas beserta daftar nama seluruh property-nya melalui `memberProperties`.

- Konsep: `KClass`, `::class`, `memberProperties`.

### 2. handson2-latihan — Baca Nilai Property Dinamis
Membuat fungsi generik `printFields(obj: Any)` yang mencetak nama dan nilai seluruh property dari sebuah objek secara dinamis menggunakan `property.getter.call(obj)`.

- Konsep: `memberProperties`, `KProperty.getter`, generic reflection.

### 3. handson3-latihan — Custom Annotation dan Reflection Validator
Membuat `annotation class Required` dan fungsi `validate(obj: Any): List<String>` untuk memeriksa secara dinamis seluruh property yang memiliki anotasi `@Required` agar tidak bernilai null atau kosong.

- Konsep: custom `annotation class`, `@Target`, `@Retention(RUNTIME)`, validasi berbasis reflection.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Unresolved reference: memberProperties` | Dependency `kotlin-reflect` belum ditambahkan | Pastikan `implementation(kotlin("reflect"))` sudah terdaftar pada `build.gradle.kts` |
| Anotasi tidak terbaca saat runtime | Anotasi tidak menggunakan retention runtime | Pastikan anotasi memiliki `@Retention(AnnotationRetention.RUNTIME)` |
| `IllegalCallableAccessException` saat memanggil `getter.call(obj)` | Property memiliki visibilitas `private` | Pastikan property bersifat `public` atau atur `isAccessible = true` |
