fun main() {
    val aInt: Int = 0;
    val anotherInt = 0;

    val aByte: Byte = 0
    val aShort: Short = 0

    val aLong: Long = 0
    val inferredInt = 10
    val inferredLong = 1000000

    val anotherLong = 10L
    val unsignedInt: UInt = 0U
    val unsignedLong = 0UL

    val aDouble: Double = 5.5
    val aFloat: Float = 5.5f

    val inferredDouble = 5.5
    val inferredFloat = 5.5F

    println(5 == 4)
    println(10f > 1)
    println(10.1 <= 5.2)

    println(10.5.toInt())
    10.9.toFloat()
    println(100_000_000.toByte())
}