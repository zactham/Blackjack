
public class PlayingCard 
{
	private int suit = 0; //will use and integer between 1 and 4 to store the card’s suit
	private int value = 0; //will store the face value of the card
	//(ace, 2, 10, king, etc.) as an integer between 1 and 13

	//VALUES
	public static final int ace = 1;
	public static final int king = 13;
	public static final int queen = 12;
	public static final int jack = 11;


	//SUITS
	public static final int heart = 1;
	public static final int spade = 2;
	public static final int club = 3;
	public static final int diamond = 4;


	public PlayingCard(int s, int v)
	{
		suit = s;
		value = v;
	}

	public PlayingCard()
	{
		suit = (int) (Math.random()*4)+1;
		value = (int) (Math.random()*13)+1;

//		System.out.println("suit:" + suit);
//		System.out.println("value:" + value);
	}

	public void getName()
	{
		switch(getValue())
		{
		case ace: System.out.print("Ace" + " "); break;
		case king: System.out.print("King" + " "); break;
		case queen: System.out.print("Queen" + " "); break;
		case jack: System.out.print("Jack" + " "); break;
		default: System.out.print(getValue() + " "); break;
		}
		switch (suit)
		{
		case heart: System.out.println("Heart" ); break;
		case spade: System.out.println("Spade"); break;
		case club: System.out.println("Club"); break;
		case diamond: System.out.println("Diamond"); break;
		default: System.out.println("No Suit"); break;
		}



	}

	public int getValue()
	{
		return value;
	}

	public int getSuit()
	{
		return suit;
	}
}
