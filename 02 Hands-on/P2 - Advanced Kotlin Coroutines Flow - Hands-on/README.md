# Hands-on Pertemuan 2 — Advanced Kotlin, Coroutines, dan Flow

## Daftar Latihan

### 1. handson1-latihan — Coroutines Dasar
Mengambil data dari dua sumber (`fetchUserProfile` dan `fetchUserPosts`) secara paralel menggunakan `async` dan `await`, kemudian menggabungkan hasilnya.

- Konsep: `async`, `await`, `Deferred`.

### 2. handson2-latihan — Flow dengan Operators
Membuat Flow yang mensimulasikan sensor suhu (`temperatureSensor`), memfilter suhu di atas 30 derajat Celsius, mentransformasikannya menjadi pesan peringatan, lalu menampilkannya.

- Konsep: `flow {}`, `filter`, `map`, `collect`.

### 3. handson3-latihan — StateFlow untuk Counter
Mengimplementasikan `CounterManager` menggunakan `StateFlow` dengan fungsi `increment()`, `decrement()` (minimum 0), dan `reset()`.

- Konsep: `MutableStateFlow`, `StateFlow`, `asStateFlow()`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Suspend function can only be called from coroutine` | Memanggil suspend function dari fungsi biasa | Panggil dari dalam coroutine scope (`launch`, `runBlocking`, `viewModelScope`) |
| `Flow emission from different coroutine is not allowed` | Emit dari coroutine yang berbeda dalam flow builder | Gunakan `channelFlow` atau `callbackFlow` |
| `Job was cancelled` / `CancellationException` | Parent scope dibatalkan sebelum child selesai | Tangani dengan `try-finally` atau `NonCancellable` |
