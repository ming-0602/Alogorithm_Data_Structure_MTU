import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<String> cards = new ArrayList<>();
    public Deck() {
//        String hearts;String Diamonds;String Clubs;String Spades;

        for(int i = 1; i < 14; i++){
            cards.add(i + " of Hearts" );
            cards.add(i + " of Diamonds" );
            cards.add(i + " of Clubs" );
            cards.add(i + " of Spades" );
        }

//        for (String card : cards) {
//            System.out.println(card);
//        }

    }

    @Override
    public String toString(){
        return null;
    }


}
