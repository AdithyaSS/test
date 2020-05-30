package com.cricket.player;

public class Team {
	private short teamRanking;
	private String teamName;
	private int rating;
	private String cricketFormat;

	public Team() {
		super();
	}

	public Team(short teamRanking, String teamName, int rating, String cricketFormat) {
		super();
		this.teamRanking = teamRanking;
		this.teamName = teamName;
		this.rating = rating;
		this.cricketFormat = cricketFormat;
	}

	public short getTeamRanking() {
		return teamRanking;
	}

	public void setTeamRanking(short teamRanking) {
		this.teamRanking = teamRanking;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCricketFormat() {
		return cricketFormat;
	}

	public void setCricketFormat(String cricketFormat) {
		this.cricketFormat = cricketFormat;
	}

}
