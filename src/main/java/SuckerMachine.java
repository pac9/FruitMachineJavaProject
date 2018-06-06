import java.util.Random;

public class SuckerMachine extends FruitMachine {

    public SuckerMachine(String name) {
        super(name);
    }

    public Enum randomiseReelChoice() {
//

        FruitType[] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

    public int resultOfSpin() {
        if (reelOneChoice.equals(FruitType.CHERRIES) && reelTwoChoice.equals(FruitType.CHERRIES) && reelThreeChoice.equals(FruitType.CHERRIES)) {
            payout += 5;
            System.out.println("You have won £5");
            return payout;
        } else if (reelOneChoice.equals(FruitType.LEMONS) && reelTwoChoice.equals(FruitType.LEMONS) && reelThreeChoice.equals(FruitType.LEMONS)) {
            payout += 7;
            System.out.println("You have won £7");
            return payout;
        } else if (reelOneChoice.equals(FruitType.ORANGES) && reelTwoChoice.equals(FruitType.ORANGES) && reelThreeChoice.equals(FruitType.ORANGES)) {
            payout += 6;
            System.out.println("You have won £6");
            return payout;
        } else {
            System.out.println("Oh dear! You have lost");
            return getPayout();


        }
    }
}
