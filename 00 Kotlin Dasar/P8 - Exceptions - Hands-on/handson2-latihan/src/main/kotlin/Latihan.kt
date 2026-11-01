// Hands-on 2: Custom Exception & Exception Hierarchy
// Tugas: Buat exception kustom untuk kasus saldo tidak cukup pada rekening
// bank sederhana, lalu tangani exception tersebut secara spesifik.

class InsufficientBalanceException(message: String) : Exception(message)

class BankAccount(private val owner: String, startBalance: Double) {
    var balance: Double = startBalance
        private set

    fun deposit(amount: Double) {
        require(amount > 0) { "Jumlah deposit harus lebih besar dari 0" }
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount > 0) { "Jumlah penarikan harus lebih besar dari 0" }

        if (amount > balance) {
            throw InsufficientBalanceException(
                "Saldo $owner tidak mencukupi: saldo saat ini $balance, jumlah penarikan $amount"
            )
        }
        balance -= amount
    }
}

fun main() {
    val account = BankAccount("Andi", 100_000.0)

    account.deposit(50_000.0)
    println("Saldo setelah deposit: ${account.balance}")

    try {
        account.withdraw(500_000.0)
    } catch (e: InsufficientBalanceException) {
        println("Gagal menarik saldo: ${e.message}")
    }

    account.withdraw(30_000.0)
    println("Saldo akhir: ${account.balance}")
}
