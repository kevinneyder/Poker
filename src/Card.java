public class Card {
    private int value; //2,3,4,5,6,7,8,9,10,J=11,Q=12,K=13,A=14 valor
    private String suit; //H,D,C,S

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card() {

    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
