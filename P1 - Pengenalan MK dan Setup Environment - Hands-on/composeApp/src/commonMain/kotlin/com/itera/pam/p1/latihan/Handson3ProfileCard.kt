package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Hands-on 3: Layout Dasar — Profile Card
// Tugas: Susun sebuah "kartu profil" sederhana berisi nama, NIM, dan platform
// yang sedang berjalan, menggunakan Card, Column, Row, dan Modifier.
//
// CATATAN: fungsi ini belum menampilkan apa-apa selain placeholder di bawah —
// lengkapi semua TODO supaya kartu profil muncul dengan benar.

@Composable
fun Handson3Screen() {
    // TODO 1: Bungkus semua konten dengan:
    //         Card(modifier = Modifier.fillMaxWidth().padding(16.dp)) { ... }
    // TODO 2: Di dalam Card, buat Column(modifier = Modifier.padding(16.dp))
    // TODO 3: Di dalam Column, tambahkan Text() untuk nama kamu
    // TODO 4: Tambahkan Text() untuk NIM kamu
    // TODO 5: Tambahkan Row { } berisi Text("Platform: ") dan
    //         Text(getPlatformName()) (import com.itera.pam.p1.getPlatformName)

    Text(
        "Belum diimplementasikan — lengkapi TODO 1-5 di atas",
        modifier = Modifier.padding(16.dp)
    )
}
