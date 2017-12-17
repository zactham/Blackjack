
public class BlackjackHand extends Hand
{

	private int handValue = 0;
	private boolean soft = false;//if it contains an ace given a value of 11

	public void computeValue()
	{
		boolean aces = false;
		handValue = 0;
		soft = false;
		
		for(int i = 1; i<=numberOfCards(); i++)
		{
			//System.out.println("Number of Cards: " + numberOfCards());
			if(nthCard(i).getValue() == PlayingCard.king || 
					nthCard(i).getValue() == PlayingCard.queen ||
					nthCard(i).getValue() == PlayingCard.jack)
			{
				//System.out.println("Face card" + nthCard(i).getValue());
				handValue+=10;
			}
			else
				handValue+=nthCard(i).getValue();

			if(nthCard(i).getValue() == PlayingCard.ace)
				aces = true;
		}

		if(aces && handValue<12)
		{
			handValue+=10;
			soft = true;
		}

	}


	public BlackjackHand()
	{
		super();
		handValue = 0;
		soft = false;
	}

	public void addCard(PlayingCard card)
	{
		super.addCard(card);
		computeValue();
	}

	public int handValue()
	{
		return handValue;
	}

	public boolean soft()
	{
		return soft;
	}

}
