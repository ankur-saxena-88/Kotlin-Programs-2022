// KotlinInterpolation1.kt

/*
Program: Write a Kotlin program to display the following string on the console screen using kotlin interpolation.
Date: Tue, 06 Sep, 2022
@author: ANKUR SAXENA
Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// creating function
fun printString(){

    var name : String = "Ankur Saxena"
    var string : String = "Hi, ${name}!" // kotlin interpolation

    // printing string
    println("${string}")
}

// ctrating main function
fun main (){

    // calling function
    println ("${printString()}")
}
