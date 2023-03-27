package A_Kotlin_Based

/*>>>>>>>If Expression
- Dalam Kotlin, if adalah salah satu kata kunci yang digunakan untuk percabangan
- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
- Hampir di semua bahasa pemrograman mendukung if expression
    if (kondisi boolean){
        -jika kondisi bernilai true
        -maka isi blok if akan dieksekusi
    }

>> Else Expression
- Blok if akan dieksekusi ketika kondisi if bernilai true
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
- Hal ini bisa dilakukan menggunakan else expression
    if (kondisi boolean){
        -jika kondisi bernilai true
        -maka isi blok if akan dieksekusi
    } else {
        -jika kondisi bernilai false
        -maka isi blok else akan dieksekusi
    }
>> Else If Expression
- Kadang dalam If, kita butuh membuat beberapa kondisi
- Kasus seperti ini, di Kotlin kita bisa menggunakan Else If expression
    if (kondisi boolean 1) {
        -jika kondisi 1 bernilai true
    } else if (kondisi boolean 2) {
        -jika kondisi 2 bernilai true
    } else {
        -jika kondisi bernilai false
    }

 */

fun main() {
    val nilai = 95

    if (nilai > 100) {
        println("Nilai Terlali Tinggi")
    } else if (nilai > 90) {
        println("A")
    } else if (nilai > 80) {
        println("B")
    } else if (nilai > 70 ){
        println("C")
    } else if (nilai > 10 ){
        println("D")
    } else {
        println("Nilai Terlalu Rendah")
    }
}
