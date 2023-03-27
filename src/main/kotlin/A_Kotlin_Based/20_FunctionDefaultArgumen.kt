package A_Kotlin_Based

/*>>>>>>>Function Default Argument
>> Function Default Parameter
- Di Kotlin, function parameter wajib diisi ketika memanggil function
- Namun kita juga bisa memasukkan nilai default pada parameter, dengan demikian saat memanggil
  function tersebut, kita tidak wajib memasukkan nilai pada parameter nya
- Default parameter ini cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi

 */

fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Chotibul")
    hello("Chotibul", "Umam")
}