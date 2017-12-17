
public class BlackjackDealerTester 
{
	public static void main (String[]args)
	{
		BlackjackDealer dealer = new BlackjackDealer();
		int numGames = 5;

		HumanBlackjackPlayer player1 = new HumanBlackjackPlayer();
		HumanBlackjackPlayer player2 = new HumanBlackjackPlayer();



		System.out.println(dealer.playBlackjack(player1, numGames));
		System.out.println(dealer.playBlackjack(player2, numGames));


	}
}
