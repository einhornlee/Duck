

public class Duck {

	public int beakLength;
	public boolean hungry;
	public String name;
	public String color;
	
	public Duck()
	{// ×‘×›×œ ×¤×¢×� ×©× ×™×™×¦×¨ ×‘×¨×•×•×– ×�×œ×• ×™×”×™×• ×ª×›×•× ×•×ª×™
		hungry = true; // true / false
		beakLength = 5;
		name = "Quacky";
		color = "blue";
		duckInfo();
	}
	
	public Duck(String _newName)
	{// ×‘×›×œ ×¤×¢×� ×©× ×™×™×¦×¨ ×‘×¨×•×•×– ×�×œ×• ×™×”×™×• ×ª×›×•× ×•×ª×™
		System.out.println("We have created a new duck ");
		hungry = true; // true / false
		beakLength = 5;
		name = _newName;
		color = "blue";
		duckInfo();
	}
	
	public void duckInfo()
	{
		System.out.println("beak length = "+beakLength+", name = "+name+", is he hungry? "+hungry+", his color is " +color);
	}
	
	
	public void feedDuck()
	{
		System.out.println("We feed "+name+"!");
		if(hungry == true)
		{ //if duck is hungry...
			hungry = false;
			System.out.println(name+" eats!");
		}
		else
		{
			// duck is not hungry
			beakLength = beakLength +1;
			if(beakLength >=8)
			{
				
				beakLength = 5;
				if(name.contains("Mega")==false)
				{
					System.out.println(name+" is full! and his beak grows to "+beakLength+" which makes "+name+" hungry again and his beak shrinks!!!!");
					hungry = true;
				}
			}
			else
			{
				System.out.println(name+" is full! and his beak grows to "+beakLength+"");
			}
			
		}
		
		duckInfo();
	}
	
	
	public MegaDuck colorChange()
	{
		if (hungry == false)
		{//×�×� ×”×‘×¨×•×•×– ×¨×¢×‘
			color = "orange";
		System.out.println (name+" changed color! +name+ is now "+color+"!");
	}
		else
			if (color == "orange")
			{//×�×� ×”×•×� ×›×‘×¨ ×›×ª×•×�
				MegaDuck makeMega = new MegaDuck(this);
				return makeMega;
			}
		// ×‘×ž×™×“×” ×•×”×‘×¨×•×•×– ×œ×� ×”×™×” ×›×ª×•×� ×�×• × ×—×–×™×¨ × ×�×œ
		return null;
	}
	
	
	
	public void changebeaksize(int _beackLeanth)
	{// ×œ×©× ×•×ª ×�×ª ×�×•×¨×š ×”×ž×§×•×¨
		beakLength = _beackLeanth;
		duckInfo();
	}
	
	public void changeHunger(boolean _hungry)
	{//×ž×©× ×” ×�×ª ×ž×¦×‘ ×‘×¨×¢×‘ ×©×œ ×”×‘×¨×•×•×–
		hungry = _hungry;
		duckInfo();
	}
	
	public void changeColor(String _color)
	{//×ž×©× ×” ×�×ª ×”×¦×‘×¢ ×©×œ ×”×‘×¨×•×•×–
		color = _color;
		duckInfo();
	}
}
