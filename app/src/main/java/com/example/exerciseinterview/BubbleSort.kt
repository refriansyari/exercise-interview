package com.example.exerciseinterview


//source: https://blog.logrocket.com/sorting-algorithms-kotlin-android-development/
//bubble sorting algorithm basically involves comparing two adjacent values and swapping them if required

fun main(args: Array<String>) {

    var initArray = intArrayOf(3,1,4,2,6,9,7,2)
    println("this is the initial array: ${initArray.joinToString()}")

    bubbleSort(initArray)
    println("this is the sorted array: ${initArray.joinToString()}")

}

fun bubbleSort(input: IntArray) {

    val n = input.size
    //for swapping
    var temp = 0

    //create a nested loop
    //i for looping through array
    //j for swapping adjacent value

    for (i in 0 until n){
        for (j in 1 until (n - i)){
            //start from 1 because we will compare it with previous
            //check adjacent value

            if (input[j-1] > input[j]){
                //do swapping
                temp = input[j-1]
                input[j-1] = input[j]
                input[j] = temp
            }
        }
    }

}