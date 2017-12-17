
public class PlayingCardTester
{

	public static void main(String args[]) 
	{
		final int cardArraySize = 13;
		final int randomCardArraySize = 5;
		PlayingCard[] cardArray = new PlayingCard[cardArraySize];
		PlayingCard[] randomCardArray = new PlayingCard[randomCardArraySize];


		cardArray[0] = new PlayingCard (PlayingCard.heart,PlayingCard.ace);
		cardArray[1] = new PlayingCard (PlayingCard.spade,10);
		cardArray[2] = new PlayingCard (PlayingCard.club,2);
		cardArray[3] = new PlayingCard (PlayingCard.diamond,3);
		cardArray[4] = new PlayingCard (PlayingCard.heart,PlayingCard.king);
		cardArray[5] = new PlayingCard (PlayingCard.spade,PlayingCard.queen);
		cardArray[6] = new PlayingCard (PlayingCard.club,PlayingCard.jack);
		cardArray[7] = new PlayingCard (PlayingCard.diamond,4);
		cardArray[8] = new PlayingCard (PlayingCard.heart,5);
		cardArray[9] = new PlayingCard (PlayingCard.heart,6);
		cardArray[10] = new PlayingCard (PlayingCard.club,7);
		cardArray[11] = new PlayingCard (PlayingCard.spade,8);
		cardArray[12] = new PlayingCard (PlayingCard.diamond,9);

		randomCardArray[0] = new PlayingCard ();
		randomCardArray[1] = new PlayingCard ();
		randomCardArray[2] = new PlayingCard ();
		randomCardArray[3] = new PlayingCard ();
		randomCardArray[4] = new PlayingCard ();

		for(int i = 0; i<cardArray.length; i++)
		{
			cardArray[i].getName();
		}
		System.out.println();
		for(int i = 0; i<randomCardArray.length; i++)
		{
			randomCardArray[i].getName();
		}

		System.out.println("Hand");

		Hand h = new Hand();
		h.print();


	}
}
