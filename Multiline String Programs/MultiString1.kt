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
fun multiString(){

    println ("Happy Birthday, Rover!\nYou are now 10 years old!\n")
}

// creating main function
fun main(){

    // calling function
    // multiString() // direct call
    // println (multiString()) // using println() command
    println ("${multiString()}") // using kotlin interpolation
}
