package task4;


interface Sample
{
	void fo();
	void mo();
}

abstract class Demo implements Sample
{
	public void fo()
	{
		System.out.println("fofo....");
	}
	public abstract void mo();
}

class Memo extends Demo
{
    public void mo()
	{
		System.out.println("momo....");
	}

}

public class Interface {

	public static void main(String[] args) {
		
		Memo m1=new Memo();
	
		m1.mo();
		m1.fo();
	}

}
