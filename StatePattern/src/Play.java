
public class Play {

	public static void main(String[] args) {
		GameContext context = new GameContext(null);
		
		context.setState(new HealthyStateNew());
		context.gameAction();
		System.out.println();
		
		context.setState(new SurvivalState());
		context.gameAction();
		System.out.println();

		context.setState(new DeadState());
		context.gameAction();
		System.out.println();
	}

}
