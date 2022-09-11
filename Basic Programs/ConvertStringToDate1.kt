// ConvertStringToDate1.kt

/**
 * Wap to convert String to Date using pattern formatters.
 * Date: Sun, 11 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// importing java packages
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

// creating function
fun convertStringDate1(){

    val string = "11 September, 2022"
    val formatter = DateTimeFormatter.ofPattern ("d MMMM, yyyy", Locale.ENGLISH)

    val date = LocalDate.parse (string, formatter)

    // printing date
    println ("${date}")
}

// creating main function
fun main(){

    // calling function
    println ("${convertStringDate1()}")
}
