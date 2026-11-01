import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

// Hands-on 2: Testing Exception
// Tugas: Lengkapi test untuk BankAccount, termasuk kasus withdraw() yang
// melempar InsufficientFundsException saat saldo tidak cukup.

class BankAccountTest {

    @Test
    @DisplayName("Deposit menambah saldo dengan benar")
    fun testDeposit() {
        val account = BankAccount(100.0)
        account.deposit(50.0)
        assertEquals(150.0, account.balance)
    }

    @Test
    @DisplayName("Withdraw mengurangi saldo saat saldo cukup")
    fun testWithdrawSufficientBalance() {
        val account = BankAccount(100.0)
        account.withdraw(40.0)
        assertEquals(60.0, account.balance)
    }

    @Test
    @DisplayName("Withdraw melempar InsufficientFundsException saat saldo tidak cukup")
    fun testWithdrawInsufficientBalance() {
        val account = BankAccount(50.0)
        assertThrows<InsufficientFundsException> {
            account.withdraw(100.0)
        }
    }
}
