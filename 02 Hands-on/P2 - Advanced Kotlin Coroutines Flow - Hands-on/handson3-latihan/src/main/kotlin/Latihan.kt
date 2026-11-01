import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Hands-on 3: StateFlow untuk Counter
// Tugas: Implementasikan counter sederhana menggunakan StateFlow.
// Counter harus bisa increment, decrement, dan reset.

class CounterManager {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count.asStateFlow()

    fun increment() {
        _count.value++
    }

    fun decrement() {
        if (_count.value > 0) {
            _count.value--
        }
    }

    fun reset() {
        _count.value = 0
    }
}

fun main() = runBlocking {
    val counter = CounterManager()

    // Collect di background
    val job = launch {
        counter.count.collect { println("Count: $it") }
    }

    delay(100)
    counter.increment() // Count: 1
    delay(100)
    counter.increment() // Count: 2
    delay(100)
    counter.decrement() // Count: 1
    delay(100)
    counter.reset()     // Count: 0
    delay(100)

    job.cancel()
}
