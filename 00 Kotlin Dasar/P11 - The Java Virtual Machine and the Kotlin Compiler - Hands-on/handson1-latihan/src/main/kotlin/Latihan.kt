// Hands-on 1: Inline Function & Reified Generics
// Tugas: Lengkapi fungsi isType() di bawah agar bisa mengecek tipe value pada
// runtime.

inline fun <reified T> isType(value: Any): Boolean {
    return value is T
}

fun main() {
    println(isType<String>("Hello"))   // harus mencetak: true
    println(isType<Int>("Hello"))      // harus mencetak: false
    println(isType<String>(123))       // harus mencetak: false

    // Jawaban diskusi:
    // Tanpa inline + reified, parameter tipe T dihapus saat kompilasi (type erasure)
    // pada JVM bytecode sehingga tipe T tidak lagi diketahui saat runtime.
    // Dengan inline + reified, body fungsi disalin langsung ke lokasi pemanggilan
    // dan tipe T diganti dengan tipe konkretnya sebelum kompilasi selesai.
}
