package com.example.hellospring.refactor;


public class TennisGame3{

    private int playerTwoScore;
    private int playerOneScore;
    private final String playerOneName;
    private final String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }
    private boolean NormalGame(){
        return playerOneScore < 4 && playerTwoScore < 4 && !(playerOneScore + playerTwoScore == 6);
    }
    private boolean isScoreEqual(){
        return playerOneScore == playerTwoScore;
    }
    private String getPlayerName(){
        if(playerOneScore > playerTwoScore)
            return playerOneName;
        else
            return playerTwoName;
    }
    public String getScore() {
        String gameScore;
        if (NormalGame()) {
            String[] possibleScore = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            gameScore = possibleScore[playerOneScore];
            if (isScoreEqual()){
                return gameScore + "-All";
            }
            else{
                return gameScore+"-"+possibleScore[playerTwoScore];
            }
            //return (isScoreEqual()) ? gameScore + "-All" : gameScore + "-" + possibleScore[playerTwoScore];
        } else {
            if (isScoreEqual())
                return "Deuce";
            gameScore = getPlayerName();
            return ((playerOneScore-playerTwoScore)*(playerOneScore-playerTwoScore) == 1) ? "Advantage " + gameScore : "Win for " + gameScore;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.playerOneScore += 1;
        else
            this.playerTwoScore += 1;

    }

}
