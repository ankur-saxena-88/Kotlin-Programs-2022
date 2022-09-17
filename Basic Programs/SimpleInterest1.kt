// SimpleInterest1.kt

/**
 * Write a Kotlin program to find the simple interest.
 * Date: Sat, 17 Sep, 2022
 * Where, principal = INR 35000, rate = 3% and time = 2 years
 */

// creating function
fun findSimpleInterest1(){

    var principal = 35000
    var rate = 3
    var time = 2

    // printing values
    println ("Principal = INR ${principal}")
    println ("Rate = ${rate} %")
    println ("Time = ${time} years")

    // compute simple interest
    var simpleInterest = (principal * rate * time) / 100
    
    // printing simple interest
    println ("Simple interest is = ${simpleInterest}")
}

// creating main function
fun main(){

    // calling function
    println ("${findSimpleInterest1()}")
}
