// Hands-on 2: Lambda vs Function Reference
// Tugas: Punya list nama mahasiswa. Buat pipeline yang menyaring nama
// dengan panjang genap, lalu ubah semua jadi UPPERCASE — sekali menggunakan
// lambda, sekali lagi menggunakan function reference (::namaFungsi).
// Hasil kedua pipeline harus SAMA.

fun isEvenLength(s: String): Boolean = s.length % 2 == 0

fun toUpper(s: String): String = s.uppercase()

fun main() {
    val mahasiswa = listOf("Andi", "Budi", "Citra", "Dewi", "Eka", "Fajar")

    // TODO 1: Buat `hasilLambda` dengan memfilter mahasiswa yang panjang
    // namanya genap (pakai lambda `{ it.length % 2 == 0 }`), lalu map ke
    // uppercase (pakai lambda `{ it.uppercase() }`).
    val hasilLambda: List<String> = mahasiswa
        .filter { it.length % 2 == 0 }
        .map { it.uppercase() }

    // TODO 2: Buat `hasilReference` dengan hasil YANG SAMA, tapi filter dan
    // map harus memakai function reference: ::isEvenLength dan ::toUpper.
    val hasilReference: List<String> = mahasiswa
        .filter(::isEvenLength)
        .map(::toUpper)

    println("Lambda   : $hasilLambda")
    println("Reference: $hasilReference")
    println("Sama? ${hasilLambda == hasilReference}")
}

// Output:
// Lambda   : [ANDI, BUDI, DEWI]
// Reference: [ANDI, BUDI, DEWI]
// Sama? true
