//add your own banner here

public class Card implements Comparable<Card>{
    private int suit; //use integers 1~4 to encode the suit
    private int rank; //use integers 1-13 to encode the rank

    public enum Suit {
        ACE {
            public String toString() { return "A";}
        },
    }
    public Card (int s, int r) {
        //make a card with suit s and rank r
    }



    public int compareTo(Card c){
        //use this method to compare cards so they
        //may be easily sorted
        return 1;
    }

    public String toString(){
        //use this method to easily print a Card object
        return "aa";
    }

    //add some more methods here if needed
}
