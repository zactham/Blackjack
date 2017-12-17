
public class ComputerBlackjackPlayerTester 
{
	public static void main (String[]args)
	{
		BlackjackDealer dealer = new BlackjackDealer();
		int numGames = 10000;
		
		BlackjackStrategy Strategy = new MySimpleStrategy();
		
		
		ComputerBlackjackPlayer bp = new ComputerBlackjackPlayer(Strategy);
		System.out.println(dealer.playBlackjack(bp, numGames));
		System.out.println(Strategy.author());
		System.out.println(Strategy.name());
		
		
	}
			
}
