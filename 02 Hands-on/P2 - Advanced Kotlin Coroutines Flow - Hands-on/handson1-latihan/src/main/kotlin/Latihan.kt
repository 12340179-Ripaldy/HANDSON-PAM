import kotlinx.coroutines.*

// Hands-on 1: Coroutines Dasar
// Tugas: Ambil data dari 2 sumber secara PARALEL menggunakan async/await,
// lalu gabungkan hasilnya. Total waktu eksekusi harus < 2 detik (bukan ~1800ms
// yang akan terjadi jika dijalankan secara sequential).

suspend fun fetchUserProfile(userId: String): String {
    delay(1000) // Simulasi network delay
    return "User: John Doe"
}

suspend fun fetchUserPosts(userId: String): List<String> {
    delay(800) // Simulasi network delay
    return listOf("Post 1", "Post 2", "Post 3")
}

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    // Menjalankan fetchUserProfile dan fetchUserPosts secara PARALEL dengan async
    val profileDeferred = async { fetchUserProfile("user123") }
    val postsDeferred = async { fetchUserPosts("user123") }

    val profile = profileDeferred.await()
    val posts = postsDeferred.await()

    println("Profil: $profile")
    println("Posts: $posts")

    val endTime = System.currentTimeMillis()
    println("Waktu: ${endTime - startTime}ms")
}
