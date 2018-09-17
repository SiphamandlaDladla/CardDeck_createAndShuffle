package com.cardGame.createAndShuffleDeck;


/*each card is made of a Suit and a Value
create two variables of each.
Pass them as parameters through the constructor
*/

public class Card {

	private Suit suit;
	private Values value;
	
	public Card(Suit suit, Values value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	public String toString()
	{
		return suit.toString() + " " + value.toString();
	}
	
	public Values getValue()
	{
		return this.value;
	}
}
