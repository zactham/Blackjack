import java.util.Scanner;

public class BlackjackDealer 
{
	Scanner input = new Scanner (System.in);

	/*
	 * 
This method will iterate numGames times. For each game, it will create a BlackjackHand for the dealer containing only one random card.
 It will create a BlackjackHand for the player containing two random cards. 
 It will then repeatedly call hit until the player either stands or busts.
 If the player busts, the hand is over and playerBusts is called. 
 Otherwise another random card is added to the dealer’s hand and then the dealer draws until its handValue is 17 or higher. 
 If it busts, dealerBusts is calls. Otherwise playerWins, playerTies or dealerWins is called, depending on whose hand is higher.
	 */
	private double playerScore = 0;


	public double playBlackjack(BlackjackPlayer player, int numGames)
	{
		System.out.println("Enter the amount of games you would like to play");
		numGames = input.nextInt();

		for (int i = 0; i< numGames; i++)
		{
			System.out.println("Game: " + (i+1));
			boolean charlie = false;
			boolean playerBust = false;
			boolean hitAgain = true;
			boolean dealerBust = false;
			boolean playerScoreBool = false;

			BlackjackHand dealerHand = new BlackjackHand();
			PlayingCard dealerCard = new PlayingCard();
			dealerHand.addCard(dealerCard);
			PlayingCard dealerCard2 = new PlayingCard();
			dealerHand.addCard(dealerCard2);

			BlackjackHand playerHand = new BlackjackHand();
			PlayingCard playerCard1 = new PlayingCard();
			PlayingCard playerCard2 = new PlayingCard();
			playerHand.addCard(playerCard1);
			playerHand.addCard(playerCard2);



				while ((!charlie)&&(hitAgain = player.hit(dealerHand,playerHand)) && playerHand.handValue()<22)
				{

					if(!charlie && playerHand.numberOfCards() <5)
					{
						PlayingCard playerCard = new PlayingCard();
						playerHand.addCard(playerCard);
		

						if(playerHand.handValue() > 21)
						{
							playerBust = true;	
							player.playerBusts(playerHand);
							break;
						}
					}			
					
					if (playerHand.numberOfCards() == 5 && playerHand.handValue()<22)
					{
						System.out.println("5 Card Charlie - " + playerHand.numberOfCards()  );
						charlie = true;
						
					}
				}


				while(dealerHand.handValue() < 17)
				{
					if(!playerBust)
					{	
						PlayingCard dealercard2 = new PlayingCard();
						dealerHand.addCard(dealercard2);	

						if(dealerHand.handValue() > 21)
						{
							player.dealerBusts(dealerHand, playerHand);
							dealerBust = true;
							break;
						}
					}
				}

			

			if(charlie)
			{
				player.playerWins(dealerHand, playerHand);
				if(!playerScoreBool)
				{
					playerScoreBool = true;
					playerScore+=1;
				}

			}
			/*
			else if(hitAmount >= 5 && playerHand.handValue()< 22 && (dealerHand.soft() &&
					(dealerHand.nthCard(1).getValue() == 10 || dealerHand.nthCard(2).getValue() == 10)))
			{
				player.playerWins(dealerHand, playerHand);
				System.out.println("Player hits to get five or more cards, the player’s handValue is below 21, "
						+ "and the dealer does not have Blackjack");

				playerScore+=1;
			}
			 */
			else if (dealerBust)
			{
				player.playerWins(dealerHand, playerHand);
				if(!playerScoreBool)
				{
					playerScoreBool = true;
					playerScore+=1;
				}

			}

			else if(playerHand.handValue() > dealerHand.handValue() && playerHand.handValue() <= 21)
			{
				player.playerWins(dealerHand, playerHand);
				if(!playerScoreBool)
				{
					playerScoreBool = true;
					playerScore+=1;
				}
			}

			else if(playerHand.handValue() == dealerHand.handValue())
			{
				player.playerTies(dealerHand, playerHand);

				playerScoreBool = true;
				playerScore+=0.5;
			}

			else if( (playerHand.handValue() < dealerHand.handValue()) || 
					(dealerHand.handValue() <= 21 && playerHand.handValue() > 21)
					)
			{
				player.dealerWins(dealerHand, playerHand);
			}


			System.out.println(" ");
			System.out.println("--------------------------------------------------");
			System.out.println(" ");

		}
		System.out.println("Score: ");
		return (playerScore/numGames);
	}
}
