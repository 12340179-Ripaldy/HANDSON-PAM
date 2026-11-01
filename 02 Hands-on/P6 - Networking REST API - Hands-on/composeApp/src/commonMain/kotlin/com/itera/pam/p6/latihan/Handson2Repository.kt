package com.itera.pam.p6.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// Hands-on 2: Repository Pattern & Loading State

class UserRepository {
    suspend fun getUsers(): List<RemoteUser> = fetchUsers()
}

sealed class UiState {
    data object Loading : UiState()
    data class Success(val users: List<RemoteUser>) : UiState()
    data class Error(val message: String) : UiState()
}

class UserListStateHolder(
    private val repository: UserRepository = UserRepository()
) {
    private val _state = MutableStateFlow<UiState>(UiState.Loading)
    val state: StateFlow<UiState> = _state.asStateFlow()

    suspend fun load() {
        _state.value = UiState.Loading
        try {
            val users = repository.getUsers()
            _state.value = UiState.Success(users)
        } catch (e: Exception) {
            _state.value = UiState.Error(e.message ?: "Terjadi kesalahan")
        }
    }
}

@Composable
fun Handson2Screen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Hands-on 2: Repository Pattern & Loading State")
        Text("UserListStateHolder.load() berhasil diimplementasikan.")
    }
}
