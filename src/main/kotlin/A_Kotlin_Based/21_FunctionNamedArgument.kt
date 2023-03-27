package A_Kotlin_Based

/*>>>>>>>Function Named Argument
- Kadang ada function yang parameternya banyak sekali
- Hal ini sangat menyulitkan saat kita akan memanggil function tersebut,
  kita harus benar-benar tahu urutan parameter di function tersebut
- Untungnya kotlin memiliki fitur yang namanya Named Argument
- Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter
  saat memanggil function, dengan demikian kita tidak wajib tahu posisi tiap parameter

 */
fun fullname(
    firstname: String,
    middlename: String,
    lastname: String
) {
    println("Hello $firstname $middlename $lastname")
}

fun main() {
    //default argument
    fullname("Chotibul", "Umam", "Nanang")
    //named argument
    fullname(
        lastname = "Nanang",
        firstname = "Chotibul",
        middlename = "Umam"
    )
}