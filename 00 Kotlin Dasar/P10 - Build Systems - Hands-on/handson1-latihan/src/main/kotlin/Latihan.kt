import java.util.Properties

// Hands-on 1: Resource & Packaging
// Tugas: Baca file app.properties yang ada di src/main/resources melalui
// classpath (bukan lewat File API biasa), lalu tampilkan isinya.

fun main() {
    val inputStream = object {}.javaClass.classLoader.getResourceAsStream("app.properties")

    val properties = Properties()
    properties.load(inputStream)

    println("Nama aplikasi: ${properties.getProperty("app.name")}")
    println("Versi: ${properties.getProperty("app.version")}")
}
