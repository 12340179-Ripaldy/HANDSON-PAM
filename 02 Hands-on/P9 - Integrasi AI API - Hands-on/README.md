# Hands-on Pertemuan 9 — Integrasi AI API

## Daftar Latihan

### 1. Handson1RealAiRepository.kt — Panggil AI API Dasar
Melengkapi `RealAiRepository.ask()` untuk menyusun request body Gemini, mengirim HTTP POST melalui Ktor, mem-parsing response JSON, dan mengembalikan hasilnya dalam bentuk `Result.success` atau `Result.failure`.

- Konsep: Ktor `HttpClient`, `ContentNegotiation` dengan `kotlinx.serialization`, penggunaan `Result<T>` untuk penanganan error.

### 2. Handson2PromptEngineering.kt — Prompt Engineering
Melengkapi fungsi `buildPrompt()` untuk menggabungkan instruksi sistem (system instruction) dengan pertanyaan pengguna sebelum dikirim ke layanan AI.

- Konsep: penyusunan prompt terstruktur dan komposisi fungsi.

### 3. Handson3ChatScreen.kt — AI-Powered Chat UI
Membangun antarmuka chat sederhana yang terdiri dari input teks, tombol kirim, daftar pesan dalam `LazyColumn`, serta indikator loading saat menunggu respons dari `AiRepository.ask()`.

- Konsep: `LazyColumn`, pengelolaan list state, `rememberCoroutineScope()`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| Pesan error pada pemanggilan API di Latihan 1 | Nilai `GEMINI_API_KEY` masih berupa teks placeholder | Isi API key yang valid pada file `ApiConfig.kt` |
| HTTP 400 Bad Request | Struktur JSON request body tidak sesuai dengan spesifikasi Gemini API | Pastikan struktur `GeminiRequest`, `GeminiContent`, dan `GeminiPart` sesuai format endpoint |
| HTTP 403 Forbidden | API key tidak valid atau melewati batas kuota | Periksa kembali API key dan kuota penggunaan di Google AI Studio |
| Daftar `candidates` kosong pada response | Prompt terblokir oleh filter keamanan | Tangani kondisi null dan kembalikan `Result.failure` dengan pesan yang informatif |
