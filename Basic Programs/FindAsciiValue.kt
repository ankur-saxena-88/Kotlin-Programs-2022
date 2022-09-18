// FindAsciiValue.kt

/**
 * Write a kotlin program to find the ASCII value of a character.
 * Where, character = 'c'
 * Date: Sun, 18 Sep, 2022
 */

// creating function
fun findAsciiValue(){

    val character1 = 'c'
    val asciiValue = character1.code

    // printing ascii value
    println ("The ASCII value of ${character1} is : ${asciiValue}")
}

// creating main function
fun main(){

    // calling function
    println ("${findAsciiValue()}")
}
