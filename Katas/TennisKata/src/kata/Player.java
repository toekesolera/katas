package kata;

public class Player {
	private int internalScore;
	public Player rival;
	public Game game;
	
	public Player() {
		internalScore = 0;
	}
	
	public void setGame(Game game) {
		this.game = game;
		game.setRivals();
	}
	
	public int getInternalScore() {
		return this.internalScore;
	}
	
	public void loseAdvantage() {
		this.internalScore--;
	}
	
	public void Score() {
		if (rival.getInternalScore() == 4 && this.internalScore == 3) {
			rival.loseAdvantage();
		} else {
			internalScore += 1;
		}
		game.displayScore();
	}
}
