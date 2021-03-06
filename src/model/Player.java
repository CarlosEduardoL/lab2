/**
 * 
 */
package model;

import cUtil.CQueue;

/**
 * @author Carlos Eduardo Lizalda Valencia
 * @author Santiago Chasqui Cordoba
 *
 */
public class Player implements Comparable<Player>{
	
	private String nickName;
	
	//STATS 
	private int kills;
	private int ping;
	private int headShoots;
	private int deads;
	private double accuracy;
	private double averageSurvivalTime;
	private int playedGames;
	private int TimesInTopTen;
	private int TimePlayed;
	
	//MATCH ATRIBBS
	private boolean isOnline;
	private boolean isFindingMatch;
	
	//IN GAME ATRIBBS
	private Inventory inventory;
	
	
	/**
	 * 
	 */
	public Player(String nickName) {
		this.nickName = nickName;
		setInventory(new Inventory());
	}

	/**
	 * @return the kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * @param kills the kills to set
	 */
	public void setKills(int kills) {
		this.kills = kills;
	}

	/**
	 * @return the ping
	 */
	public int getPing() {
		return ping;
	}

	/**
	 * @param ping the ping to set
	 */
	public void setPing(int ping) {
		this.ping = ping;
	}

	/**
	 * @return the headShoots
	 */
	public int getHeadShoots() {
		return headShoots;
	}

	/**
	 * @param headShoots the headShoots to set
	 */
	public void setHeadShoots(int headShoots) {
		this.headShoots = headShoots;
	}

	/**
	 * @return the deads
	 */
	public int getDeads() {
		return deads;
	}

	/**
	 * @param deads the deads to set
	 */
	public void setDeads(int deads) {
		this.deads = deads;
	}

	/**
	 * @return the accuracy
	 */
	public double isAccuracy() {
		return accuracy;
	}

	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * @return the averageSurvivalTime
	 */
	public double isAverageSurvivalTime() {
		return averageSurvivalTime;
	}

	/**
	 * @param averageSurvivalTime the averageSurvivalTime to set
	 */
	public void setAverageSurvivalTime(double averageSurvivalTime) {
		this.averageSurvivalTime = averageSurvivalTime;
	}

	/**
	 * @return the playedGames
	 */
	public int getPlayedGames() {
		return playedGames;
	}

	/**
	 * @param playedGames the playedGames to set
	 */
	public void setPlayedGames(int playedGames) {
		this.playedGames = playedGames;
	}

	/**
	 * @return the timesInTopTen
	 */
	public int getTimesInTopTen() {
		return TimesInTopTen;
	}

	/**
	 * @param timesInTopTen the timesInTopTen to set
	 */
	public void setTimesInTopTen(int timesInTopTen) {
		TimesInTopTen = timesInTopTen;
	}

	/**
	 * @return the timePlayed
	 */
	public int getTimePlayed() {
		return TimePlayed;
	}

	/**
	 * @param timePlayed the timePlayed to set
	 */
	public void setTimePlayed(int timePlayed) {
		TimePlayed = timePlayed;
	}

	public int getSkill() {
		return (int) (((((double) kills / deads)*10) + ((headShoots/25)) + (averageSurvivalTime * 0.1) + (TimesInTopTen * 0.3) + (TimePlayed * 0.01)));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Player o) {
		return getSkill()-o.getSkill();
	}

	/**
	 * @return
	 */
	public String getNickName() {
		// TODO Auto-generated method stub
		return nickName;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public boolean isFindingMatch() {
		return isFindingMatch;
	}

	public void setFindingMatch(boolean isFindingMatch) {
		this.isFindingMatch = isFindingMatch;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	


}
