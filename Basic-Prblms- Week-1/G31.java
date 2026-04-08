//write a java program to find greatest among three using ternary operator in the same condition


class G31

{

	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int res = (a>b && a>c ? a : b)>(c ? b :c);
     //int res = (a>b? a:b) > (c>d? c:d)? (a>b? a:b) : (c>d?c:d) for 4 variables	
		System.out.println("Greatest among three is : " +res);
	    







	}







}