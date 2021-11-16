import java.util.ArrayList;

public class Main {
    public static void main(String arg[]){
        String hand = "10H JH QH KH AH";
        Card card1 = new Card(10,"H");
        Card card2 = new Card(11,"H");
        Card card3 = new Card(12,"H");
        Card card4 = new Card(13,"H");
        Card card5 = new Card(14,"H");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        Player player = new Player("Jhon", cards);
        PokerHand pokerHand = player.hand();
        switch (pokerHand){
            case ROYALFLUSH -> System.out.print("Escalera real de color");

        }
    }
}
