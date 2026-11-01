# Hands-on Pertemuan 6 (Kotlin Dasar) — Parallel and Concurrent Programming

## Daftar Latihan

### 1. handson1-latihan — Race Condition
Mengamankan proses increment pada shared `Counter` yang dijalankan oleh dua thread secara bersamaan menggunakan blok `synchronized` agar hasil akhirnya selalu konsisten 200.000.

- Konsep: race condition, shared mutable state, `synchronized`, intrinsic lock.

### 2. handson2-latihan — ExecutorService dan Future
Menjalankan empat perhitungan secara paralel menggunakan thread pool `ExecutorService` dan mengumpulkan hasilnya melalui `Future.get()`.

- Konsep: `Executors.newFixedThreadPool`, `Callable`, `Future`, `shutdown()`.

### 3. handson3-latihan — Producer-Consumer dengan BlockingQueue
Mengimplementasikan pola producer-consumer di mana satu thread mengirim pesan ke `LinkedBlockingQueue` dan thread lain mengambil serta mencetaknya hingga menerima nilai penanda selesai (sentinel).

- Konsep: `LinkedBlockingQueue`, `put()` dan `take()`, sentinel value.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| Hasil akhir counter tidak konsisten | Dua thread mengubah variabel yang sama secara bersamaan tanpa sinkronisasi | Bungkus operasi perubahan nilai dengan `synchronized(this) { }` |
| Program tidak berhenti setelah `future.get()` selesai | Thread pool pada `ExecutorService` belum dimatikan | Panggil `executor.shutdown()` setelah seluruh tugas selesai |
| Consumer menunggu tanpa henti pada `queue.take()` | Producer tidak mengirimkan pesan penanda selesai (sentinel) ke antrean | Pastikan producer mengirim nilai `DONE` ke queue di akhir pengiriman |
