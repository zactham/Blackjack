public class MySimpleStrategy extends BlackjackStrategy

{
	/*
	 * The dealer has an ace showing (handValue is 11) and handValue is less than 21
	 * HandValue is less than or equal to 17, or HandValue is soft
(non-Javadoc)
	 */
	public boolean hit(int handValue, int dealerHandValue, boolean soft)
	{
		if(dealerHandValue == 11 && handValue < 21)
			return true;
		else if (handValue <= 17 || soft)
			return true;
		else
			return false;
	}
	
	

}
