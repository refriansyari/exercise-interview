package com.example.exerciseinterview

/*Buatlah sebuah fungsi yang dapat menghitung jumlah kata dalam sebuah kalimat.
Contoh: Jika kalimat yang diberikan adalah “Halo, nama saya John Doe”, maka hasilnya adalah 5.*/

fun main(args: Array<String>) {
    var strInput = "Halo, nama saya John Doe AAA BBB CCC"
    var strDelimited = strInput.split(" ")
    var strCount = strDelimited.count()
    print(strCount)
}