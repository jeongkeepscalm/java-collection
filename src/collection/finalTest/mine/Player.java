package collection.finalTest.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    private String name;
    private final int MAX_SIZE = 5;
    private int sum;

    private List<Card> cardsTaken = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardsTaken() {
        return cardsTaken;
    }

    public List<Card> takeCards(Deck deck) {
        ArrayList<Card> cards = deck.getCards();
        Random random = new Random();

        while (cardsTaken.size() != MAX_SIZE) {
            int num = random.nextInt(cards.size() - 1) + 1;
            Card card = cards.get(num);
            cardsTaken.add(card);
            cards.remove(num);
        }
        return this.cardsTaken;
    }

    public void showCardContents() {
        StringBuilder sb = new StringBuilder();
        String name = this.getName();
        List<Card> cards = this.getCardsTaken();
        int sum = 0;
        for (Card card : cards) {
            int number = card.getNumber();
            sum += number;
            String shape = card.getShape();
            sb.append(number).append("(").append(shape).append(")").append(", ");
        }
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        this.sum = sum;
        System.out.println(name + "의 카드: [" + sb.toString() + "]" + ", 합계: " + sum);
    }

    public int getSum() {
        return sum;
    }

    public static void showWinner(Player p1, Player p2) {
        if (p1.getSum() == p2.getSum()) {
            System.out.println("무승부입니다.");
            return;
        }
        String winnerName = null;
        winnerName = p1.getSum() > p2.getSum() ? p1.getName() : p2.getName();
        System.out.println(winnerName+ "의 승리");
    }

    @Override
    public String toString() {
        return "Player{" +
                "cardsTaken=" + cardsTaken +
                ", name='" + name + '\'' +
                '}';
    }
}
