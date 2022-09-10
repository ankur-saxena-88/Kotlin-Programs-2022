/**
 * Wap to display the multiplication table of 15 on the console screen.
 * Date: Sat, 10 Sep, 2022
 * @author: ANKUR SAXENA
 * Platform: Linux Ubuntu 22.04/Lts/x64/Kotlin 1.7.10/VS Code
 */

fun multiTable1(){

    var num : Int = 15

    println ("The multiplication table of ${num} is given below:\n")

    // printing 15 table
    println ("${num * 1}")
    println ("${num * 2}")
    println ("${num * 3}")
    println ("${num * 4}")
    println ("${num * 5}")
    println ("${num * 6}")
    println ("${num * 7}")
    println ("${num * 8}")
    println ("${num * 9}")
    println ("${num * 10}")
    println ("${num * 11}")
    println ("${num * 12}")
}

fun main(args : Array <String>){

    // calling function
    // multiTable1()
    println ("${multiTable1()}")
}
