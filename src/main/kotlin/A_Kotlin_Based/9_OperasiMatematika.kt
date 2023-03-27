package A_Kotlin_Based

/*>>>>>>>Operasi Matematika
+ = Penjumlahan
- = Pengurangan
* = Perkalian
/ = Pembagian
% = Sisa Bagi

>> Augmented Assignments
a = a + 10 => a += 10
a = a - 10 => a -= 10
a = a * 10 => a *= 10
a = a / 10 => a /= 10
a = a % 10 => a % = 10

>> Unary Operator
++  =>  a = a + 1
--  =>  a = a - 1
+   =>  Positive
-   =>  Negative
!   =>  Boolean Kebalikan
 */

fun main() {
    val result = 10/3
    println(result)

    val result2 = 10.0/3.0
    println(result2)

    val result3 = 10%3
    println(result3)

    val result4 = 10+10/2
    println(result4)


    var total: Int =0

    //Tanpa Augmented Assignments
    val barang1 = 100
    total = total+barang1

    // Dengan Augmented Assignments
    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    //Tanpa Unary Operator
    println(total)

    //Tanpa Unary Operator
    total++ //=> total = total + 1
    println(total)

    val suhu = -18
    println(suhu)

    val sehat = true
    println(!sehat)
}