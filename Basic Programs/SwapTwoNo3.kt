// SwapTwoNo3.kt

/**
 * Wap to swap two numbers using * and / operator.
 * Where, num1 = 2 and num2 = 5
 * Date: Sat, 10 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun swapNumbers3(){

    var num1 = 2
    var num2 = 5
    
    // values before swapping
    println ("Values before swapping...\n")
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}\n")

    // swap numbers
    num1 = num1 * num2 // num1 = 2 * 5 = 10
    num2 = num1 / num2 // num2 = 10 / 5 = 2
    num1 = num1 / num2 // num1 = 10 / 2 = 5

    // values after swapping
    println ("Values after swapping...\n")
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}\n")
}

fun main(){

    // calling function
    println ("${swapNumbers3()}")
}
