package com.example.hellospring.refactor;


public class TennisGame3{

    private int p2;
    private int p1;
    private final String playerOneName;
    private final String playerTwoName;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? playerOneName : playerTwoName;
            return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.p1 += 1;
        else
            this.p2 += 1;

    }

}
