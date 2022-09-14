// CurrentDateTime2.kt

/**
 * Write a Kotlin program to get current date and time with pattern.
 * Date: Wed, 14 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// get current date and time with pattern

// importing java packages
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun currentDateTime2 (){

    val current = LocalDateTime.now()

    // val formatter =DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm:ss.SSS")

    // format dd-MM-YYYY HH:mm
    val formatter = DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm")
    val formatted = current.format(formatter)

    // printing current date and time
    println ("Current Date and Time is : ${formatted}")
}

fun main (){

    // calling function
    println ("${currentDateTime2()}")
}
