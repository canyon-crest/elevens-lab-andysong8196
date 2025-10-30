package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card = new Card1("Diamonds", "King", 13);
		Card1 card2 = new Card1("Hearts", "9", 9);
		Card1 card3 = new Card1("Spades", "Ace", 1);
		Card1 card4 = new Card1("Spades", "Ace", 1);
		System.out.println(card.rank());
		System.out.println(card2.suit());
		System.out.println(card3.pointValue());
		System.out.println(card3.matches(card4));
	}
}
