
public class Tester {

	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(10); 
		
		System.out.println("Round peg in round hole: " + roundHole.fits(roundPeg)); 
		
		
		SquarePeg squarePeg = new SquarePeg(2);
		SquarePeg squarePeg2 = new SquarePeg(20);
		
		RoundPeg squarePegAdapter = new SquarePegAdapter(squarePeg);
		
		RoundPeg squarePegAdapter2 = new SquarePegAdapter(squarePeg2);
		
		System.out.println("Square peg in square hole 1: " + roundHole.fits(squarePegAdapter));
		
		
		System.out.println("Square peg in square hole 2: " + roundHole.fits(squarePegAdapter2));
		
		
		

	}

}
