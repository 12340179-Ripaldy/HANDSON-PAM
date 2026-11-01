# Hands-on Pertemuan 6 — Networking REST API dengan Ktor

## Daftar Latihan

### 1. Handson1KtorClient.kt — Ktor Client Dasar dan GET Request
Mengonfigurasi `HttpClient` dengan plugin `ContentNegotiation` dan `json()`, serta mengimplementasikan `fetchUsers()` untuk melakukan HTTP GET request dan men-decode hasilnya menjadi `List<RemoteUser>`.

- Konsep: `HttpClient`, `ContentNegotiation`, `@Serializable`, `suspend fun`.

### 2. Handson2Repository.kt — Repository Pattern dan Loading State
Melengkapi `UserListStateHolder.load()` untuk mengelola perubahan state dari `Loading`, memanggil `UserRepository.getUsers()`, lalu mengubah state menjadi `Success` atau `Error`.

- Konsep: Repository Pattern, `sealed class` untuk UI state, `MutableStateFlow` dan `StateFlow`.

### 3. Handson3UserListUi.kt — Loading dan Error UI
Menampilkan `UiState` pada Compose menggunakan `CircularProgressIndicator()` saat Loading, `LazyColumn` daftar pengguna saat Success, serta pesan error dan tombol "Coba Lagi" saat Error.

- Konsep: `LaunchedEffect`, `collectAsState`, `rememberCoroutineScope`, smart-cast pada `sealed class`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `SecurityException: Permission denied (missing INTERNET permission)` | Izin internet belum ditambahkan di `AndroidManifest.xml` | Tambahkan `<uses-permission android:name="android.permission.INTERNET" />` sebelum tag `<application>` |
| `IllegalStateException: no client engine found` | Dependency engine Ktor spesifik platform belum ditambahkan | Pastikan engine Ktor (`ktor-client-cio`, `ktor-client-darwin`, atau `ktor-client-android`) sudah terdaftar di `build.gradle.kts` |
| `SerializationException` saat decode JSON | Nama field pada `@Serializable data class` tidak sesuai atau ada field tambahan dari API | Sesuaikan nama field dan gunakan konfigurasi `Json { ignoreUnknownKeys = true }` |
| UI tidak keluar dari state Loading | Fungsi `holder.load()` belum dipanggil di `LaunchedEffect(Unit)` atau exception tidak tertangkap | Pastikan `load()` dipanggil di dalam `LaunchedEffect` dan dilengkapi blok `try-catch` |
