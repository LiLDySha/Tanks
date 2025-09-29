package com.example.maybemygame;

public class ScoreManager {
    private static int score = 0;

    public static int getScore(){
        return score;
    }
    public static void increaseScore(int points){
        score += points;

    }
    public static void minusScore(int points){
        score -= points;
    }

    public static void resetScore(){
        score = 0;
    }
}
