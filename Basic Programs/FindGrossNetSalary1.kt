// FindGrossNetSalary1.kt

/**
 * Write a Kotlin program to calculate the gross salary and net salary of an employee.
 * Where, basic salary = INR. 70000, Hra = 30%, Da = 25% Pf = 30% and Lta = 20%
 * Formula: Gross salary = basic salary + Hra + Da + Lta
 * Fromula: Net salary = Gross salary - Pf
 * Date: Tue, 20 Sep, 2022
 */

// creating function
fun netSalary1(){

    var basicSalary = 70000
    var hra = 30
    var da = 25
    var pf = 30
    var lta = 20

    // calculate hra
    var calcHra :Float = basicSalary.toFloat() * (hra.toFloat() / 100)

    // calculate da
    var calcDa :Float = basicSalary.toFloat() * (da.toFloat() / 100)

    // calculate pf
    var calcPf :Float = basicSalary.toFloat() * (pf.toFloat() / 100)

    // calculate lta
    var calcLta :Float = basicSalary.toFloat() * (lta.toFloat() / 100)

    // calculate gross salary
    var grossSalary : Float = basicSalary.toFloat() + calcHra + calcDa + calcLta

    // printing values
    println ("Basic Salary is = INR. ${basicSalary}")
    println ("HRA = ${hra}%")
    println ("DA = ${da}%")
    println ("PF = ${pf}%")
    println ("LTA = ${lta}%")

    // printing gross salary
    println ("Gross Salary is = INR. ${grossSalary}")

    // calculate net salary
    var netSalary :Float = grossSalary - calcPf

    // printing net salary
    println ("Net Salary is = INR. ${netSalary}")
}

// creating main function
fun main(){

    // calling function
    println ("${netSalary1()}")
}
