
public abstract class BlackjackPlayer
{

	//allow the player to decide whether or not to hit
	public abstract boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand);

	public abstract void dealerHit(BlackjackHand dealerHand);

	public abstract void playerBusts(BlackjackHand playerHand);

	public abstract void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand);

	public abstract void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand);

	public abstract void dealerBusts(BlackjackHand dealerHand, BlackjackHand playerHand);

	public abstract void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand);

}
