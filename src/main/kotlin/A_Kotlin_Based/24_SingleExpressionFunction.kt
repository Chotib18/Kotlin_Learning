package A_Kotlin_Based

/*>>>>>>>Single Expression Function
- Kadang kita sering membuat function yang sangat sederhana
- Misal function yang hanya berisikan kode blok sederhana, misal hanya 1 baris
- Jika kita mengalami hal seperti ini, kita bisa mengubahnya menjadi single expression function
- Single expression function adalah deklarasi function hanya dengan 1 baris kode
- Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan)
  setelah deklarasi nama function dan tipe data pengembalian function

 */

fun kaliTiga(a: Int): Int = a * 3

fun Sapa(name: String): Unit = println("Hello $name")

fun main() {
    println(kaliTiga(15))
    Sapa("Chotib")
}