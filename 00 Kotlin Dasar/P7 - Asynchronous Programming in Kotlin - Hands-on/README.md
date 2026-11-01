# Hands-on Pertemuan 7 (Kotlin Dasar) — Asynchronous Programming in Kotlin

## Daftar Latihan

### 1. handson1-latihan — Suspend Function Dasar
Membuat `suspend fun checkOrderStatus()` yang mensimulasikan pemanggilan server dengan `delay`, lalu memanggilnya dari dalam `runBlocking`.

- Konsep: `suspend fun`, `delay`, pemanggilan fungsi suspend di dalam coroutine.

### 2. handson2-latihan — launch vs async
Menggunakan coroutine builder `launch` untuk tugas tanpa nilai balik (logging) dan `async`/`await` untuk tugas yang mengembalikan hasil perhitungan.

- Konsep: `launch`, `Job`, `async`, `Deferred`, `await()`.

### 3. handson3-latihan — Structured Concurrency dan Cancellation
Mengimplementasikan `DownloadManager` yang menjalankan beberapa proses unduhan sebagai child coroutine dari satu parent `Job`, serta membatalkan seluruh proses melalui `cancel()`.

- Konsep: `Job()`, `CoroutineScope`, hierarki parent-child job, `cancel()`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `Suspend function should be called only from a coroutine or another suspend function` | Memanggil fungsi `suspend` secara langsung dari fungsi biasa | Panggil fungsi tersebut di dalam coroutine scope seperti `runBlocking`, `launch`, atau `async` |
| Program berakhir sebelum output di dalam `launch` tercetak | Fungsi utama selesai sebelum child coroutine menyelesaikan `delay` | Panggil `job.join()` untuk menunggu coroutine selesai |
| `JobCancellationException` | Parent `Job` atau scope dibatalkan saat child coroutine masih berjalan | Pastikan `cancel()` hanya dipanggil ketika memang ingin menghentikan coroutine |
