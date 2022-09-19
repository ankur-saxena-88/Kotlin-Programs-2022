// FindGrossSalary1.kt

/**
 * Write a Kotlin program to calculate the gross salary of an employee.
 * Where, basic salary = INR. 75000, Hra = 40%, Da = 20% and Ta = 25%
 * Formula: Gross salary = basic salary + Hra + Da + Ta
 * Date: Mon, 19 Sep, 2022
 */

// creating function
fun findGrossSalary1(){

    var basicSalary : Int = 75000
    var hra : Int = 40
    var da : Int = 20
    var ta : Int = 25

    // calculate hra
    var calcHra : Float = basicSalary.toFloat() * (hra.toFloat() / 100)

    // calculate da
    var calcDa : Float = basicSalary.toFloat() * (da.toFloat() / 100)

    // calculate ta
    var calcTa : Float = basicSalary.toFloat() * (ta.toFloat() / 100)

    // printing values
    println ("Basic salary = INR. ${basicSalary}")
    println ("HRA = ${hra}%")
    println ("DA = ${da}%")
    println ("TA = ${ta}%")

    // calculate gross salary
    var grossSalary : Float = basicSalary.toFloat() + calcHra + calcDa + calcTa

    // printing gross salary
    println ("Gross salary = INR. ${grossSalary}")
}

// creating main function
fun main(){

    // calling function
    println ("${findGrossSalary1()}")
}
