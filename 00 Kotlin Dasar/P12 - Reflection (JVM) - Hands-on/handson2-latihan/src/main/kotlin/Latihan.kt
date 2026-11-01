import kotlin.reflect.full.memberProperties

// Hands-on 2: Baca Nilai Property Dinamis
// Tugas: Buat fungsi generik `printFields(obj: Any)` yang mencetak SEMUA
// nama dan nilai property dari objek apapun yang diberikan, mirip seperti
// toString() otomatis — tanpa hardcode nama field satupun.

data class Mahasiswa(val nim: String, val nama: String, val ipk: Double)

fun printFields(obj: Any) {
    val kClass = obj::class
    for (property in kClass.memberProperties) {
        val nilai = property.getter.call(obj)
        println("${property.name} = $nilai")
    }
}

fun main() {
    val mhs = Mahasiswa("122140000", "Budi Santoso", 3.75)
    printFields(mhs)
}
