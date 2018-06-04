import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Reel {

    private FruitType reelOneChoice;
    private FruitType reelTwoChoice;
    private FruitType reelThreeChoice;

    public Reel(FruitType fruitType) {
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;
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


    public void generateThreeWheels() {
//        this.reelOneChoice;
//        this.reelTwoChoice;
//        this.reelThreeChoice;
        setReelOneChoice();
        setReelTwoChoice();
        setReelThreeChoice();
    }

    public FruitType setReelOneChoice() {
       return this.reelOneChoice = randomiseReelChoice();
    }

    public FruitType setReelTwoChoice() {
       return this.reelTwoChoice = randomiseReelChoice();
    }

    public FruitType setReelThreeChoice() {
       return this.reelThreeChoice = randomiseReelChoice();
    }
}
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
