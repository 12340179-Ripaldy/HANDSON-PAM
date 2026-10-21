// Hands-on 3: Sealed Class untuk State
// Tugas: Modelkan hasil pemanggilan network sebagai sealed class NetworkResult
// dengan 3 kemungkinan state: Loading, Success (membawa data), dan Error (membawa pesan).
//
// CATATAN: File ini belum bisa di-compile sampai kamu melengkapi semua TODO
// di bawah — itu normal untuk latihan ini!

// TODO 1: Ubah menjadi "sealed class NetworkResult" (bukan class biasa).
// Sealed class membatasi semua subclass-nya harus diketahui di compile time,
// sehingga `when` bisa exhaustive tanpa perlu cabang "else".
// sealed class NetworkResult

// TODO 2: Buat NetworkResult.Loading sebagai "object" (tidak butuh data tambahan),
// turunan dari NetworkResult.
// object Loading : NetworkResult()

// TODO 3: Buat NetworkResult.Success sebagai "data class" yang membawa property
// data: String, turunan dari NetworkResult.
// data class Success(val data: String) : NetworkResult()

// TODO 4: Buat NetworkResult.Error sebagai "data class" yang membawa property
// message: String, turunan dari NetworkResult.
// data class Error(val message: String) : NetworkResult()

fun describe(result: NetworkResult): String {
    // TODO 5: Gunakan `when` exhaustive (tanpa "else") untuk menangani ketiga
    // kemungkinan: Loading, Success, Error. Kompiler akan MEMAKSA kamu menangani
    // semuanya begitu Loading/Success/Error sudah jadi subclass NetworkResult.
    return when (result) {
        is Loading -> "Sedang memuat..."
        is Success -> "Berhasil: ${result.data}"
        is Error -> "Gagal: ${result.message}"
    }
}

fun main() {
    println(describe(Loading))
    println(describe(Success("Data pengguna berhasil diambil")))
    println(describe(Error("Koneksi terputus")))
}
