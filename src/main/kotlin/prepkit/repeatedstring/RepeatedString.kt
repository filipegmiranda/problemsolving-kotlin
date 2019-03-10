package prepkit.repeatedstring

import java.util.*

/**
 * This problem is based on the exercise: https://www.hackerrank.com/challenges/repeated-string/problem
 *
 * The time complexity is O(n) considering that 'n' is the size of the input String 's'
 *
 * The reason is simple, since we have to look at the input string's characters at least once, meaning, iterating over all of its
 * characters to discover how many times the character 'a' is present
 */
fun repeatedString(s: String, numberToRepeat: Long): Long {
    var count = 0
    for (character in s) if (character == 'a') {
        count ++
    }
    //the multiplier is the number of times the string will happen entirely
    val multiplier: Long  = numberToRepeat / s.length
    val rem =  numberToRepeat.rem(s.length)
    var res = multiplier * count
    for (i in 0 until rem ) {
        if (s[i.toInt()] == 'a') {
            res++
        }
    }
    return res
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val n = scan.nextLine().trim().toLong()
    val result = repeatedString(s, n)
    println(result)
}
