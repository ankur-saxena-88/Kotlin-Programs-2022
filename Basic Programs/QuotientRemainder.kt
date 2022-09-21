// QuotientRemainder.kt

/**
 * Write a Kotlin program to find quotient and remainder.
 * Where, dividend = 10 and divisor = 3
 * Date: Wed, 21 Sep, 2022
 */

// creating function
fun findQuoRemainder1(){

    var dividend = 10
    var divisor = 3

    // printing values
    println ("The value of dividend is : ${dividend}")
    println ("The value of divisor is : ${divisor}")

    // calculate quotient
    var quotient : Float = dividend.toFloat() / divisor.toFloat()

    // calculate remainder
    var remainder :Float = dividend.toFloat() % divisor.toFloat()

    // printing result
    println ("Quotient : ${quotient}\nRemainder : ${remainder}")
}

// creating main function
fun main(){

    // calling function
    println ("${findQuoRemainder1()}")
}
