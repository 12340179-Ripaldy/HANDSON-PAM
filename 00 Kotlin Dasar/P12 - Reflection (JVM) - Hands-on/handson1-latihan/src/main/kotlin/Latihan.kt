import kotlin.reflect.full.memberProperties

// Hands-on 1: Inspeksi Kelas dengan KClass
// Tugas: Gunakan Kotlin Reflection API (KClass) untuk mencetak nama kelas
// dan daftar nama seluruh property milik kelas Product, TANPA menyebut
// nama property-nya secara hardcode (harus lewat reflection).

data class Product(val nama: String, val harga: Int)

fun main() {
    val product = Product("Kopi Susu", 18000)

    val kClass = product::class
    println("Kelas: ${kClass.simpleName}")
    println("Properties:")
    for (prop in kClass.memberProperties) {
        println("- ${prop.name}")
    }
}
