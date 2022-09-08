// Division1.kt

/**
 * Wap to calculate and display the division of two numbers on the console screen.
 * Where, num1 = 225 and num2 = 17
 * Date: Thu, 08 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun divOfTwoNo1(){

    var num1 = 225
    var num2 = 17

    // printing values
    println ("First number is = ${num1}")
    println ("Second number is = ${num2}")

    // calculating division
    var divisionResult : Double = num1.toDouble() / num2.toDouble()

    // printing result
    println ("The division of ${num1} and ${num2} is = ${divisionResult}")
}

fun main (){

    // calling function
    println ("${divOfTwoNo1()}")
}
