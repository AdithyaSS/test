package com.cricket.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cricket.player.Player;

@Service
public class CricketService {

	private static final List<Player> CRICKET_PLAYERS;

	static {
		CRICKET_PLAYERS = new ArrayList<>();

		CRICKET_PLAYERS.add(new Player(7, "MS", "Dhoni", "Wicket-Keeper", "CSK"));
		CRICKET_PLAYERS.add(new Player(12, "Yuvaraj", "Singh", "All-Rounder", "KXIP"));
		CRICKET_PLAYERS.add(new Player(18, "Virat", "Kohli", "Batsman", "RCB"));
		CRICKET_PLAYERS.add(new Player(45, "Rohith", "Sharma", "Batsman", "MI"));
		CRICKET_PLAYERS.add(new Player(24, "David", "Warner", "Batsman", "SRH"));
		CRICKET_PLAYERS.add(new Player(49, "Steve", "Smith", "Batsman", "RR"));
		CRICKET_PLAYERS.add(new Player(5, "Goutham", "Gambhir", "Batsman", "KKR"));
		CRICKET_PLAYERS.add(new Player(27, "Ajinkya", "Rahane", "Batsman", "DC"));
	}

	public String getPlayerWrtJerseyNumb(short jerseyNumber) {
		for (Player player : CRICKET_PLAYERS) {
			if (jerseyNumber == player.getPlayerNo())
				return player.toString();
		}
		return null;
	}
}
