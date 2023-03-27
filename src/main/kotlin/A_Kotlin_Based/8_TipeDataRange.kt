package A_Kotlin_Based

/*>>>>>>>Tipe Data Range
- Kadang kita ingin membuat array yang berisi data yang angka berurutan
- Membuat array dengan jumlah data sedikit mungkin mudah, tapi bagaimana jika data angka yang berurutannya sangat banyak, misal dari 1 sampai 1000
- Kotlin mendukung tipe data range, yang digunakan untuk kebutuhan seperti ini
- Cara membuat range di Kotlin sangat mudah cukup menggunakan tanda .. (titik dua kali) :
  => 0..10 : Range dari 0 sampai 10
  => 1..100 : Range dari 1 sampai 100
- Untuk membuat range terbalik, kita gunakan function "downTo"
  => 10 downTo 0 : Range dari 10 sampai 0
  => 100 downTo 1 : Range dari 100 sampai 1
- Untuk melakukan kelipatan, kita tambahkan function "step"
  => 1..100 step 5
  => 100 downTo 1 step 5

>> Operasi Array
- count()         => Untuk mendapatkan total data dirange
- contains(value) => Untuk mengecek apakah terdapat value tersebut
- first           => Untuk mendapatkan value pertama
- last            => Untuk mendapatkan value terakhir
- step            => Untuk mendapatkan value tiap kelipatan

 */

fun main() {
//    val range = 1..100
    val range = 100 downTo 1 step 2
    println(range.count())
    println(range.contains(18))
    println(range.contains(118))
    println(range.first)
    println(range.last)
    println(range.step)
}