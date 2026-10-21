package com.itera.pam.p3.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Hands-on 3: Product List (lihat slide "P3 - Compose Multiplatform Basics.pdf" hal. 32)
// Tugas: Tampilkan daftar produk (gambar, nama, harga) menggunakan Card + Row + Column.

data class Produk(val nama: String, val harga: String, val warna: Color)

val daftarProdukContoh = listOf(
    Produk("Produk 1", "Rp 100.000", Color(0xFF009688)),
    Produk("Produk 2", "Rp 250.000", Color(0xFF9C27B0)),
    Produk("Produk 3", "Rp 75.000", Color(0xFF4CAF50)),
)

@Composable
fun ProdukItem(produk: Produk) {
    // TODO 1: Bungkus dengan Card(modifier = Modifier.fillMaxWidth().padding(8.dp))
    // TODO 2: Di dalam Card, buat Row(modifier = Modifier.padding(8.dp))
    // TODO 3: Tambahkan kotak warna sbg pengganti gambar produk (belum ada Coil/AsyncImage):
    //         Box(modifier = Modifier.size(80.dp).background(produk.warna))
    // TODO 4: Tambahkan Column(modifier = Modifier.padding(start = 12.dp)) berisi
    //         Text(produk.nama) dan Text(produk.harga, color = Color.Gray)
}

@Composable
fun Handson3Screen() {
    Column {
        daftarProdukContoh.forEach { produk ->
            ProdukItem(produk)
        }
    }
}
