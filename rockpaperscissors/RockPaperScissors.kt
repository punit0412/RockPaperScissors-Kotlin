package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    playerChoice = readln()
    println("Rock, Paper or Scissors? Enter your choice! ")




    val randomNumber = (1..3).random()

//    if (randomNumber == 1){
//        computerChoice = "Rock"
//    }else if(randomNumber == 2){
//        computerChoice == "Paper"
//
//    }else if (randomNumber == 3){
//        computerChoice = "Scissors"
//    }

    when (randomNumber){
        1 ->{
            computerChoice = "Rock"
        }

        2 ->{
            computerChoice = "Paper"
        }

        3 ->{
            computerChoice = "Scissor"
        }
    }

    println(computerChoice)

    val winner =  when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"

    }

    if (winner == "Tie"){
        println("It's a Tie")
    }else {
        println("$winner won !")
        println(winner + " won !")
    }


}