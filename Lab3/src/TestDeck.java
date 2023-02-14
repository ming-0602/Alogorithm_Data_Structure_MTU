import java.util.ArrayList;

public class TestDeck {
    public static void main(String[] args) {

        ArrayList<Card> cards = new ArrayList<Card>();
        Card[] cardArr;
        for(int i = 1; i <= 13; i++){
            cards.add(new Card(i,"Hearts"));
            cards.add(new Card(i,"Diamonds"));
            cards.add(new Card(i,"Clubs"));
            cards.add(new Card(i,"Spades"));

        }

        cardArr = new Card[cards.size()];//create a array and must be same size
        cardArr = cards.toArray(cardArr);//make it to array
        Deck deck = new Deck(cardArr);//add to deck
        deck.shuffle(deck.getCard());
        System.out.println(deck);


    }
}
