// UserDetails1.kt

/**
 * Wap to display your first name, last name, fathers name, mothers name, age, mobile no, email and address on the console screen.
 * Date: Wed, 07 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

// creating function
fun userDetails1(){

    var firstName = "Alex"
    var lastName = "Parker"
    var fatherName = "Matt"
    var motherName = "Alexa"
    var age = 28
    var mobNumber = 9090009090
    var email = "xyz_123@example.com"
    var address1 = "Flat no. 123, Street 303"
    var address2 = "Winnipeg, Canada"

    // printing values
    println ("First name : ${firstName}")
    println ("Last name : ${lastName}")
    println ("Father's name : ${fatherName}")
    println ("Mother's name : ${motherName}")
    println ("Age : ${age}")
    println ("Mobile no : ${mobNumber}")
    println ("Email : ${email}")
    println ("Address :\n${address1}\n${address2}")
}

// creating main function
fun main (){

    // calling function
    println ("${userDetails1 ()}")
}
