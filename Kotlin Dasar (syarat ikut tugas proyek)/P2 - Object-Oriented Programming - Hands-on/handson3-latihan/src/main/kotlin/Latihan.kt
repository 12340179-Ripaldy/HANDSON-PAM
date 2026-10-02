// Hands-on 3: Sealed Class untuk State
// Tugas: Modelkan hasil pemanggilan network sebagai sealed class NetworkResult
// dengan 3 kemungkinan state: Loading, Success (membawa data), dan Error (membawa pesan).

// TODO 1: Jadikan sealed class
sealed class NetworkResult

// TODO 2: Loading tidak bawa data, cukup jadikan object
object Loading : NetworkResult()

// TODO 3: Success membawa data teks
data class Success(val data: String) : NetworkResult()

// TODO 4: Error membawa pesan teks
data class Error(val message: String) : NetworkResult()

fun describe(result: NetworkResult): String {
    // TODO 5: when exhaustive (tanpa perlu 'else')
    return when (result) {
        is Loading -> "Sedang memuat..."
        is Success -> "Berhasil: ${result.data}"
        is Error   -> "Gagal: ${result.message}"
    }
}

fun main() {
    println(describe(Loading))
    println(describe(Success("Data pengguna berhasil diambil")))
    println(describe(Error("Koneksi terputus")))
}

// Output:
// Sedang memuat...
// Berhasil: Data pengguna berhasil diambil
// Gagal: Koneksi terputus

fun main() {
    println(describe(Loading))
    println(describe(Success("Data pengguna berhasil diambil")))
    println(describe(Error("Koneksi terputus")))
}
