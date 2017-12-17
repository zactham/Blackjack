import java.util.Scanner;

public class HumanBlackjackPlayer extends BlackjackPlayer
{
	Scanner input = new Scanner (System.in);
	private String answer = null;
	@Override
	public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand)
	{
		//Doesn't print the first card to allow proper play
		for(int i = 2; i <= dealerHand.numberOfCards(); i++)
		{
			System.out.println("Dealer Hand Card: ");
			dealerHand.nthCard(i).getName();

		}

		System.out.println();
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			System.out.println("Player Hand Card: ");
			playerHand.nthCard(i).getName();
		}

		System.out.println();
		System.out.println("Do you want a hit?");
		answer = input.next();

		while(!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y") || 
				answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")))
		{
			System.out.println("Invalid Response, enter again");
			answer = input.next();
		}
		System.out.println();
		if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y"))
			return true;
		else if(answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N"))
			return false;
		return false;


	}



	public void dealerHit(BlackjackHand dealerHand) 
	{
		System.out.println("All Dealer Cards: ");
		for(int i = 1; i <= dealerHand.numberOfCards(); i++)
		{
			dealerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("Dealer Hit");
		System.out.println();

	}


	public void playerBusts(BlackjackHand playerHand)
	{
		System.out.println("All Player Cards: ");
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			playerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("You Busted");
		System.out.println();

	}


	public void playerTies(BlackjackHand dealerHand, BlackjackHand playerHand) 
	{
		System.out.println("All Player Cards: ");
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			playerHand.nthCard(i).getName();
		}

		System.out.println();

		System.out.println("All Dealer Cards: ");
		for(int i = 1; i <= dealerHand.numberOfCards(); i++)
		{
			dealerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("You Tied");
		System.out.println();

	}


	public void playerWins(BlackjackHand dealerHand, BlackjackHand playerHand) 
	{
		System.out.println("All Player Cards: ");
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			playerHand.nthCard(i).getName();
		}

		System.out.println();

		System.out.println("All Dealer Cards: ");
		for(int i = 1; i <= dealerHand.numberOfCards(); i++)
		{
			dealerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("You Win");
		System.out.println();

	}

	public void dealerBusts(BlackjackHand dealerHand, BlackjackHand playerHand) 
	{
		System.out.println("All Player Cards: ");
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			playerHand.nthCard(i).getName();
		}

		System.out.println();

		System.out.println("All Dealer Cards: ");

		for(int i = 1; i <= dealerHand.numberOfCards(); i++)
		{
			dealerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("Dealer Busts");
		System.out.println();

	}


	public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) 
	{
		System.out.println("All Player Cards: ");
		for(int i = 1; i <= playerHand.numberOfCards(); i++)
		{
			playerHand.nthCard(i).getName();
		}

		System.out.println();

		System.out.println("All Dealer Cards: ");

		for(int i = 1; i <= dealerHand.numberOfCards(); i++)
		{
			dealerHand.nthCard(i).getName();
		}
		System.out.println();
		System.out.println("Dealer Wins");
		System.out.println();
	}

}
