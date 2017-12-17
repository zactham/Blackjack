
/*When you extend this class, you will be creating a strategy to determine
 *when to hit and when to stand pat based on the value of a hand,
 *whether it is a soft value and the one card the dealer has showing.
 */
 public abstract class BlackjackStrategy 
 {
	 abstract boolean hit (int handValue, int dealerHandValue, boolean soft);
	 
	 public String author()
	 {
		 return "Zac Thamer";
	 }
	 
	 public String name()
	 {
		 return "Winning Strategy";
	 }

 }
