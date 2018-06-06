import java.util.ArrayList;
import java.util.Random;

public class SuckerMachine extends FruitMachine {

//    private int reels;

    public SuckerMachine(String name) {
        super(name);
//        this.reels = 3;
    }

    public Enum randomiseReelChoice() {
        FruitType[] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

    public int resultOfSpin() {
        if (reelOneChoice.equals(reelTwoChoice) && reelTwoChoice.equals(reelThreeChoice)) {
            //amounts hard coded in rather than putting a value against the enum as allows for extension
            //whereby payout if two amounts match
            if (reelOneChoice == FruitType.CHERRIES) {
                payout += 5;
                System.out.println("You have won £5");
            } else if (reelOneChoice == FruitType.LEMONS) {
                payout += 7;
                System.out.println("You have won £7");
            } else if (reelOneChoice == FruitType.ORANGES) {
                payout += 6;
                System.out.println("You have won £6");
            }
            return payout;
        } else {
            System.out.println("Oh dear! You have lost");
            return getPayout();
        }

//        public boolean generateReels(this.reels){
//            ArrayList<Integer> countReels = new ArrayList<>();
//            for (int x = 0; x < reels; x++) {
//                countReels.add(getRandomReels());
//            }

        }
//
//    public int getReels() {
//            return this.reels;
//    }
}






