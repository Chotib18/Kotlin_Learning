package A_Kotlin_Based

/*>>>>>>>For Loops
- Dalam bahasa pemrograman, biasanya ada fitur yang bernama perulangan
- Salah satu fitur perulangan di Kotlin adalah for
- For digunakan untuk melakukan perulangan iterasi dari data iterator (Array, Range, dan lain-lain)

 */

fun main() {

    // For Array
    val name = arrayOf("Chotibul", "Umam")
    for (names in name) {
        println(names)
    }

    // For Range
    println("For Range 1 - 100 :")
    for (value in 1..100) {
        println(value)
    }

    println("For Range 100 - 1 dengan kelipatan 5 :")
    for (value in 100 downTo 0 step 5) {
        println(value)
    }
}