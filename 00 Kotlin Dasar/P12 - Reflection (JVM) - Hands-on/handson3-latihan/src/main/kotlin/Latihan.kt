import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.jvm.javaField

// Hands-on 3: Custom Annotation + Reflection Validator
// Tugas: Buat annotation class @Required, lalu fungsi validate(obj) yang
// mengecek semua property beranotasi @Required tidak boleh null atau
// String kosong/blank. Kembalikan daftar NAMA FIELD yang gagal validasi.

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Required

data class RegistrasiForm(
    @Required val nama: String,
    @Required val email: String,
    val alamat: String? // opsional, tidak wajib diisi
)

fun validate(obj: Any): List<String> {
    val gagal = mutableListOf<String>()

    for (property in obj::class.memberProperties) {
        val isRequired = property.findAnnotation<Required>() != null ||
            property.javaField?.getAnnotation(Required::class.java) != null

        if (isRequired) {
            val nilai = property.getter.call(obj)
            if (nilai == null || (nilai is String && nilai.isBlank())) {
                gagal.add(property.name)
            }
        }
    }

    return gagal
}

fun main() {
    val formValid = RegistrasiForm("Siti", "siti@mail.com", null)
    println("Form valid -> gagal: ${validate(formValid)}") // gagal: []

    val formInvalid = RegistrasiForm("", "budi@mail.com", "Jl. Merdeka")
    println("Form invalid -> gagal: ${validate(formInvalid)}") // gagal: [nama]
}
