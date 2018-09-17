package com.cardGame.createAndShuffleDeck;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	//instance variables
	private ArrayList<Card> cards ;
	
	public Deck()
	{
		this.cards = new ArrayList<Card>();
	}
	
	//create the full deck
	public void createFullDeck()
	{
		for(Suit cardSuit: Suit.values())
		{
			for(Values cardValues: Values.values())
			{
				this.cards.add(new Card(cardSuit, cardValues));
			}
		}
	}
	
	//shuffle the deck
	public void shuffleDeck()
	{
		ArrayList<Card> tempDeck =new ArrayList<Card>();
		Random random = new Random();
		int randomCardIndex = 0;
		int cardDeckSize = this.cards.size();
		
		for(int x=0; x< cardDeckSize; x++)
		{
			//System.out.print("top inside shuffle");
			//random.nextInt((max-min)-1)+min;
			randomCardIndex = random.nextInt((this.cards.size()-1 -0)+ 1) +0;
			//add card to tempdeck
			tempDeck.add(this.cards.get(randomCardIndex));
			//remove card from maindeck
			this.cards.remove(randomCardIndex);
			//System.out.print("inside shuffle");
			
		}
		//System.out.print("outside shuffle");
		this.cards = tempDeck;
	}
	
	public Card getCard(int i)
	{
		return this.getCard(i);
	}
	
	public String toString()
	{
		String cardList = "";
		int i=0;
		
		for(Card myCard: this.cards)
		{
			cardList += "\n" + i + "-" + myCard.toString();
			i++;
		}
		return cardList;
	}
	
	//find card value
	public int cardsValue()
	{
		int totalVal = 0;
		int aces = 0;
		
		for(Card cardVal: this.cards)
		{
			switch(cardVal.getValue())
			{
			case TWO: totalVal += 2; break;
			case THREE: totalVal += 3; break;
			case FOUR: totalVal += 4; break;
			case FIVE: totalVal += 5; break;
			case SIX: totalVal += 6; break;
			case SEVEN: totalVal+= 7; break;
			case EIGHT: totalVal+= 8; break;
			case NINE: totalVal+= 9; break;
			case TEN: totalVal+= 10; break;
			case ACE: totalVal+=1; break;
			case JACK: totalVal+= 10; break; 
			case KING: totalVal+= 10; break;
			case QUEEN: totalVal+= 10; break;
			
			}
			
		}
		
		for(int x=0; x<aces; x++)
		{
			if(totalVal < 10)
			{
				totalVal +=1;
			}
			else
			{
				totalVal += 11;
			}
		}
		
		return totalVal;
	}
	
	public int deckSize()
	{
		return this.cards.size();
	}
}
