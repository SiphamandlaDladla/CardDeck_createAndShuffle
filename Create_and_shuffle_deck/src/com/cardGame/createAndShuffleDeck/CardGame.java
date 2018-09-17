package com.cardGame.createAndShuffleDeck;

public class CardGame {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.print("Welcome, have a look at your deck before we play.\n");
			
			Deck casinoDeck = new Deck();
			casinoDeck.createFullDeck();
			casinoDeck.shuffleDeck();
			
			//player views the deck
			System.out.println(casinoDeck);

		}
}

