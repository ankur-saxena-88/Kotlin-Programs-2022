// Subtraction1.kt

/**
 * Wap to calculate and display the subtraction of two numbers on the console screen.
 * Where, num1 = 156 and num2 = 69
 * Date: Wed, 08 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun subtraction1(){

    var num1 : Int = 156
    var num2 : Int = 69

    // printing values
    println ("First number is = ${num1}")
    println ("Second number is = ${num2}")

    // calculating subtraction
    var subtract : Int = num1 - num2

    // printing result
    println ("The subtraction of ${num1} and ${num2} is = ${subtract}")
}

fun main (){

    // calling function
    println ("${subtraction1()}")
}
