// Hands-on 2: Control Flow — when sebagai Expression
// Tugas: Lengkapi fungsi gradeOf() yang mengembalikan huruf mutu berdasarkan
// nilai ujian (0-100), menggunakan `when` sebagai EXPRESSION (bukan statement),
// sebagai single-expression function.
//
// Aturan:
//   90-100 -> "A"
//   80-89  -> "B"
//   70-79  -> "C"
//   60-69  -> "D"
//   selain itu -> "E"

fun gradeOf(nilai: Int): String {
    // TODO: Ganti baris TODO() di bawah ini menjadi single-expression function:
    //   fun gradeOf(nilai: Int): String = when (nilai) {
    //       in 90..100 -> "A"
    //       ...
    //       else -> "E"
    //   }
    TODO("Implementasikan klasifikasi nilai menggunakan when expression")
}

fun main() {
    val nilaiMahasiswa = listOf(95, 82, 71, 60, 45)
    for (nilai in nilaiMahasiswa) {
        println("Nilai $nilai -> Grade ${gradeOf(nilai)}")
    }
}
