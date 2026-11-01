import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// Hands-on 3: Test Lifecycle & Setup dengan @BeforeEach
// Tugas: Lengkapi setUp() supaya setiap test mendapat TodoList yang BARU dan
// KOSONG (tidak saling memengaruhi satu sama lain), lalu lengkapi ketiga test.

class TodoListTest {

    private lateinit var todoList: TodoList

    @BeforeEach
    fun setUp() {
        todoList = TodoList()
    }

    @Test
    @DisplayName("TodoList baru harus kosong")
    fun testNewListIsEmpty() {
        assertTrue(todoList.isEmpty())
    }

    @Test
    @DisplayName("Menambah item menaikkan ukuran list")
    fun testAddIncreasesSize() {
        todoList.add("Belajar Kotlin")
        assertEquals(1, todoList.size())
    }

    @Test
    @DisplayName("Menghapus item mengembalikan true dan mengurangi ukuran")
    fun testRemoveExistingItem() {
        todoList.add("Belajar Kotlin")
        val removed = todoList.remove("Belajar Kotlin")
        assertTrue(removed)
        assertEquals(0, todoList.size())
    }
}
