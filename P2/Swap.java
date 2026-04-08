class Swap
{
	public static void main(String [] args)
	
	{
		int a = 10;
		int b = 20;
		int temp;

		temp =a; //storing a in temp
		a=b; //storing b in a 
		b=temp; // assigning temp to b

		System.out.println("After swapping:");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}


}