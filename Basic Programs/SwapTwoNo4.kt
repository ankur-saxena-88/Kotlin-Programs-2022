// SwapTwoNo4.kt

/**
 * Wap to swap two numbers using run function.
 * Where, num1 = 100 and num2 = 200
 * Date: Sat, 10 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun swapNumbers4(){

    var num1 = 100
    var num2 = 200

    // values before swapping
    println ("Values before swapping...\n")
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}\n")

    // logic to swap two numbers using run block
    run{
        num1 = num1 + num2
        num2 = num1 - num2
        num1 = num1 - num2
    }

    println ("Values after swapping...\n")
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}\n")
}

fun main(){

    // calling function
    println ("${swapNumbers4()}")
}
