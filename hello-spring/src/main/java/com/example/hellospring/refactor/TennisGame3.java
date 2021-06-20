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
    private  boolean isAdvantage(){
        return (playerOneScore-playerTwoScore)*(playerOneScore-playerTwoScore) == 1;
    }
    private String getNormalScore(int scores){
        String[] possibleScore = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return possibleScore[scores];
    }
    public String getScore() {
        String gameScore;
        if (NormalGame()) {
            gameScore = getNormalScore(playerOneScore);
            if (isScoreEqual()){
                return gameScore + "-All";
            }
            else{
                return gameScore+"-"+getNormalScore(playerTwoScore);
            }
        } else {
            if (isScoreEqual())
                return "Deuce";
            gameScore = getPlayerName();
            if(isAdvantage()){
                return "Advantage "+gameScore;
            }
            else{
                return "Win for " + gameScore;
            }
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.playerOneScore += 1;
        else
            this.playerTwoScore += 1;

    }

}
