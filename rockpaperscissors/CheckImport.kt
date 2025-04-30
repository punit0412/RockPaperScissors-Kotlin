package com.example.rockpaperscissors

data class DogSpecs(val name:String){

}

fun main(){
    var dogspecs = DogSpecs("dainis")
    var dainis = Dog(dogspecs.name)
    dainis.bark()
    println(dainis.name)

}