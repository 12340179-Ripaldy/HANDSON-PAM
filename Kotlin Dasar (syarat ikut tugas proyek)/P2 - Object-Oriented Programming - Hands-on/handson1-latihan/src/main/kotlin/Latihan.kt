// Hands-on 1: Class & Inheritance
// Tugas: Buat hierarki class kendaraan menggunakan open class, primary constructor,
// dan override fungsi. Vehicle adalah base class, Car dan Motorcycle adalah turunannya.

// TODO 1: Tambahkan 'open'
open class Vehicle(val name: String, val maxSpeed: Int) {

    // TODO 2: Tambahkan 'open'
    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

// TODO 3: Buat class Car turunannya
class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {
    override fun describe(): String {
        return super.describe() + " dan punya $numberOfDoors pintu"
    }
}

// TODO 4: Buat class Motorcycle turunannya
class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {
    override fun describe(): String {
        val sidecarText = if (hasSidecar) "dengan sidecar" else "tanpa sidecar"
        return super.describe() + " ($sidecarText)"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        // TODO 5: Masukkan instance-nya ke list ini
        Car("Toyota", 4),
        Motorcycle("Ninja", false)
    )

    // Output otomatis mengikuti masing-masing anak!
    vehicles.forEach { println(it.describe()) }
}

// Output:
// Toyota dapat melaju hingga 180 km/h dan punya 4 pintu
// Ninja dapat melaju hingga 220 km/h (tanpa sidecar)
