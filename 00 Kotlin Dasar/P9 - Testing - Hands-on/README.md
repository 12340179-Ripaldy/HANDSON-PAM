# Hands-on Pertemuan 9 (Kotlin Dasar) — Testing

## Daftar Latihan

### 1. handson1-latihan — Unit Test Dasar (Pola AAA)
Melengkapi unit test untuk class `Calculator` (`add`, `subtract`, `divide`) menggunakan pola Arrange-Act-Assert dan `assertEquals(expected, actual)`.

- Konsep: `@Test`, `@DisplayName`, `assertEquals`, pola Arrange-Act-Assert.

### 2. handson2-latihan — Testing Exception
Melengkapi unit test untuk class `BankAccount`, khususnya menguji kondisi `withdraw()` yang melempar `InsufficientFundsException` ketika saldo tidak mencukupi.

- Konsep: `assertThrows<T> { ... }`, pengujian custom exception.

### 3. handson3-latihan — Test Lifecycle dan Setup
Melengkapi fungsi `@BeforeEach` pada `TodoListTest` untuk menyiapkan instance `TodoList` baru sebelum setiap test dijalankan, serta menguji operasi `add`, `remove`, dan `isEmpty`.

- Konsep: `@BeforeEach`, isolasi test dan inisialisasi objek uji.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| Fungsi test tidak terdeteksi saat dijalankan | Anotasi `@Test` belum ditambahkan atau fungsi bersifat `private` | Pastikan fungsi memiliki anotasi `@Test` dan visibilitas default/public |
| `AssertionFailedError` dengan nilai expected dan actual terbalik | Urutan argumen pada `assertEquals` tertukar | Gunakan urutan `assertEquals(expected, actual)` |
| Task `test` tidak menjalankan JUnit 5 | Konfigurasi `useJUnitPlatform()` belum diaktifkan | Pastikan `tasks.withType<Test> { useJUnitPlatform() }` sudah ada pada `build.gradle.kts` |
