package com.example.exerciseinterview

import java.lang.StringBuilder
import java.util.Scanner


//Question: https://leetcode.com/problems/palindrome-number/description/
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    var result = isPalindromeMethod(num)

    if (result) {
        print("The number is Palindrome")
    } else {
        print("The number is not a Palindrome")
    }

}

//Method 1: Convert to String and reverse
fun isPalindrome(num: Int) : Boolean {
    var isPdr : Boolean = false
    val inputNum = num

    if (inputNum < 0 || (inputNum != 0 && inputNum % 10 == 0))
        return false

    var strNum = num.toString()

    //reverse in kotlin
    //built in function
//    val reverseStr = strNum.reversed()

    //manual reverse
    var reverseStr = StringBuilder()
    for (i in strNum.length - 1 downTo 0){
        reverseStr.append(strNum[i])
    }

    println(reverseStr.toString())

    //Check if reversed string are equal to initial
    isPdr = reverseStr.toString() == strNum

    return isPdr
}

//Split input number into half
//to check if the number reach mid point: input number always greater than the half
fun isPalindromeMethod(num: Int) : Boolean{
    var inputNum = num
    if (inputNum < 0 || (inputNum != 0 && inputNum % 10 == 0))
        return false

    var half = 0


    //while input is greater than half
    while (inputNum > half){
        // The last digit is obtained using the modulus operator (inputNum % 10).
        // After that, the last digit is removed from inputNum by dividing it by 10.
        half = (half * 10) + (inputNum % 10)
        inputNum /= 10
    }

    return  inputNum == half || inputNum == half / 10
}
