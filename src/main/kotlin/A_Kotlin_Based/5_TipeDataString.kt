package A_Kotlin_Based

/* >>>>>>>Tipe Data String
- Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
- Di kotlin, tipe data string direpresentasikan dengan kata kunci String.
- Untuk membuat string di kotlin, kita bisa menggunakan :
    - “ (tanda petik 2) untuk teks satu baris
    - “”” (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris.
- Kadang kita butuh melakukan menggabungkan data String
- Untuk melakukan penggabungan data String, kita bisa menggunakan operator plus (+)


>>Kode String Margin :
- Menggabungkan dari beberapa line menjadi satu line
- Function : .trimMargin()
- Default .trimMargin() akan mencari karakter | (pipe atau garis lurus)
- Akan menghapus semua karakter null sebelum pipe
- Bisa custom karakter lain selain pipe, misal > (kurung tutup siku) atau lainnya
*/

fun main() {
    println("Tanpa String Margin :")
    var firstname: String = "Chotibul"
    var lastname: String = "Umam"
    var fullname: String = firstname+ " "+lastname
    var address: String = """
        Jalan Buntu RT 004 RW 002,
        Kabupaten Cirebon
        Kecamatan Astanajapura
        Provinsi Jawa Barat
        Indonesia
        """
    println(firstname)
    println(lastname)
    println(fullname)
    println(address)

    println("Dengan String Margin :")
    var firstname2: String = "Chotibul"
    var lastname2: String = "Umam"
    var fullname2: String = firstname2+ " "+lastname2
    var address2: String = """
        |Jalan Buntu RT 004 RW 002,
        |Kabupaten Cirebon
        |Kecamatan Astanajapura
        |Provinsi Jawa Barat
        |Indonesia
        """.trimMargin()

    println(firstname2)
    println(lastname2)
    println(fullname2)
    println(address2)
}