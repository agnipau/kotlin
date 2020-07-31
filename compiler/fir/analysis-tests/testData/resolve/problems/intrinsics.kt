annotation class Ann(
    val p1: Int,
    val p2: Short,
    val p3: Byte,
    val p4: Int,
    val p5: Int,
    val p6: Int
)

val prop1: Int = 1 or 1
val prop2: Short = 1 and 1
val prop3: Byte = 1 xor 1
val prop4: Int = 1 shl 1
val prop5: Int = 1 shr 1
val prop6: Int = 1 ushr 1

@Ann(1 or 1, 1 and 1, 1 xor 1, 1 shl 1, 1 shr 1, 1 ushr 1) class MyClass
