class Paytm
{
	public static void main( String [] args)

	{ 
		double wallet = 10000;
		double shopping = 4000;
		
		double cashback1 = 400;
		
		double movie = 600;
		
		double popcorn = 350;
		
		double drinks = 150;
		
		double cashback2 = 300;
		
		double petrol = 500;
		
		

		 wallet-= shopping;
		System.out.println("Balance after Shopping  Rs."+ wallet);

		 wallet+= cashback1;
		System.out.println("Balance  after Cashback 1 Rs."+ wallet);

		 wallet-= movie;
		System.out.println("Balance  after Movie Rs."+ wallet);

		 wallet-= popcorn;
		System.out.println("Balance  after popcorn Rs."+ wallet);

		 wallet-= drinks;
		System.out.println("Balance  after drinks Rs."+ wallet);

		 wallet+= cashback2;
		System.out.println("Balance  after cashback2 Rs."+ wallet);

		 wallet-= petrol;
		System.out.println("Balance  after Petrol Rs."+ wallet);

		System.out.println("Balance   Rs."+ wallet);
	}







}