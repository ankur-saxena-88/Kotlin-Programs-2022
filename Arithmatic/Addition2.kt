// Addition2.kt
// Method 2

/**
 * Wap to calcuilate and display the sum of two numbers on the console screen.
 * Where, num1 = 125 and num2 = 336
 * Date: Wed, 07 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun sum2(){

    var num1 : Int = 125
    var num2 : Int = 336

    // calculating sum
    var sum : Int = num1 + num2

    // printing values
    println ("First number is = ${num1}")
    println ("Second number is = ${num2}")

    // printing result
    println ("The sum of ${num1} an ${num2} is = ${sum}")
}

fun main(){

    // calling function
    println ("${sum2()}")
}
