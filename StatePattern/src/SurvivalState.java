
public class SurvivalState implements PlayerState{

	SurvivalState (){
		
	}
	
	@Override
	public void action(Player player1) {
		player1.survive();
		player1.firePistol();
		
	}

}
