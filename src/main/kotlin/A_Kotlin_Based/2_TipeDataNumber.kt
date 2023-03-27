package A_Kotlin_Based

/* >>>>>>>Tipe Data Number
Integer Number (Bilangan BUlat)
===============================
Type:Byte || Size:8bits || Min Value:-128 || Max Value:127
Type:Short || Size:16bits || Min Value:-32768 || Max Value:32767
Type:Int || Size:32bits || Min Value:-2,147,483,648 (-2pkt31) || Max Value:2,147,483,647 (2pkt31 - 1) ********
Type:Long || Size:64bits || Min Value:
-9,223,372,036,854,775,808 (-2pkt63) || Max Value:9,223,372,036,854,775,807 (2pkt63 - 1)

Floating Point Number (Bilangan Desimal)
=======================================
Type:Float || Size:32bits || Significant bits:24 || Exponent bits:8 || Decimal digits:6-7
Type:Double || Size:64bits || Significant bits:53 || Exponent bits:11 || Decimal digits:15-16 ********

 */

fun main() {

    println("Integer Number :")
    var umur: Byte = 18
    println(umur)

    var jarak: Short = 2000
    println(jarak)

    var tinggi: Int = 170
    println(tinggi)

    var saldo: Long = 100000000L //(Diakhiri L untuk menandakan Type Long, Jika tidak maka dianggap Int)
    println(saldo)

    println("Floating Point Number :")
    var nilai: Float = 85.18F //(Diakhiri F untuk menandakan Type Float, Jika tidak maka dianggap Double)
    println(nilai)

    var radius: Double = 85.18
    println(radius)

    println("Literals :")
    var decimal_literal : Int = 100
    println(decimal_literal)

    var hexadecimal_literal : Int = 0xFF
    println(hexadecimal_literal)

    var binary_literal : Int = 0b0001
    println(binary_literal)

    println("Conversion :")
    var nilai_default : Int = 1800
    println("Nilai Default = " +nilai_default)

    var Con_Byte: Byte = nilai_default.toByte()
    println("Int to Byte = " +Con_Byte)

    var Con_Short: Short = nilai_default.toShort()
    println("Int to Short = " +Con_Short)

    var Con_Int: Int = nilai_default.toInt()
    println("Int to Int = " +Con_Int)

    var Con_Long: Long = nilai_default.toLong()
    println("Int to Long = " +Con_Long)

    var Con_Float: Float = nilai_default.toFloat()
    println("Int to Float = " +Con_Float)

    var Con_Double: Double = nilai_default.toDouble()
    println("Int to Byte = " +Con_Double)

}