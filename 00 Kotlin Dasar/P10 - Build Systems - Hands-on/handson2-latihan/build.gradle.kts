// Hands-on 2: Custom Gradle Task
// Tugas: Lengkapi custom task "printProjectInfo" di bawah ini supaya saat
// dijalankan (./gradlew :handson2-latihan:printProjectInfo) task tersebut
// mencetak nama project, versi project, dan versi Gradle yang dipakai.

version = "1.0.0"

tasks.register("printProjectInfo") {
    group = "kotlin dasar"
    description = "Mencetak nama project, versi project, dan versi Gradle"

    doLast {
        println("Nama project: " + project.name)
        println("Versi project: " + project.version)
        println("Versi Gradle: " + gradle.gradleVersion)
    }
}
