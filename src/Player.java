import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player(String name, ArrayList<Card> cards) {
        this.name = name;
        this.cards = cards;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCards(int value, String suit){
        Card card = new Card(value, suit);
        cards.add(card);
    }

    public PokerHand hand(){
        ArrayList<Card> cardAux = new ArrayList<>();
        for (Card card: cards) {
            if(cardAux.size() == 0){
                cardAux.add(card);
            }else {
                if (exist(cardAux, card)) {
                    cardAux.add(card);
                }
            }
        }
        if (cardAux.size() == 5){
            return PokerHand.ROYALFLUSH;
        }
        return  PokerHand.HIGHCARD;
    }

    public boolean exist(ArrayList<Card> cards, Card card){
        for (Card c: cards) {
            if(c.getSuit().equals(card.getSuit())){
                return true;
            }
        }
        return false;
    }
}
