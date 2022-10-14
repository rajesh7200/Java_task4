package task4;

class Phonepay
{
	void payment()
	{
		System.out.println("Payment accept by ....");
	}
}

class Phonepay_UPI extends Phonepay
{
	void payment()
	{
		System.out.println("Payment accept by UPI");
	}
}

class Phonepay_Debit extends Phonepay
{
	void payment()
	{
		System.out.println("Payment accept by Debit Card");
	}
}

class Phonepay_Credit extends Phonepay
{
	void payment()
	{
		System.out.println("Payment accept by Credit Card");
	}
}

class Phonepay_Netbanking extends Phonepay
{
	void payment()
	{
		System.out.println("Payment accept by Netbanking");
	}
}

class Stimulater
{
	public static void ansim(Phonepay p)
	{
		p.payment();
	}
}



public class Polymorphism {

	public static void main(String[] args) 
	{
		Phonepay_UPI upi= new Phonepay_UPI();
		Phonepay_Debit dr= new Phonepay_Debit();
		Phonepay_Credit cr=new Phonepay_Credit();
		Phonepay_Netbanking net= new Phonepay_Netbanking();
		
		Stimulater.ansim(upi);
		Stimulater.ansim(dr);
		Stimulater.ansim(cr);
		Stimulater.ansim(net);
		

	}

}
