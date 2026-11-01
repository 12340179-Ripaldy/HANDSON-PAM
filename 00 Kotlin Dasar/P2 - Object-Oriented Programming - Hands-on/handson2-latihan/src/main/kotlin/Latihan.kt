// Hands-on 2: Interface & Data Class
// Tugas: Buat interface Payable dengan fungsi calculateSalary(), lalu implementasikan
// lewat data class Employee. Manfaatkan fitur bawaan data class: toString(), equals(),
// dan copy().

interface Payable {
    fun calculateSalary(): Double
}

data class Employee(val name: String, val baseSalary: Double, val bonus: Double) : Payable {

    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

fun main() {
    val alice = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)
    val bob = alice.copy(name = "Bob")

    println("Gaji ${alice.name}: ${alice.calculateSalary()}")
    println("Gaji ${bob.name}: ${bob.calculateSalary()}")

    val aliceDuplicate = Employee("Alice", baseSalary = 5_000_000.0, bonus = 500_000.0)
    println("alice == aliceDuplicate? ${alice == aliceDuplicate}")

    println(alice)
}
