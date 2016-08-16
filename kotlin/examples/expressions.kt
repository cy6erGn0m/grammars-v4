fun f() = 1

fun f2() {
}

fun f3(): Int {
    return 1
}

fun fwp(p: Int): Int = 1

fun call() = fwp(0) + fwp(p = 1)
fun fn_int() = 1 + 1
fun fn_boolean() = true && false
fun float() = 1.0 + 1.0

fun inListAndRange() = 1 in listOf(1, 2, 3) && 1 in 1..3

