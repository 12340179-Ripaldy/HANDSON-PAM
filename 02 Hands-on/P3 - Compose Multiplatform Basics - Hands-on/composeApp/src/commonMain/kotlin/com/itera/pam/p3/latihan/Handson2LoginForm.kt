package com.itera.pam.p3.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Hands-on 2: Login Form (lihat slide "P3 - Compose Multiplatform Basics.pdf" hal. 31)
// Tugas: Buat form login dengan username, password, dan tombol login.

@Composable
fun LoginForm(onLogin: (String, String) -> Unit) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TODO 1: Text judul "Login"
        // TODO 2: OutlinedTextField untuk username:
        //         value = username, onValueChange = { username = it }, label = { Text("Username") }
        // TODO 3: OutlinedTextField untuk password, tambahkan:
        //         visualTransformation = PasswordVisualTransformation()
        //         (butuh import androidx.compose.ui.text.input.PasswordVisualTransformation)
        // TODO 4: Button "Login" dengan onClick = { onLogin(username, password) }
    }
}

@Composable
fun Handson2Screen() {
    LoginForm(onLogin = { _, _ -> })
}
