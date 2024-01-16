package com.example.exerciseinterview

import java.util.Scanner


//question: https://leetcode.com/problems/valid-palindrome/description/
fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    print("Enter a words (string): ")

    //IMPORTANT: must using nextLine() so the input will be read as whole line, not a single character
    val inputStr = reader.nextLine()
    val isValid = isValidPalindrome(inputStr)

    if (isValid){
        print("this is palindrome")
    } else {
        print("this is not a palindrome")
    }
}

fun isValidPalindrome(input: String): Boolean {
    var strInput = input

    // Remove spaces and non-alphanumeric characters from input
    var newString = StringBuilder()

    for (i in strInput) {
        // Exclude spaces and non-alphanumeric characters
        if (i.isLetterOrDigit()) {
            newString.append(i)
        }
    }

    // Convert to lowercase for case-insensitive comparison
    var lowercaseString = newString.toString().lowercase()
    println("normal: $lowercaseString")
    println("reversed: ${lowercaseString.reversed()}")

    // Check if both are equal when reversed
    return lowercaseString == lowercaseString.reversed()
}

