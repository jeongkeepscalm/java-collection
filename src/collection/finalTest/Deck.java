package collection.finalTest;

import java.util.*;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck() {
        this.cards = this.init();
    }

    private ArrayList<Card> init() {
        for (int i = 1; i <= 13; i++) {
            this.cards.add(new Card(i, "♥"));
            this.cards.add(new Card(i, "♠"));
            this.cards.add(new Card(i, "♦"));
            this.cards.add(new Card(i, "♣"));
        }
        return this.cards;
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }




}
