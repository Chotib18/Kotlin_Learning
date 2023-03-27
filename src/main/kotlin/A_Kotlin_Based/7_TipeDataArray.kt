package A_Kotlin_Based

/* >>>>>>>Tipe Data Array
- Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
- Tipe data array di Kotlin direpresentasikan dengan kata kunci Array

>> Index di Array dimulai  dari 0
0 = Chotibul
1 = Umam
2 = Chotib

>> Operasi Array
- Size                 => Untuk mendapatkan panjang Array
- get(index)           => Untuk mendapatkan data di posisi index
- [index]              => Untuk mendapatkan data di posisi index
- set(index, value)    => Untuk mengubah data di posisi index
- [index]=value        => Untuk mengubah data di posisi index

>> Array Nullable
- Secara standard data di Array di Kotlin tidak boleh null
- Jika kita butuh membuat Array yang datanya boleh null, kita bisa menggunakan ? (tanda tanya)


 */
fun main() {

    val members: Array<String> = arrayOf("Chotibul", "Umam", "Chotib", "Ganteng")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balance: Array<Int> = arrayOf(10_000, 20_000, 30_000)

//  println(members)
//  println(values)
//  println(balance)

    //mendapatkan panjang array divariable balance
    println(balance.size)

    //mengambil data di posisi index ke 0
    println(members.get(0))
    //mengambil data di posisi index ke 1
    println(members[1])

    //mengambil data di posisi index ke 0,1,2
    println(values[0])
    println(values[1])
    println(values[2])

    ////mengubah data di posisi index ke 2
    members.set(2, "Tampan")
    println(members[2])

    //mengubah data di posisi index ke 3
    members[3] = "Banget"
    println(members[3])


    //Error Array Nullable = arrayof sudah ada nilai datanya, sehingga tidak bisa null atau dihapu
//    val names: Array<String> = arrayOf("Chotibul", "Umam", "Chotib", "Setiawan")
//    names[0] = null
//    println(names[0])

    //Succes Array Nullable = Menggunakan tanda tanya, arrayOfNulls, dan wajib memasukkan panjang index nilai array
    val names: Array<String?> = arrayOfNulls(6)
    names [0] = "Chotibul"
    names.set(1, null)
    names.set(2, "Umam")
    names [3] = null
    names.set(4, "Nanang")

    println(names[4])


}