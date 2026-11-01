// Hands-on 3: Dependency Declaration
// Tugas: Latihan.kt di module ini butuh library "kotlinx-datetime" untuk
// mencetak tanggal hari ini, tapi library-nya BELUM dideklarasikan sebagai
// dependency di sini — makanya module ini belum bisa di-compile.

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
}
