package com.example.exerciseinterview

import java.util.Scanner



fun main(args: Array<String>) {
    halfStarPyramid()
    halfNumericalPyramid()
    halfAlphabetPyramid()
}

fun halfStarPyramid(){
    var x = 1

    while (x < 99){
        var rows = Scanner(System.`in`).nextInt()
        for (i in 1..rows){
            for (j in 1..i){
                print("* ")
            }
            println()
        }
    }
}


fun halfNumericalPyramid() {

    var x = 1

    while (x < 99){
        var rows = Scanner(System.`in`).nextInt()
        for (i in 1..rows){
            for (j in 1..i){
                print("$j ")
            }
            println()
        }
    }
}

fun halfAlphabetPyramid() {

    var last = 'M'
    var alphabet = 'A'

    for (i in 1..(last-'A' + 1)){
        for (j in 1..i){
            print("$alphabet")

        }
        alphabet++
        println()
    }
}