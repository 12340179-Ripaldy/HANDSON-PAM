package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Hands-on 2: State & Recomposition — Counter
// Tugas: Buat counter sederhana dengan tombol tambah (+) dan kurang (-),
// menggunakan remember { mutableStateOf(...) } agar UI otomatis recompose
// setiap kali nilainya berubah.

@Composable
fun Handson2Screen() {
    // TODO 1: Buat state `count` dengan nilai awal 0:
    //         var count by remember { mutableStateOf(0) }
    // (butuh import androidx.compose.runtime.getValue/setValue/mutableStateOf/remember)
    var count by remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 2: Counter")
        Text("Nilai: $count")

        Row {
            Button(onClick = { count++ }) {
                Text("+")
            }
            Button(onClick = { count-- }) {
                Text("-")
            }
        }
    }
}
