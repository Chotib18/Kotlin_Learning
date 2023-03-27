package A_Kotlin_Based

/*>>>>>>>When Expression
- Selain if expression, untuk melakukan percabangan di Kotlin, kita juga bisa menggunakan When Expression
- When expression sangat sederhana dibandingkan if
- Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable

>> When Penggati sebagai If Else
- Selain pengecekan terhadap variable
- When juga dapat digunakan sebagai pengganti if else
- Untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when

 */

fun main() {
    var nilai = "B"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good Job")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    // When Expression Multiple Option
    when (nilai) {
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf Anda Tidak Lulus")
        }
    }

    //When Expresiion In Array
    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        // else -> println("MAAF ANDA TIDAK LULUS")
        !in nilaiLulus -> println("MAAF ANDA TIDAK LULUS")
    }

    //When Expression is
    val name = "Chotib"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    //When sebagai pengganti if else
    val nilaiUjian = -90
    when{
        nilaiUjian > 100 -> println("Nilai Terlalu Tinggi")
        nilaiUjian > 90 -> println("A")
        nilaiUjian > 80 -> println("B")
        nilaiUjian > 70 -> println("C")
        nilaiUjian > 10 -> println("D")
        else -> println("Nilai Terlalu Rendah")
    }
}