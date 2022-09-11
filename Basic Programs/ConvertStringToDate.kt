// ConvertStringToDate.kt

/**
 * Wap to convert String to Date.
 * Date: Sun, 11 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// convert string to date using predefined formatters

// importing java packages
import java.time.LocalDate
import java.time.format.DateTimeFormatter

// creating main function
fun main(){

    // calling function
    println ("${convertStringDate()}")
}

// creating function
fun convertStringDate(){

    // format y-m-d or YYYY-MM-DD
    val string = "2022-09-11"
    val date = LocalDate.parse (string, DateTimeFormatter.ISO_DATE)

    // printing date
    println ("${date}")
}
