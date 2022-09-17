// FindAverage2.kt

// Write a Kotlin program to calculate and display the addition and average of three numbers on the console screen.
// Date: Sat, 17 Sep, 2022

// where, num1 = 125, num2 = 316 and num3 = 176

fun findAverage2(){

    val num1 = 125
    val num2 = 316
    val num3 = 176

    // printing values
    println ("First number is : ${num1}")
    println ("Second number is : ${num2}")
    println ("Third number is : ${num3}")

    // compute average
    val average : Double = ((num1.toDouble() + num2.toDouble() + num3.toDouble())/3).toDouble()

    // printing result
    println ("The average of ${num1}, ${num2} and ${num3} is : ${average}")
}

fun main(){

    // calling function
    findAverage2()
}
