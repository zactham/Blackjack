public class MyHomeadeStrategy extends BlackjackStrategy

{
	
	public boolean hit(int handValue, int dealerHandValue, boolean soft)
	{

		if(dealerHandValue>handValue)
			return true;
		else if (soft)
			return true;
		else if(handValue == 11)
			return true;
		else
			return false;
	}
	
	/*
	 * 
{
	if(handValue < 21)
			return true;
		else if (handValue <= 17)
			return true;
              else if (soft)
			return true;
		else
			return false;
	
}
	 */

}
