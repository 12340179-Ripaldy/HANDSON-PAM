package com.itera.pam.p7.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itera.pam.p7.db.AppDatabase

private const val KEY_JUMLAH_DIBUKA = "jumlah_dibuka"

@Composable
fun Handson1Screen(database: AppDatabase) {
    var jumlah by remember { mutableStateOf(0L) }

    LaunchedEffect(Unit) {
        val nilaiLama = database.preferensiQueries.selectByKey(KEY_JUMLAH_DIBUKA)
            .executeAsOneOrNull()?.prefValue?.toLongOrNull() ?: 0L
        val nilaiBaru = nilaiLama + 1
        database.preferensiQueries.upsert(KEY_JUMLAH_DIBUKA, nilaiBaru.toString())
        jumlah = nilaiBaru
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 1: Preferensi Sederhana")
        Text("Aplikasi ini sudah dibuka: $jumlah kali")
    }
}
