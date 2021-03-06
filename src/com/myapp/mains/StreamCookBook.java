package com.myapp.mains;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class StreamCookBook {
	public static final List<Winnerr> tdfWinners = Arrays.asList(

			new Winnerr(2006, "Spain", "�scar Pereiro", "Caisse d'Epargne�Illes Balears", 3657,	Duration.parse("PT89H40M27S"), 8),
			new Winnerr(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"), 4),
			new Winnerr(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
			new Winnerr(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
			new Winnerr(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
			new Winnerr(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
			new Winnerr(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
			new Winnerr(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
			new Winnerr(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
			new Winnerr(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
			new Winnerr(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14));

	public static void main(String[] args) {

	}

}

class Winnerr {
	private int year;
	private String nationality;
	private String name;
	private String team;
	private int lengthKm;
	private Duration winningTime;
	private int stageWins;
	private int daysInYellow;

	public Winnerr(int year, String nationality, String name, String team, int lengthKm, Duration winningTime,
			int daysInYellow) {
		this.year = year;
		this.nationality = nationality;
		this.name = name;
		this.team = team;
		this.lengthKm = lengthKm;
		this.winningTime = winningTime;
		this.daysInYellow = daysInYellow;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getLengthKm() {
		return lengthKm;
	}

	public void setLengthKm(int lengthKm) {
		this.lengthKm = lengthKm;
	}

	public Duration getWinningTime() {
		return winningTime;
	}

	public void setWinningTime(Duration winningTime) {
		this.winningTime = winningTime;
	}

	public int getStageWins() {
		return stageWins;
	}

	public void setStageWins(int stageWins) {
		this.stageWins = stageWins;
	}

	public int getDaysInYellow() {
		return daysInYellow;
	}

	public void setDaysInYellow(int daysInYellow) {
		this.daysInYellow = daysInYellow;
	}

}
