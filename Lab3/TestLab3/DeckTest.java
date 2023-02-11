import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck = new Deck();

    @Test
    void allcard(){

        ArrayList<String> cards = new ArrayList<>();
        for(int i = 1; i < 14 ; i ++){
            cards.add(i + " of Hearts" );
            cards.add(i + " of Diamonds" );
            cards.add(i + " of Clubs" );
            cards.add(i + " of Spades" );
        }

        assertEquals(cards, Deck.class);




    }


}