
public class MySimpleStrategyTester 
{
	public static void main (String[]args)
	{
		MySimpleStrategy s = new MySimpleStrategy();
		//int handValue, int dealerHandValue, boolean soft
		/*
		 * 15	true	11
		 * 15	false	11
		 * 11	false	10
		 * 17	false	7
		 * 16	false	6
		 * 17	true	2

		 */
		System.out.println(s.hit(15, 11, true)); // true
		System.out.println(s.hit(15, 11, false));
		System.out.println(s.hit(11, 10, false));
		System.out.println(s.hit(17, 7, false));
		System.out.println(s.hit(16, 6, false));
		System.out.println(s.hit(17, 2, true));

	}
}
