package Enitities;

public class Game {

	private int id;
	private String gameName;
	private String gameType;
	private double gamePrice;

	public Game(int id, String gameName, String gameType, double gamePrice) {
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
