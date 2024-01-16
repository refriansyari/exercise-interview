package com.example.exerciseinterview

/*Buatlah sebuah fungsi yang dapat menemukan angka terbesar dari sebuah array.
Contoh: Jika array yang diberikan adalah [1, 5, 3, 7, 2], maka hasilnya adalah 7.*/

fun main(args: Array<String>) {
    var arr = intArrayOf(2, 5, 12, 7, 2)
    var length = arr.size

    var maxValue = arr[0]

    for (i in arr){
        if (i > maxValue){
            maxValue = i
        }
    }

    print(maxValue)
}