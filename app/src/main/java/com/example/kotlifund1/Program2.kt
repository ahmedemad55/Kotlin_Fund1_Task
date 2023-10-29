package com.example.kotlifund1

fun main (){
    println("Entre first number of your scoop : ")
    val firstnum = readLine()?.toInt()

    println("Entre second number of your scoop : ")
    val secondnum = readLine()?.toInt()
    var count = 0

    if (firstnum != null && secondnum != null){

    for (item in firstnum..secondnum){
        if(item % 3 ==0 && item % 5 ==0){
            println("Program is finished")
            break
        }

        else if (item % 3 != 0){
            println(item)

        }

    }}
    else{
        println("Please enter a valid numbers")
    }


}