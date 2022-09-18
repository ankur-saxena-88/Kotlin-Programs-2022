// SizeOfDataTypes.kt

/**
 * Write a Kotlin program to find the size of byte, short, long, int, float, double data types.
 * Date: Sun, 18 Sep, 2022
 */

// creating function
fun findSize(){

    println ("The size of Byte is : ${Byte.SIZE_BITS} Bits")
    println ("The size of Short is : ${Short.SIZE_BITS} Bits")
    println ("The size of Long is : ${Long.SIZE_BITS} Bits")
    println ("The size of Integer is : ${Integer.SIZE} Bits")
    println ("The size of Float is : ${Float.SIZE_BITS} Bits")
    println ("The size of Double is : ${Double.SIZE_BITS} Bits")
}

// creating main function
fun main(){

    // calling function
    println ("${findSize()}")
}
