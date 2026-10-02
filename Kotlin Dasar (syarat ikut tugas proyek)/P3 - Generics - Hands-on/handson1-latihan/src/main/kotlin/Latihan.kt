// Hands-on 1: Generic Class — Box<T>
// Tugas: Lengkapi class generik Box<T> yang menyimpan satu nilai bertipe T,
// lalu tambahkan fungsi map<R> yang mengubah isi Box menjadi Box<R> baru
// menggunakan fungsi transformasi, tanpa mengubah Box aslinya.

class Box<T>(val value: T) {
   // TODO 1: Menambahkan fungsi map<R> yang mereturn Box<R> baru
    fun <R> map(transform: (T) -> R): Box<R> {
        return Box(transform(value))
    }
}

fun main() {
    val intBox = Box(23)
    println("intBox.value = ${intBox.value}")

    val cupBox = Box("cup") // Tipe parameter bisa di-infer
    println("cupBox.value = ${cupBox.value}")

    // TODO 2: Menggunakan map (mengubah 23 menjadi tulisan "Angka: 23")
    val stringBox = intBox.map { "Angka: $it" }
    println("stringBox.value = ${stringBox.value}")
    
    // TODO 3: Mengubah tulisan "cup" menjadi angka jumlah hurufnya (3)
    val lengthBox = cupBox.map { it.length }
    println("lengthBox.value = ${lengthBox.value}")
}

// Output:
// intBox.value = 23
// cupBox.value = cup
// stringBox.value = Angka: 23
// lengthBox.value = 3
