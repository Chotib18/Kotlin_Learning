package A_Kotlin_Based

/*>>>>>>>Break & Continue
- Break & continue adalah kata kunci yang bisa digunakan dalam semua perulangan di Kotlin
- Break digunakan untuk menghentikan seluruh perulangan
- Continue adalah digunakan untuk menghentikan perulangan yang berjalan,
  dan langsung melanjutkan ke perulangan selanjutnya
 */

fun main() {

    // Brek
    var i = 0;
    while (true){
        println("Break Me")
        i++
        if (i > 10){
            break
        }
    }

    // Continue
    for (i in 1..100){
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}