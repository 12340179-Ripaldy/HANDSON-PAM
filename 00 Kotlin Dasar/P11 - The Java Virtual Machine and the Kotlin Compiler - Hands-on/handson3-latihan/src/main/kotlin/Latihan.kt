// Hands-on 3: companion object & @JvmStatic

class Greeter {
    companion object {
        @JvmStatic
        fun greet(name: String): String {
            return "Halo, $name!"
        }
    }
}

fun main() {
    println(Greeter.greet("Mahasiswa"))

    val staticMethodNames = Greeter::class.java.methods.map { it.name }
    println("Method pada Greeter.class: $staticMethodNames")

    val punyaStaticGreet = staticMethodNames.contains("greet")
    println("Greeter.class punya static method 'greet'? $punyaStaticGreet")

    check(punyaStaticGreet) {
        "greet() belum jadi static method di Greeter.class — tambahkan @JvmStatic!"
    }
}
