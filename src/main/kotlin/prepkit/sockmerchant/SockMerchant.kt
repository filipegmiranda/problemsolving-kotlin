package prepkit.sockmerchant

import java.util.*
import kotlin.collections.HashSet

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    require(n in 1..100) {
        "Invalid number of socks to be checked"
    }

    val colorsSet = HashSet<Int>()





    return 0
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine()
            .split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}



