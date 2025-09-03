package string;

import java.util.Scanner;

public class DeckOfCards {

    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    static String[][] distributeCards(String[] deck, int players, int cardsEach) {
        if (players * cardsEach > deck.length) return null;

        String[][] playerCards = new String[players][cardsEach];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    static void printPlayers(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.print(playerCards[i][j] + (j == playerCards[i].length - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsEach = sc.nextInt();

        String[][] playerCards = distributeCards(deck, players, cardsEach);

        if (playerCards == null) {
            System.out.println("Not enough cards to distribute.");
        } else {
            printPlayers(playerCards);
        }
    }
}