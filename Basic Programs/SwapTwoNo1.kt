// SwapTwoNo1.kt

/**
 * Wap to swap two numbers using third variable.
 * Where, num1 = 20 and num2 = 30
 * Date: Sat, 10 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun main(){

    // calling function
    swapNumbers1()
}

fun swapNumbers1(){

    var num1 : Int = 20
    var num2 : Int = 30

    // values before swapping
    println ("*** Values before swapping ***\n")

    println ("First number is = ${num1}")
    println ("Second number is = ${num2}\n")

    // swap numbers
    var num3 : Int = num1 // num3 = 20
    num1 = num2 // num1 = 30
    num2 = num3 // num2 = 20

    // values after swapping
    println ("*** Values after swapping ***\n")

    println ("First number is = ${num1}")
    println ("Second number is = ${num2}\n")
}
