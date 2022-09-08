// Addition1.kt
// Method 1

/**
 * Wap to calculate and display the sum of two numbers on the console screen.
 * Where, num1 = 125 and num2 = 336
 * Date: Wed, 07 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun sum1(){

    var num1 = 125
    var num2 = 336

    // printing values
    println ("First number is = ${num1}")
    println ("Second number is = ${num2}")

    // calculating sum and printing result
    println ("The sum of ${num1} an ${num2} is = ${num1 + num2}")
}

fun main(){

    // calling function
    println ("${sum1()}")
}
