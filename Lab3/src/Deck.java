import java.util.*;

public class Deck {

    private Card[] card;

    public void setCard(Card[] card) {
        this.card = card;
    }

    public Card[] getCard() {
        return card;
    }

    public Deck(Card[] cards) {
        setCard(cards);
    }

    void shuffle(Card[] card){
        Random ran = new Random();
        for(int i = 0; i <= card.length -1; i++){
            int tem = ran.nextInt(card.length);
            Card tem2 = card[tem];
            card[i] = tem2;
        }

    }


//    public ArrayList<String> getCards() {
//        return cards;
//    }
//
//    public void setCards(ArrayList<String> cards) {
//        this.cards = cards;
//    }
//
//    ArrayList<String> cards = new ArrayList<>();
//    public Deck() {
////        String hearts;String Diamonds;String Clubs;String Spades;
//        for(int i = 1; i <= 13; i++){
//            cards.add(i + " of Hearts" );
//            cards.add(i + " of Diamonds" );
//            cards.add(i + " of Clubs" );
//            cards.add(i + " of Spades" );
//        }
//    }
//
//    void Shuffle(){
//        Collections.shuffle(cards);
//    }




    @Override
    public String toString(){
//        return "Deck{" + "cards=" + Arrays.toString(new ArrayList[]{cards}) + "}";
//        String arraylist = cards.toString();
//        String arraylist = getCards().toString();
//        return arraylist;
        return Arrays.toString(getCard());

    }



}
