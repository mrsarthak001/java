public class lab1
{ 
	public static void main(String[] args)
	{
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c =Integer.parseInt(args[2]);
		
		if (a>b && a>c)
			System.out.println(a + " a is a largest number");
		if (b>a && b>c)
			System.out.println(b + " a is a largest number");
		if (c>b && c>a)
			System.out.println(c + " a is a largest number");
	}
}