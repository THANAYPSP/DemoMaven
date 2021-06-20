package com.example.hellospring.HomeWork1;

public class TennisGame3 {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;
    String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score;
        if (nowIsCallDeuce()) {
            score = point[player1Score];
            return (player1Score == player2Score) ? score + "-All" : score + "-" + point[player2Score];
        } else {
            if (isDeuce())
                return "Deuce";
            return ((player1Score-player2Score)*(player1Score-player2Score) == 1) ? "Advantage " + getCallName() : "Win for " + getCallName();
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName)) {
            this.player1Score += 1;
        } else {
            this.player2Score += 1;
        }

    }

    public String getCallName(){
        return player1Score > player2Score ? player1Name : player2Name;
    }

    public boolean isDeuce(){
            return player1Score == player2Score;
    }

    public boolean nowIsCallDeuce(){
        return player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6);
    }



}