public class HandTester
{
	public static void main (String [] args) //Ace = 1 or 11 --- Face Cards = 10
	{
		Hand a = new Hand ();
		System.out.println(a.numberOfCards() + " Cards in Hand"); //there should be no cards in hand
		//a.print(); //there should be no cards in hand
		System.out.println();/////////

		
		for (int x = 0; x < 5; x++) //assign 5 random cards and print them out
		{
			PlayingCard b = new PlayingCard ();
			a.addCard(b);
			
		}
		//	a.print();
		System.out.println();/////////
		//System.out.println(a.numberOfCards() + " Cards in Hand"); //Should print out 5

		for (int x = 0; x < 5; x++) //assign 5 more random cards and print them out
		{
			PlayingCard c = new PlayingCard ();
			a.addCard(c);
			//System.out.println("test");
		}
		System.out.println();/////////
		
		System.out.println();/////////
		System.out.println("Cards in Hand: " + a.numberOfCards()); //Should print out 10

		System.out.print("Card #1 = ");
		a.nthCard(1).getName();
		System.out.println();/////////
		System.out.print("Card #10 = ");
		a.nthCard(10).getName();
		
		
	}
}

