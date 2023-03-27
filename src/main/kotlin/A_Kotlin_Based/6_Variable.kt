package A_Kotlin_Based

/* >>>>>>>Variable
- Variable adalah tempat untuk menyimpan data
- Kotlin mendukung 2 jenis variabel; Mutable (bisa diubah) dan Immutable (tidak bisa diubah).
- Untuk membuat variable Mutable, di kotlin bisa menggunakan kata kunci var
- Untuk membuat variable Immutable, di kotlin bisa menggunakan kata kunci val
- Deklarasi Variabel : "val/var namaVariable : TipeData = Data"
- Direkomendasikan menggunakan Immutable dibanding Mutable data

>>Nullable
- Secara standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilai nya
- Jika saat membuat variable, tidak diberi nilai, maka akan error
- Kotlin mendukung variable yang boleh null (tidak memiliki data)
- Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable bisa null
- Untuk membuat variable bisa bernilai null, di Kotlin bisa menggunakan ? (tanda tanya) setelah tipe datanya.
- Penggunaan  fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode Java

>>Variable Constant
- Constant adalah Immutable data, yang biasanya diakses untuk keperluan global.
- Global artinya bisa diakses dimanapun
- Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constant nya

 */


fun main() {

    // Variabel Mutable
    var firstName: String = "Chotibul"
    var lastName = "Umam"

    //Mengubah Variable
    lastName = "Chotibul Umam"

    println(firstName)
    println(lastName)

    // Variabel Immutable
    val firstName1: String ="Chotibul"
    val lastName1 = "Umam"

    // error jika merubah data variabel
    //> lastName1 = "Chotibul Umam"

    println(firstName1)
    println(lastName1)

    //Contoh Nullabel
    var firstName3: String? = "Chotibul"
    firstName3 = null

    //error karena firstName3 bisa null
    //> println(firstName3.length)

    //cara mengakses yang benar
    println(firstName3?.length)

    println("Welcome to $APPLICATION Verison : $VERSION")
}

const val APPLICATION = "Kotlin App"
const val VERSION = "0.0.1"