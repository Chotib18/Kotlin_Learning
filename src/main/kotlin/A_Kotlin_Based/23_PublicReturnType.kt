package A_Kotlin_Based

/*>>>>>>>Public Return Type
- Seperti yang sudah dibahas sebelumnya, bahwa function itu bisa mengembalikan data dan tidak
- Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data
  kembalian dari function tersebut
- Jika function tersebut kita deklarasikan dengan tipe data pengembalian,
  maka wajib di dalam function nya kita harus mengembalikan data
- Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return,
  diikuti dengan datanya

 */

fun jumlahkan (a:Int, b:Int): Int{
    val total = a + b
    return total
}
fun bagi (a:Int, b:Int): Int{
    if (b == 0){
        return 0
    } else {
        val total = a / b
        return total
    }
}
fun main() {
    println(jumlahkan(78,90))
    println(jumlahkan(15,44))

    val result = jumlahkan(67,53)
    println(result)

    val result2 = jumlahkan(10,1)
    println(result2)

    println(bagi(50,10))
    println(bagi(50,0))
}