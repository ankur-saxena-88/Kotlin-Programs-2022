// FindCompoundInterest.kt

/**
 * Write a Kotlin program to find the compound interest.
 * Where, principal = INR. 20000, rate = 10% and time = 3 years
 * Date: Sun, 18 Sep, 2022
 */

// importing kotlin math package
import kotlin.math.pow

fun findCI(){

    var principal = 20000
    var rate = 10
    var time = 3

    // printing values
    println ("Principal = INR. ${principal}")
    println ("Rate = ${rate}%")
    println ("Time = ${time} years")

    // compute compound interest
    var compoundInterest : Float = principal.toFloat() * (1 + rate.toFloat() / 100).pow(time)

    // printing compound interest
    println ("Compound interest is = ${compoundInterest}")
}

fun main(){

    // calling function
    println ("${findCI()}")
}
