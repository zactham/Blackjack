
public class ComputerBlackjackPlayer extends BlackjackPlayer
{
	private BlackjackStrategy strategy;
	
	ComputerBlackjackPlayer(BlackjackStrategy theStrategy)
	{
		strategy = theStrategy;
	}

	@Override
	public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand) 
	{
		return strategy.hit(playerHand.handValue(), dealerHand.handValue(), playerHand.soft());
		
	}

	@Override
	public void dealerHit(BlackjackHand dealerHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerBusts(BlackjackHand playerHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dealerBusts(BlackjackHand dealerHand, BlackjackHand playerHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) {
		// TODO Auto-generated method stub
		
	}
	
	
}
