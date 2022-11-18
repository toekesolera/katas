package kata;

public class Game {
	public Player server;
	public Player receiver;
	
	public void setRivals() {
		server.rival = receiver;
		receiver.rival = server;
	}
	
	public Game (Player server, Player receiver) {
		this.server = server;
		this.receiver = receiver;
		this.server.setGame(this);
		this.receiver.setGame(this);
	}
	
	public String displayPersonalScore(Player player) {
		switch (player.getInternalScore()) {
			case 1: return "15";
			case 2: return "30";
			case 3: return "40";
			case 4: return "A";
			case 5: return "WIN";
			default: return "0";
		}	
	}
	
	public void displayScore() {
		if (server.getInternalScore() == 4 && receiver.getInternalScore() < 3
				|| server.getInternalScore() == 5) {
			System.out.println("Server wins!");
			System.exit(0);
		} else if (server.getInternalScore() < 3 && receiver.getInternalScore() == 4
				|| receiver.getInternalScore() == 5) {
			System.out.println("Receiver wins!");
			System.exit(0);
		} else 	System.out.println(displayPersonalScore(server) + ":" 
				+ displayPersonalScore(receiver));
	}
}
