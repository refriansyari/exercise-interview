package com.example.exerciseinterview

import java.lang.StringBuilder

fun main(args: Array<String>) {
    var intInput = integerToRoman(430)
    print("Roman Number of the input: $intInput")
}

fun integerToRoman(input: Int) : String{
    var numValue = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    var symbol = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" )

    var remainingNumber = input
    var result = StringBuilder()

    //bandingkan input yang dimasukkan user dengan tiap2 numValue
    //lakukan proses penambahan string result hanya saat input >= numValue

    for (i in numValue.indices){
        while (remainingNumber >= numValue[i]){
            result.append(symbol[i])
            remainingNumber -= numValue[i]
        }
    }

    return result.toString()

}