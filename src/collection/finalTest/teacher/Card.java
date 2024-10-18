package collection.finalTest.teacher;

public class Card implements Comparable<Card> {

    private final int rank;     // 카드의 숫자
    private final Suit suit;    // 카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자가 같지 않으면 숫자로 오름차순 정렬
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            // 숫자가 같으면 모양으로 재정렬(Enum 에 지정한 순서)
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }

}
