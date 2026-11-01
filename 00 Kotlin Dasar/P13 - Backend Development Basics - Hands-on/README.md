# Hands-on Pertemuan 13 (Kotlin Dasar) — Backend Development Basics

## Daftar Latihan

### 1. handson1-latihan — HTTP Server Sederhana
Membuat `HttpServer` yang berjalan pada port 8080 dan menangani request `GET /hello` dengan mengirimkan respons teks `"Hello, Kotlin Backend!"`.

- Konsep: `HttpServer.create`, `createContext`, `sendResponseHeaders`, `responseBody`.

### 2. handson2-latihan — Routing dan JSON Sederhana
Menambahkan route `GET /users` yang mengembalikan daftar pengguna dalam format JSON beserta header `Content-Type: application/json`.

- Konsep: routing berdasarkan path, respons JSON, HTTP response header.

### 3. handson3-latihan — Request Handling dan Status Code
Mengimplementasikan endpoint `POST /echo` yang membaca isi request body lalu mengirimkannya kembali, serta menangani path lain dengan status `404 Not Found`.

- Konsep: membaca request body, kode status HTTP (200, 404, 405), routing fallback.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `java.net.BindException: Address already in use` | Port 8080 masih digunakan oleh proses server sebelumnya | Hentikan proses yang masih berjalan atau tunggu beberapa detik sebelum menjalankan ulang |
| Server tidak merespons request | Fungsi `server.start()` belum dipanggil setelah konteks dibuat | Pastikan `server.start()` dipanggil setelah seluruh `createContext` didaftarkan |
| Respons JSON terbaca sebagai teks biasa | Header `Content-Type: application/json` belum diatur sebelum mengirim header respons | Panggil `exchange.responseHeaders.set("Content-Type", "application/json")` sebelum `sendResponseHeaders` |
