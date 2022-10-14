package task4;

class Encap
{
 private int pin=1234;
 
 public int getPin()
 {
	 return pin;
 }
 
 public void setpin(int pin)
 {
	 this.pin=pin;
 }
 
}

public class Encapsulation {

	public static void main(String[] args) 
	{
		Encap e1=new Encap();
		
		System.out.println("Before pin changes "+ e1.getPin());
		
		e1.setpin(15623);
		System.out.println("After pin changes "+e1.getPin());

	}

}
