// MultiString1.kt

/**
 * Program: Write a program to display following multiline string on the console screen:
    
    Happy Birthday, Rover!
    You are now 10 years old!

 * Date: Mon, 05 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// creating function
fun multiString1(){

    var name = "Rover"
    var age = 10

    var firstString = "Happy Birthday, ${name}!"
    var secondString = "You are now ${age} years old!"

    // printing string
    println ("${firstString}")
    println ("${secondString}")
}

// creating main function
fun main(){

    // calling function
    println ("${multiString1()}")
}
