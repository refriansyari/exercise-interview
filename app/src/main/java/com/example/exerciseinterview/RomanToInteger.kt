package com.example.exerciseinterview

fun main(args: Array<String>){
    var inputRoman = "DCDLXVII"
    var result = convertRomanToInt(inputRoman)
    print(result.toString())

}

fun convertRomanToInt (input: String) : Int {

    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var prevValue = 0
    var result = 0

    for (i in (input.length - 1) downTo 0 ){
        val currentValue = romanMap[input[i]]!!

        if (currentValue < prevValue){
            result -= currentValue
        } else {
            result += currentValue
        }

        prevValue = currentValue
    }

    return result

}