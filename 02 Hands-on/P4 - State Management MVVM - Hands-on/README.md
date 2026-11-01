# Hands-on Pertemuan 4 — State Management (MVVM)

## Daftar Latihan

### 1. Handson1Counter.kt — Counter App dengan State
Membuat counter dengan tombol increment (+1), decrement (-1, nonaktif jika bernilai 0), dan reset (kembali ke 0).

- Konsep: `remember`, `mutableStateOf`, recomposition, `Button(enabled = ...)`.

### 2. Handson2RegistrationForm.kt — Form dengan State Hoisting
Membuat komponen `LabeledTextField` yang stateless di mana state dikelola oleh parent `Handson2Screen`, kemudian digunakan untuk input Name dan Email beserta teks pratinjaunya.

- Konsep: state hoisting (state dikirim melalui parameter, event dikirim melalui callback), komponen reusable.

### 3. Handson3TodoApp.kt — Todo App dengan ViewModel (MVVM)
Mengimplementasikan `TodoViewModel` beserta state `TodoUiState` menggunakan `MutableStateFlow` dan `StateFlow`, dilengkapi fitur tambah todo dan ubah status selesai pada UI Compose.

- Konsep: arsitektur MVVM (Model-View-ViewModel), `ViewModel`, `MutableStateFlow`, `StateFlow`, `collectAsState()`, `LazyColumn`, `Checkbox`.

## Troubleshooting

| Error | Solusi |
|---|---|
| UI tidak berubah saat state diupdate | Gunakan `remember { mutableStateOf() }`, bukan variabel biasa |
| State selalu ter-reset saat recomposition | Bungkus pembuatan state dengan `remember { }` |
| `Unresolved reference: by` | Tambahkan import `androidx.compose.runtime.getValue` dan `androidx.compose.runtime.setValue` |
| `collectAsState()` not found | Tambahkan import `androidx.compose.runtime.collectAsState` |
| `ViewModel` not found | Pastikan dependency `org.jetbrains.androidx.lifecycle:lifecycle-viewmodel-compose` sudah terdaftar |
