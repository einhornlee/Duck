

public class MegaDuck extends Duck {

	public int featherLength;
	
	
	public MegaDuck(Duck _duckling)
	{
		color = "red";
		name = "Mega "+_duckling.name;
		beakLength = 30;
		hungry = false;
		featherLength = 13;
		
	}
	
	
}
