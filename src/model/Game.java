package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import cUtil.CHashTable;
import cUtil.CList;
import cUtil.List;
import cUtil.Map;
import cUtil.SCHeap;

public class Game {
	
	public final static double PROSKILL = 40;
	public final static double GOODPING = 200;
	
	private Ranking ranking;
	private Map<String, String> developers;
	
	private PingFilter<Integer, Player> pingFilter;
	private List<Match> matches;
	private int matchCounter;
	
	/**
	 * @throws IOException 
	 * 
	 */
	public Game() throws IOException {
		developers = new CHashTable<String, String>(4);
		developers.set("CARLOS", "CARLOS");
		developers.set("SANTIAGO", "SANTIAGO");
		developers.set("NELSON", "NELSON");
		developers.set("SARA", "SARA");
		
		matchCounter = 0;
		
		
		developers.set("SARA", "SARA");	
	}
	
	public void initRanking() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("PlayerData.txt")));
		String temp;
		ranking = new Ranking();
		while((temp = reader.readLine()) != null) {
			String[] data = temp.split(" ");
			Player p = new Player(data[0]);
			p.setKills(Integer.parseInt(data[1]));
			p.setPing(Integer.parseInt(data[2]));
			p.setHeadShoots(Integer.parseInt(data[3]));
			p.setDeads(Integer.parseInt(data[4]));
			p.setAccuracy(Double.parseDouble(data[5]));
			p.setAverageSurvivalTime(Double.parseDouble(data[6]));
			p.setPlayedGames(Integer.parseInt(data[7]));
			p.setTimesInTopTen(Integer.parseInt(data[8]));
			p.setTimePlayed(Integer.parseInt(data[9]));
			ranking.addPlayer(p);
		}
				
		reader.close();
	}
	
	public void sortRanking() {
		ranking.sort();
	}
	
	public boolean checkDeveloper(String name,String pass) {
		boolean isDeveloper = false;
		if (developers.get(name) != null) {
			isDeveloper = developers.get(name).equals(pass);
		}
		return isDeveloper;
	}
	
	

	public Ranking getRanking() {
		return ranking;
	}
	
	public void extractPlayersFromRanking() {
		Player[] players = ranking.getRanking();
		int i = 0;
		//Send 500 players to the next filter and add them to the new Hash Table
		//After doing this, we're going to break the list that every chaining point has.
		while(i < players.length-1) {
			
			pingFilter.set(players[i].getPing(), players[i]);
			i++;
		}
	}
	
	public void addPlayer(Player newPlayer) {
		
		
	}
	
	public void breakMatches() {
	}
	
	public void finishMatch(int index) {
		
	}
	
	public void addMatch(Match newMatch) {
		matches.add(newMatch);
	}
	
}