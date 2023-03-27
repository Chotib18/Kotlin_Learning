package A_Kotlin_Based

/*>>>>>>>Operasi Perbandingan
- Operasi perbandingan adalah operasi untuk membandingkan dua buah data
- Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (benar atau salah)
- Jika hasil operasinya adalah benar, maka nilainya adalah true
- Jika hasil operasinya adalah salah, maka nilainya adalah false

>   : Lebih dari
>   : Kurang dari
>=  : Lebih dari sama dengan
<=  : Kurang dari sama dengan
==  : Sama dengan
!=  : Tidak sama dengan


 */
fun main() {
    val a = 100
    val b = 200

    val result: Boolean = a > b
    println(result)

    val result2: Boolean = a < b
    println(result2)

    println(18 >= 18)
    println(18 <= 18)

    println("")

    println("b" < "c")
    println("b" > "c")
    println("b" <= "c")
    println("b" >= "c")
    println("b" == "c")
    println("b" != "c")

    println("")

    println("chotib" > "chotib")
    println("chotib" >= "chotib")
    println("chotib" == "chotib")
    println("chotib" != "chotib")
}