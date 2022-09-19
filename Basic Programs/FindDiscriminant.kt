// FindDiscriminant.kt

/**
 * Write a Kotlin program to find the discriminant of the quadratic equation.
 * Where, num1 (x) = 3, num2 (y) = 5 and num3 (z) = 7
 * Formula: disc = (y * y) - 4 * (x * z)
 * Date: Mon, 19 Sep, 2022
 */

fun quadEq(){

    var num1 = 3
    var num2 = 5
    var num3 = 7

    // printing values
    println ("Value of x is : ${num1}")
    println ("Value of y is : ${num2}")
    println ("Value of z is : ${num3}")

    // calculate discriminant
    var discriminant = (num2 * num2) - (4 * num1 * num3)

    // printing result
    println ("The discriminant is : ${discriminant}")
}

fun main(){

    // calling function
    println ("${quadEq()}")
}
