package com.itera.pam.p3.latihan

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Hands-on 1: ProfileCard (lihat slide "P3 - Compose Multiplatform Basics.pdf" hal. 30)
// Tugas: Buat komponen ProfileCard dengan avatar, nama, dan bio.

@Composable
fun ProfileCard(name: String, bio: String) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
            // TODO 1: tambahkan verticalAlignment = Alignment.CenterVertically
            // (butuh import androidx.compose.ui.Alignment)
        ) {
            // TODO 2: Tambahkan avatar bulat, misalnya:
            //         Box(
            //             modifier = Modifier.size(48.dp).background(Color.Gray, CircleShape),
            //             contentAlignment = Alignment.Center
            //         ) { Icon(Icons.Default.Person, contentDescription = null) }
            // TODO 3: Tambahkan Column(modifier = Modifier.padding(start = 12.dp)) berisi:
            //         - Text(name) dengan fontWeight = FontWeight.Bold
            //         - Text(bio) dengan color = Color.Gray
        }
    }
}

@Composable
fun Handson1Screen() {
    ProfileCard(name = "John Doe", bio = "Mobile Developer")
}
