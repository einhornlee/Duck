


public class Main {

	static int currentAmountOfDucks; // the total amount of ducks in the application. Updates every time a duck[0] is created
	static Duck[] duck = new Duck[4];
	
	public static void main(String[] args) {
		// This is where it all starts
		createDuck("Mr x");
		
		duck[0] = new Duck();
		System.out.println(duck[0].toString());
		duck[0] = createDuck("Sagi");
		System.out.println(duck[0].toString());
		duck[0].feedDuck();
		duck[0].feedDuck();
		duck[0].feedDuck();
		System.out.println(duck[0].toString());
		duck[0].feedDuck();
		duck[0].feedDuck();
		System.out.println("Hello world");
		System.out.println(duck[0].toString());
		duck[1] = createDuck("Lee");
		System.out.println(duck[1].toString());
		duck[1].feedDuck();
		duck[0].feedDuck();
		duck[1].changebeaksize(duck[0].beakLength-2);
		duck[2] = createDuck("Nurit");
		duck[2].changeHunger(duck[0].hungry);
		System.out.println(duck[2].toString());
		//int duckChoice = (int)Math.random()*5+1;
	}
	
	
	// FUNCTIONS AHEAD!!!!!!@#!#$
	
	/**
	 * this method creates a duck[0] with a name
	 * @param _newName the new name of the duck
	 */
	public static Duck createDuck(String _newName)
	{
		Duck newDuck = new Duck(_newName);
		
		Main.currentAmountOfDucks= currentAmountOfDucks+1;
		System.out.println("We currently have "+currentAmountOfDucks+" ducks");
		
		return newDuck;
	}
	
	public boolean findDuck(String _duckName)
	{
		return false;
	}
	
}
