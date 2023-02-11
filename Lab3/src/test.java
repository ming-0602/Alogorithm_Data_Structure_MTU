import java.util.ArrayList;
import java.util.Collections;

public class test {

    public static void main(String[] args) {

        ArrayList<String> cards = new ArrayList<>();
        for(int i = 1; i < 14 ; i ++){
            cards.add(i + " of Hearts" );
            cards.add(i + " of Diamonds" );
            cards.add(i + " of Clubs" );
            cards.add(i + " of Spades" );
        }



//        for(String card : cards){
//            System.out.println(card);
//        }

        Collections.shuffle(cards);

        cards.toArray();

//        System.out.println(cards);

        for(String card : cards){
            System.out.println(card);
        }



    }
}
