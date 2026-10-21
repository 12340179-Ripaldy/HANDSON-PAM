package com.itera.pam.p5.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// Hands-on 1: NavHost & NavController Dasar
// Tugas: buat 2 layar ("home" dan "detail") yang dihubungkan dengan
// NavHost + NavController — dari Home klik tombol untuk pindah ke Detail,
// dari Detail klik tombol untuk kembali (back stack).

@Composable
fun Handson1Screen() {
    val navController = rememberNavController()

    // TODO 1: Panggil NavHost(navController = navController, startDestination = "home") { ... }
    // TODO 2: Di dalamnya, daftarkan composable("home") { HomeScreen(navController) }
    // TODO 3: Daftarkan juga composable("detail") { DetailScreen(navController) }

    Text(
        "Belum diimplementasikan — lengkapi TODO 1-3 di atas",
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
private fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Home Screen")
        Button(onClick = {
            // TODO 4: Navigasi ke "detail" dengan navController.navigate("detail")
        }) {
            Text("Buka Detail")
        }
    }
}

@Composable
private fun DetailScreen(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Detail Screen")
        Button(onClick = {
            // TODO 5: Kembali ke layar sebelumnya dengan navController.popBackStack()
        }) {
            Text("< Kembali")
        }
    }
}
