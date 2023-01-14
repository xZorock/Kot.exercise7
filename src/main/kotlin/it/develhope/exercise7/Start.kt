package it.develhope.exercise7

fun main(){
    val values:List<Int> = listOf(1,2,3,4,123,321)

    values.map{it -> it.toString()}.forEach{it -> println("$it")}
}