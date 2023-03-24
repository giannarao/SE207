
public class DeadState implements PlayerState{

	DeadState(){
		
	}
	
	@Override
	public void action(Player player1) {
		player1.dead();
		
	}

}
