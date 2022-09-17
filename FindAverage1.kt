// FindAverage1.kt

// Write a Kotlin program to calculate and display the addition and average of three numbers on the console screen.
// Date: Sat, 17 Sep, 2022

// where, num1 = 25, num2 = 30 and num3 = 46

fun main(){

    // calling function
    findAverage1()
}

fun findAverage1(){

    val num1 = 25
    val num2 = 30
    val num3 = 46

    // compute addition
    val addition = num1 + num2 + num3

    // compute average
    val average : Double = (addition/3).toDouble()

    // printing values
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}")
    println ("Third number is : ${num3}")

    // printing result
    println ("The addition of ${num1}, ${num2} and ${num3} is : ${addition}")
    println ("The average of ${addition} is : ${average}")
}
