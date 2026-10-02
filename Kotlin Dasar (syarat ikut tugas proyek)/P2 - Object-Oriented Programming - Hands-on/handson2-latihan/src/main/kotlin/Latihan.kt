// Hands-on 2: Interface & Data Class
// Tugas: Buat interface Payable dengan fungsi calculateSalary(), lalu implementasikan
// lewat data class Employee. Manfaatkan fitur bawaan data class: toString(), equals(),
// dan copy().

interface Payable {
    // TODO 1: Deklarasikan fungsi abstrak
    fun calculateSalary(): Double
}

// TODO 2: Jadikan "data class" dan sambungkan ke Payable
data class Employee(val name: String, val baseSalary: Double, val bonus: Double) : Payable {

    // TODO 3: Kembalikan hasil tambah gaji dan bonus
    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

fun main() {
    val alice = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)

    // TODO 4: Gunakan .copy() untuk menduplikat Alice tapi namanya diganti Bob
    val bob = alice.copy(name = "Bob")

    println("Gaji ${alice.name}: ${alice.calculateSalary()}")
    println("Gaji ${bob.name}: ${bob.calculateSalary()}")

    // TODO 5: Buat duplikat identik dari nol
    val aliceDuplicate = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)
    
    // Kotlin akan pintar membandingkan ISI dari data class, bukan posisi memorinya
    println("alice == aliceDuplicate? ${alice == aliceDuplicate}")

    println(alice)
}

// Outpu:
// Gaji Alice: 5500000.0
// Gaji Bob: 5500000.0
// alice == aliceDuplicate? true
// Employee(name=Alice, baseSalary=5000000.0, bonus=500000.0)
