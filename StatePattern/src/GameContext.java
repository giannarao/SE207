
public class GameContext {

	Player player1 = new Player();
	PlayerState playerState1 = null;
	
	GameContext(PlayerState playerState1){
		this.playerState1 = playerState1;
		
	}
	
	public void setState(PlayerState playerState1) {
		this.playerState1 = playerState1;
	}


	public void gameAction() {
		this.playerState1.action(player1);
	}
}
