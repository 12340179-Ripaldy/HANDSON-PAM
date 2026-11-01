# Hands-on Pertemuan 3 — Compose Multiplatform Basics

## Daftar Latihan

### 1. Handson1ProfileCard.kt — ProfileCard
Membuat komponen `ProfileCard(name, bio)` dengan avatar bulat, nama, dan bio yang dibungkus dalam `Card` dengan elevation.

- Konsep: `Card`, `CardDefaults.cardElevation()`, `Row` dengan `verticalAlignment`, `Box` dengan `contentAlignment`.

### 2. Handson2LoginForm.kt — Login Form
Membuat `LoginForm(onLogin)` dengan input username, input password tersembunyi, dan tombol Login yang memanggil callback `onLogin(username, password)`.

- Konsep: `OutlinedTextField`, `PasswordVisualTransformation`, state (`remember`, `mutableStateOf`), callback lambda pada Composable.

### 3. Handson3ProductList.kt — Product List
Melengkapi `ProdukItem(produk)` untuk menampilkan indikator warna produk, nama, dan harga di dalam `Card` dan `Row`, lalu menampilkannya untuk daftar produk.

- Konsep: `data class`, penyusunan `Card`, `Row`, dan `Column`, iterasi list dengan `forEach`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `@Composable invocations can only happen from the context of a @Composable function` | Memanggil fungsi `@Composable` dari fungsi biasa | Pastikan fungsi pemanggil juga memiliki anotasi `@Composable` |
| `Unresolved reference: dp` / `sp` | Import belum ditambahkan | Tambahkan `import androidx.compose.ui.unit.dp` |
| `Type mismatch: expected Color` | Menggunakan `Color` dari package yang salah | Gunakan `androidx.compose.ui.graphics.Color` |
| `Unresolved reference: Icons` | Import icon belum lengkap | Tambahkan `import androidx.compose.material.icons.Icons` dan `import androidx.compose.material.icons.filled.Person` |
