// SwapTwoNo2.kt

/**
 * Wap to swap two numbers using + and - operators.
 * Where, num1 = 126 and num2 = 336
 * Date: Sat, 10 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun swapNumbers2(){

    var num1 = 126
    var num2 = 336

    // values before swapping
    println ("Values before swapping...\n")

    println ("First number is : ${num1}")
    println ("Second number is : ${num2}\n")

    // swap numbers
    num1 = num1 + num2 // num1 = 126 + 336 = 462
    num2 = num1 - num2 // num2 = 462 - 336 = 126
    num1 = num1 - num2 // num1 = 462 - 126 = 336

    // values after swappung
    println ("Values after swapping...\n")

    println ("First number is : ${num1}")
    println ("Second number is : ${num2}")
}

fun main(){

    // calling function
    println ("${swapNumbers2()}")
}
