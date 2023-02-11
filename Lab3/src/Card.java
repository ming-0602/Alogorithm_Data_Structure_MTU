public class Card {

    private int face;//1 to 13 representing Ace to King
    private String suit;// "Hearts", "Diamond", "Clubs", "Spades"

    public Card(int f, String s){
        face = f;
        suit = s;
//        System.out.println();
    }

    public int getFace(){
        return face;
    }

    public String getSuit(){
        return suit;
    }


    public void setFace(int face) {
        this.face = face;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString(){
        return " " + face + " of " + suit;
    }




}
