package task4;

class Cool
{
 int x=10;
}

class Demo1 extends Cool
{
	void fo()
	{
		System.out.println("fofo...");
	}
}

class Memo1 extends Demo1
{
	void mo()
	{
		System.out.println("momo...");
	}
}




public class Inheritance {

	public static void main(String[] args) {
		
		Cool c1=new Cool();
		System.out.println("cool class property => "+ c1.x);
		
		Demo1 d1=new Demo1();
		System.out.println("\n"+"Demo1 class property & inherite property => "+ d1.x);
		d1.fo();
		
		
		Memo1 m1=new Memo1();
		System.out.println("\n"+"Memo1 class property & inherite property => "+ m1.x);
		m1.fo();
		m1.mo();
		

	}

}
