package prepkit.countingvalleys

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the countingValleys function below.
/**
 * This problem is based on the exercise https://www.hackerrank.com/challenges/counting-valleys/problem
 * the first parameter `n` is the number of Steps Gary takes
 * the second parameter `s` is the path Gary has taken
 */
fun countingValleys(n: Int, s: String): Int {
    /*
    The solution has a simple runtime analysis of
    O(n), since we have to iterate the array only once and discover
    the array size is n, therefore O(n)
     */
    var level = 0
    var valleys = 0
    for (step in s.toCharArray()) {
        if (step == 'U') {
            if (level < 0 && (level + 1) == 0 ) valleys++
            level++
        } else {
            level--
        }
    }

    return valleys
}


// Sample input:
// 8
// UDDDUDUU
//Expected output is 1
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
