
public class HealthyStateNew implements PlayerState {

	@Override
	public void action(Player player1) {
		player1.attack();
		player1.fireBomb();
		player1.fireGunblade();
		player1.fireLaserPistol();
		
	}

}
