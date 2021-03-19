public class Deck {
    private Card[] cards;
    private int top; //the index of the top of the deck
    private Card card;

    //add more instance variables if need

    public Deck(){
        //make a 52 card deck here
    }
    public void shuffle(){
        //shuffle the deck here
    }
    public Card deal(){
        //deal a single cared here
        return cards[0];
    }
    //add more methods here if needed
}
