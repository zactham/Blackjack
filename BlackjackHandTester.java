
public class BlackjackHandTester 
{
	public static void main (String []args)
	{ 

		BlackjackHand h2 = new BlackjackHand();
		BlackjackHand h3 = new BlackjackHand();
		BlackjackHand h4 = new BlackjackHand();
		BlackjackHand h5 = new BlackjackHand();
		BlackjackHand h6 = new BlackjackHand();
		BlackjackHand h7 = new BlackjackHand();
		BlackjackHand h8 = new BlackjackHand();
		BlackjackHand h9 = new BlackjackHand();
		BlackjackHand h10 = new BlackjackHand();
		BlackjackHand h11 = new BlackjackHand();
		BlackjackHand h12 = new BlackjackHand();
		BlackjackHand h13 = new BlackjackHand();
		BlackjackHand h14 = new BlackjackHand();
		BlackjackHand h15 = new BlackjackHand();
		BlackjackHand h16 = new BlackjackHand();



		//A case with each face value (Jack, Queen and King).
		//30
		PlayingCard c = new PlayingCard(2,12);
		h2.addCard(c);
		c = new PlayingCard(1,11);
		h2.addCard(c);
		c = new PlayingCard(3,13);
		h2.addCard(c);


		//A case where giving an ace the value of 11 will give the hand a value over 21, 
		//but where giving a value of 1 will not.
		PlayingCard d = new PlayingCard(1,11);
		h3.addCard(d);
		d = new PlayingCard(1,1);
		h3.addCard(d);


		//A case with two or more aces
		//21?
		PlayingCard e = new PlayingCard(1,11);
		h4.addCard(e);
		e = new PlayingCard(2,1);
		h4.addCard(e);

		//A case where giving an ace a value of 11 will not give the hand a value over 21
		//13, ace is 11 and a 2
		PlayingCard f = new PlayingCard(1,1);
		h5.addCard(f);
		f = new PlayingCard(1,2);
		h5.addCard(f);


		//A case with more than 5 cards.
		for (int x = 1; x < 7; x++) //assign 5 random cards and print them out
		{
			PlayingCard b = new PlayingCard ();
			h6.addCard(b);
			//b.getName();
		}

		//A case with blackjack (an ace and face card only)
		PlayingCard g = new PlayingCard(3,1);
		h7.addCard(g);
		g = new PlayingCard(1,13);
		h7.addCard(g);

		//A case where the first card is an ace.
		// Ace and 5 so ace is 11
		PlayingCard h = new PlayingCard(2,1);
		h8.addCard(h);
		h = new PlayingCard(1,5);
		h8.addCard(h);

		//	A case where the last card is an ace.
		// 6 + 5 + 1 = 12
		PlayingCard i = new PlayingCard(3,6);
		h9.addCard(i);
		i = new PlayingCard(1,5);
		h9.addCard(i);
		i = new PlayingCard(4,1);
		h9.addCard(i);


		//A case where the first card is an ace
		//the second card is a face card 
		//the third card is a 2
		PlayingCard j = new PlayingCard(3,1);
		h10.addCard(j);
		j = new PlayingCard(1,13);
		h10.addCard(j);
		j = new PlayingCard(4,2);
		h10.addCard(j);

		//A case where the ace is soft.
		PlayingCard k = new PlayingCard(3,1);
		h11.addCard(k);
		k = new PlayingCard(1,5);
		h11.addCard(k);

		//Face card, 2, 4
		PlayingCard l = new PlayingCard(3,13);
		h12.addCard(l);
		l = new PlayingCard(1,2);
		h12.addCard(l);
		l = new PlayingCard(3,4);
		h12.addCard(l);


		//10, 11, 12
		PlayingCard m = new PlayingCard(3,10);
		h13.addCard(m);
		m = new PlayingCard(1,11);
		h13.addCard(m);
		m = new PlayingCard(3,12);
		h13.addCard(m);

		//1,2,5
		PlayingCard n = new PlayingCard(3,1);
		h14.addCard(n);
		n = new PlayingCard(1,2);
		h14.addCard(n);
		n = new PlayingCard(3,5);
		h14.addCard(n);

		//6,7,8
		PlayingCard o = new PlayingCard(3,6);
		h14.addCard(o);
		o = new PlayingCard(1,7);
		h14.addCard(o);
		o = new PlayingCard(3,8);
		h14.addCard(o);

		//4,5,6
		PlayingCard p = new PlayingCard(3,4);
		h15.addCard(p);
		p = new PlayingCard(1,5);
		h15.addCard(p);
		p = new PlayingCard(3,6);
		h15.addCard(p);


		//13,2,3
		PlayingCard q = new PlayingCard(3,13);
		h16.addCard(q);
		q = new PlayingCard(1,2);
		h16.addCard(q);
		q = new PlayingCard(3,3);
		h16.addCard(q);





		System.out.println("Hand Value2: "+ h2.handValue());
		System.out.println("Hand Value3: "+ h3.handValue());
		System.out.println("Hand Value4: "+ h4.handValue());
		System.out.println("Hand Value5: "+ h5.handValue());
		System.out.println("Hand Value6: "+ h6.handValue());
		System.out.println("Hand Value7: "+ h7.handValue());
		System.out.println("Hand Value8: "+ h8.handValue());
		System.out.println("Hand Value9: "+ h9.handValue());
		System.out.println("Hand Value10: "+ h10.handValue());
		System.out.println("Hand Value11: "+ h11.handValue());
		System.out.println("Hand Value12: "+ h12.handValue());
		System.out.println("Hand Value13: "+ h13.handValue());
		System.out.println("Hand Value14: "+ h14.handValue());
		System.out.println("Hand Value15: "+ h15.handValue());
		System.out.println("Hand Value16: "+ h16.handValue());
		
		
		
		
		
		
		HumanBlackjackPlayer hbp = new HumanBlackjackPlayer();
		
		System.out.println(hbp.hit(h2, h3));
		System.out.println();
		hbp.dealerHit(h2);
		hbp.playerBusts(h3);
		hbp.playerTies(h2, h3);
		hbp.dealerWins(h2, h3);
		hbp.playerWins(h2, h3);
		hbp.dealerBusts(h2, h3);
		
		
		
		
		
		
		
	}
}
