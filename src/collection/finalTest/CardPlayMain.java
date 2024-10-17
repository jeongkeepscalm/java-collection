package collection.finalTest;

import java.util.List;

public class CardPlayMain {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffleCards();

        Player playerA = new Player("A");
        List<Card> cardsA = playerA.takeCards(deck);
        cardsA.sort(null);
        playerA.showCardContents();

        Player playerB = new Player("B");
        List<Card> cardsB = playerB.takeCards(deck);
        cardsB.sort(null);
        playerB.showCardContents();

        Player.showWinner(playerA, playerB);

    }
}
