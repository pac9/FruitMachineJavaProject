import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Reel {

    public Reel() {

//        generateReel();
//        shuffle();

    }

//    public void generateWheel() {
//        for (FruitType fruitType : FruitType.values()) {
//            fruit.add(fruitType);
//        }
//    }


    public FruitType randomiseReelChoice() {
        FruitType[] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];

    }
}

//

//    public void generatechoic(){
//        this.setReelOneChoic();
//        this.setReelTwoChoic();
//
//
//
//    }

//    public void setReeelOneChoice(){
//        this,reelOneChoic = randomiseReelChoic();
//    }


//

//

//    private ArrayList<Card> cards;
//
//    public Deck(){
//        cards = new ArrayList<>();
//        generateDeck();
//        shuffle();
//    }
//
//    public int getNumberOfCards(){
//        return cards.size();
//    }
//
//    private void generateDeck(){
//        for(Suit suit : Suit.values()){
//            for(Rank rank : Rank.values()){
//                cards.add(new Card(suit, rank));
//            }
//        }
//    }
//
//    public void shuffle(){
//        Collections.shuffle(cards);
//    }
//
//    public Card getCard(){
//        return cards.remove(0);
//    }
//}
