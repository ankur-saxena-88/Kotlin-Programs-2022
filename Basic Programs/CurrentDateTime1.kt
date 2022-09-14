// CurrentDateTime1.kt

/**
 * Write a Kotlin program to get current date and time.
 * Date: Wed, 14 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// get current date and time in default format

// importing java package
import java.time.LocalDateTime

fun currentDateTime1 (){

    val current = LocalDateTime.now()

    println ("Current Date and Time is : ${current}")
}

fun main (){

    // calling function
    println ("${currentDateTime1()}")
}
