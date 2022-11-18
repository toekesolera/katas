package kata;

public class Main {
	
	
	public static void main(String[] args) {
		Player server = new Player();
		Player receiver = new Player();
		Game game = new Game(server, receiver);
		
		server.Score();
		server.Score();
		server.Score();
		receiver.Score();
		receiver.Score();
		receiver.Score();
		server.Score();
		receiver.Score();
		receiver.Score();
		receiver.Score();
	}
}
