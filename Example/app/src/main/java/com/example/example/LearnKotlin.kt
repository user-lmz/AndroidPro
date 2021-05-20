package com.example.example

import java.util.*

fun main() {
    val a = 37
    val b = 40
//    val value = largernumber(a, b)
//    val name = "Jack"
//    val num = 10L
    /*println("larger number is $value")
    println("$name's core is ${getScore(name)}")
    print("${checkNum(num)}")
    for (i in 10 downTo 1) {
        println(i)
    }*/
    val student = Student("Jack", 19)
    doStudy(student)
    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 ${cellphone1 == cellphone2}")

    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    list.add("Watermelon")
    val maxLengthFruit = list.maxByOrNull { it.length }
    for (i in list)
        println(i)
    println("max length fruit is $maxLengthFruit")
    val newList = list.filter { it.length <= 5 }.map { it.toUpperCase(Locale.ROOT) }
    for (fruit in newList) {
        println(fruit)
    }

    /*val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    for ((fruit, number) in map)
        println("fruit is $fruit, number is $number")*/

}
fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}

/*fun largernumber(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun getScore(name: String) = when(name) {
    "Tom" -> 86
    "Jin" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}

fun checkNum(num: Number) {
    when(num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number is not support")
    }
}*/

