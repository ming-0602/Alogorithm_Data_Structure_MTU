import java.util.ArrayList;
import java.util.Collections;

public class Deck {
//    private Card[] card;

    public ArrayList<String> getCards() {
        return cards;
    }

    public void setCards(ArrayList<String> cards) {
        this.cards = cards;
    }

    ArrayList<String> cards = new ArrayList<>();
    public Deck() {
//        String hearts;String Diamonds;String Clubs;String Spades;
        for(int i = 1; i <= 13; i++){
            cards.add(i + " of Hearts" );
            cards.add(i + " of Diamonds" );
            cards.add(i + " of Clubs" );
            cards.add(i + " of Spades" );
        }
    }

    void Shuffle(){
        Collections.shuffle(cards);
    }

    @Override
    public String toString(){
//        return "Deck{" + "cards=" + Arrays.toString(new ArrayList[]{cards}) + "}";
//        String arraylist = cards.toString();
        String arraylist = getCards().toString();
        return arraylist;

    }



}
