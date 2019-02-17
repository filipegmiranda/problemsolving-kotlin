package prepkit.sockmerchant

import java.util.*
import kotlin.collections.HashSet


/**
 * From the exercise https://www.hackerrank.com/challenges/sock-merchant/problem
 *
 *
 * This solution has the running time of O(n) on average
 *
 * and O(n log n) in the worst case "theoretically" for types other than Int(in Java 8, because hash collisions are handles with a Red Black Tree),
 * since the running time of remove could degrade
 * to log * n
 *
 * We have to iterate over the array and see all elements, which is then n = O(n)
 * Then we have to check if it is in the Set, by calling remove, which is O(1) or worst case O(log n)
 *
 * That means n*log*n or O(n log n)
 *
 */
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    require(n in 1..100) {
        "Invalid number of socks to be checked"
    }
    val colorsSet = HashSet<Int>()
    var pairs: Int = 0

    for (color in ar) {
        if (!colorsSet.remove(color)) {
            colorsSet.add(color)
        } else {
            pairs++
        }
    }
    return pairs
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().trim()
            .split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}



