package com.ironyard.data;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by nathanielellsworth on 10/24/16.
 */

@Entity
public class TennisMatch {

    private String tournamentName;         // pro: US Open, French Open, Australian Open. amateur: US Amateur, USTA, green ball winter challenger
    private String league;                 // Pro USTA, Amateur USTA (USTA = United States Tennis Association), European ITF Pro Circuits, European ITF Amateur Circuits (ITF = International Tennis Federation)
//    private boolean matchType;           // Singles (1v1) or Doubles (2v2)
    private String matchLocation;          // Orlando Florida
    private Date matchDate;


    // (.1
    private String team1Name;
    private int team1Rank;
    private int team1Score;


    // (.2
    private String team2Name;
    private int team2Rank;
    private int team2Score;
    private boolean win;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getTournamentName() {return tournamentName;}

    public void setTournamentName(String tournamentName) {this.tournamentName = tournamentName;}

    public String getLeague() {return league;}

    public void setLeague(String league) {this.league = league;}

    public String getMatchLocation() {return matchLocation;}

    public void setMatchLocation(String matchLocation) {this.matchLocation = matchLocation;}

    public Date getMatchDate() {return matchDate;}

    public void setMatchDate(Date matchDate) {this.matchDate = matchDate;}

    public String getTeam1Name() {return team1Name;}

    public void setTeam1Name(String team1Name) {this.team1Name = team1Name;}

    public int getTeam1Rank() {return team1Rank;}

    public void setTeam1Rank(int team1Rank) {this.team1Rank = team1Rank;}

    public int getTeam1Score() {return team1Score;}

    public void setTeam1Score(int team1Score) {this.team1Score = team1Score;}

    public String getTeam2Name() {return team2Name;}

    public void setTeam2Name(String team2Name) {this.team2Name = team2Name;}

    public int getTeam2Rank() {return team2Rank;}

    public void setTeam2Rank(int team2Rank) {this.team2Rank = team2Rank;}

    public int getTeam2Score() {return team2Score;}

    public void setTeam2Score(int team2Score) {this.team2Score = team2Score;}

    public boolean isWin() {return win;}

    public void setWin(boolean win) {this.win = win;}


}
