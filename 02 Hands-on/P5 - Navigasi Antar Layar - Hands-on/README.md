# Hands-on Pertemuan 5 — Navigasi Antar Layar dan Passing Data

## Daftar Latihan

### 1. Handson1NavHostDasar.kt — NavHost dan NavController Dasar
Menghubungkan dua layar (`home` dan `detail`) menggunakan `NavHost` dan `NavController`. Tombol pada Home memanggil `navController.navigate("detail")` dan tombol pada Detail memanggil `navController.popBackStack()`.

- Konsep: `rememberNavController()`, `NavHost`, `composable(route)`, `navigate()`, `popBackStack()`.

### 2. Handson2PassingData.kt — Passing Data via Arguments
Menampilkan daftar item pada layar Home dan mengirim `itemId` ke layar Detail melalui route argument (`"detail/{itemId}"`).

- Konsep: `navArgument`, `NavType.IntType`, membaca nilai dari `backStackEntry.arguments`.

### 3. Handson3BottomNavigation.kt — Bottom Navigation
Membuat navigasi tiga tab (Home, Search, Profil) menggunakan `NavigationBar` dan `NavigationBarItem` yang terhubung ke satu `NavHost` dengan pengelolaan state back stack.

- Konsep: `NavigationBar`, `currentBackStackEntryAsState()`, `popUpTo` dengan `saveState`, `launchSingleTop`, `restoreState`.

## Troubleshooting

| Error | Penyebab | Solusi |
|---|---|---|
| `IllegalArgumentException: Navigation destination that matches route ... cannot be found` | Route yang dipanggil pada `navigate()` tidak sesuai dengan yang terdaftar di `composable(...)` | Pastikan penulisan route dan placeholder argumen `{itemId}` sama persis |
| Back stack menumpuk saat berpindah tab | `navigate()` dipanggil tanpa opsi `popUpTo` | Gunakan `popUpTo(startDestinationId) { saveState = true }`, `launchSingleTop = true`, dan `restoreState = true` |
| State tab hilang saat berpindah tab | Opsi `restoreState` atau `saveState` belum diaktifkan | Pastikan `saveState = true` pada `popUpTo` dan `restoreState = true` pada `navigate()` digunakan bersamaan |
