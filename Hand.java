
public class Hand 
{
	private int cardsinHand = 0;
	private int arraySize = 1;
	private PlayingCard[] cardArray = new PlayingCard[arraySize];

	public Hand()
	{
		cardsinHand = 0;
		arraySize = 5;
		cardArray = new PlayingCard[arraySize];
	}



	//Returns the number of cards in the hand as an integer.
	public int numberOfCards()
	{
		return cardsinHand;
	}

	//Takes an integer argument N, returns the Nth card in the hand as a PlayingCard object
	public PlayingCard nthCard (int n)
	{
		return cardArray[n-1];
	}

	public void printCard(int n)
	{
		System.out.println(cardArray[n-1].getValue()+ " ");
		System.out.println(cardArray[n-1].getSuit());
	}

	//Prints all the cards in the hand
	public void print()
	{
		for(int i = 0; i < arraySize; i++)
		{
			System.out.println(cardArray[i]);
		}
	}

	// If the new size is greater than the number of slots in the array, 
	//it creates a new array of double the size and copies all the cards from the original array to the new array.
	//It replaces the array with the new array and adds the new card to it.
	//Adds a card to the hand
	public void addCard(PlayingCard card)
	{
		cardsinHand++;

		if(cardsinHand > arraySize)		
		{
			PlayingCard[] temp = new PlayingCard[arraySize*2];
			for(int i = 0; i<arraySize; i++)
			{
				temp[i] = cardArray[i];
			}
			cardArray = temp;
			cardArray[cardsinHand-1] = card;
		}
		else
			cardArray[cardsinHand-1] = card;

	}
}
