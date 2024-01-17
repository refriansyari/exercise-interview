package com.example.exerciseinterview

//question: https://leetcode.com/problems/find-the-difference/description/

//find the difference of character between 2 provided string

fun main(args: Array<String>) {
    val addedChar = findTheDifference("abcde", "abcdef")
    print("The added char was $addedChar")
}

fun findTheDifference(firstStr: String, secondStr: String) : Char{
    //we will be using an ASCII approach, each of the char has and index of ASCII
    //first we create an initial array of number that consist of 26 elements

    var firstStrCountArray = IntArray(26)

    //set the value of the array based on firstStr char input
    for (char in firstStr){
        //it will count and store the value to the index of array based on substraction of ASCII indexes
        firstStrCountArray[char - 'a']++
    }

    //in this step, firstStrCountArray already filled with counted elements based on firstStr input
    //Create a loop to compared the firstStrCountArray to the input from secondStr
    for (char in secondStr){
        //create an index based on secondStr
        var index = char - 'a'
        //if the char are overlapped between the 2 string, the count element of that index will be substract
        //if the char are no match between 2 string, it means that was the char that being added, immediately return that chat
        if (firstStrCountArray[index] == 0) {
            return char
        } else {
            firstStrCountArray[index]--
        }
    }
    throw IllegalArgumentException("Invalid input: Strings are not valid for this problem.")
}