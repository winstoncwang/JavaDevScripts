package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVariable = 50; //myVariable = 50 is an expression // int myVariable = 50 is a statement

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was "+highScore);


        //bob 1500
        int position = calculateHighScorePosition(1100);
        displayHighScorePosition("Bob", position);
        //tom 900
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", position);
        //adam 400
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Adam", position);
        //jerry 50
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Jerry", position);
    }

    //I AM A METHOD
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){ //boolean gameOver is a parameter
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition( String playerName, int highScorePosition){
        if(highScorePosition!=-1) {
            System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
        }
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
