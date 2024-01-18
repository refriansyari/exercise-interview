package com.example.exerciseinterview

//Selection Sort : https://www.geeksforgeeks.org/selection-sort/
//Comparing value one-by-one, searching for the smallest/largest value, swap it from unsorted portiion to sorted portion

fun main(args: Array<String>) {

    var arrInput = intArrayOf(64,23,63,2,3,0)
    selectionSort(arrInput)

    println("Sorted array: ${arrInput.joinToString()}")

}

fun selectionSort (arr: IntArray){

    var arrSize = arr.size

    //outer loops iterate through array
    for (i in 0..<arrSize){
        //set min. value always start with 0 (unsorted array)
        var currentMint = i
        //inner loops to compare the value & swapping
        for (j in i+1 until arrSize){
            if (arr[j] < arr[currentMint] ){
                //if arr j less than current min, set the current min to j index
                currentMint = j
            }
        }

        //do swapping

        var temp = arr[currentMint]
        arr[currentMint] = arr[i]
        arr[i] = temp
    }

}