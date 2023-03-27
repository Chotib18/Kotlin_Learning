package A_Kotlin_Based

/*>>>>>>>Operasi Boolean
>> Operator Logika
- Operator logika adalah operator untuk dua buah data boolean
- Hasil dari operator logika adalah boolean lagi

>>Operator Boolean
&& = Dan(and)
|| = Atau(or)
!  = Kebalikan(not)

>> Operasi &&
true && true = true
true && false = false
false && true = false
false && false = false

>> Operasi ||
true || true = true
true || false = true
false || true = true
false || false = false

>> Operasi !
!true = false
!false = true

*/

fun main() {
    val nilaiAbsen = 80
    val nilaiUTS = 70
    val nilaiUAS = 80

    val apakahlulusAbsen = nilaiAbsen > 75
    val apakahlulusUTS = nilaiUTS > 75
    val apakahlulusUAS = nilaiUAS > 75

    val apakahLulus = apakahlulusAbsen && apakahlulusUTS || apakahlulusUAS
    println(apakahLulus)

    val lulus = false
    println(!lulus)

    val tidaklulus = true
    println(!tidaklulus)
}