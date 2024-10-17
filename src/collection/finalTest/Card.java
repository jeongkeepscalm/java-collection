package collection.finalTest;

public class Card implements Comparable<Card> {
    private int number;
    private String shape;

    @Override
    public int compareTo(Card o) {
        return this.number < o.number ? -1 : (this.number == o.number ? 0 : 1);
    }

    public Card(int number, String shape) {
        this.number = number;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", shape='" + shape + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }
}
