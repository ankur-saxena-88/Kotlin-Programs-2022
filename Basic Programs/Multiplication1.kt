// Multiplication1.kt

/**
 * Wap to calculate and display the multiplication of two numbers on the console screen.
 * Where, num1 = 12 and num2 = 15
 * Date: Thu, 08 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun multiply1(){

    var num1 : Int = 12
    var num2 : Int = 15

    // calculating multiplication
    var result : Int = num1 * num2

    // printing values
    println ("First number is = ${num1}")
    println ("Second number is = ${num2}")

    // printing result
    println ("The multiplication of ${num1} and ${num2} is = ${result}")
}

fun main(){

    // calling function
    println ("${multiply1()}")
}
