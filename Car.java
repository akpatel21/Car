//pg. 394 #2
public class Car 
{
	//fields
	private int yearModel;
	private String make;
	private int speed;
	
	//when making a constructor, the header does not have a return type (not even void) and the name of the method is the name of the class
	//A constructor's purpose is to initialize the object, typically declared fields are initialized here , instantinate?, substantinate?
	public Car(int y, String m)
	{
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	//setters? mutators?
	//acessors - "getters" - type of method
	public int getYear()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	//other methods
	public void accelerate()
	{
		speed += 5;
	}
	
	public void brake()
	{
		speed -= 5;
	}
}
