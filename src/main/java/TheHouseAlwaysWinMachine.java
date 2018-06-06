import java.util.Random;

public class TheHouseAlwaysWinMachine extends FruitMachine {

    public TheHouseAlwaysWinMachine(String name) {
        super(name);

    }

    public Enum randomiseReelChoice() {
        CardType[] array = {CardType.QUEEN, CardType.JACK, CardType.KING};
        Random rand = new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

    public int resultOfSpin() {
        if (reelOneChoice.equals(CardType.JACK) && reelTwoChoice.equals(CardType.JACK) && reelThreeChoice.equals(CardType.JACK)) {
            payout += 8;
            System.out.println("You have won £8");
            return payout;
        } else if (reelOneChoice.equals(CardType.QUEEN) && reelTwoChoice.equals(CardType.QUEEN) && reelThreeChoice.equals(CardType.QUEEN)) {
            payout += 8;
            System.out.println("You have won £8");
            return payout;
        } else if (reelOneChoice.equals(CardType.KING) && reelTwoChoice.equals(CardType.KING) && reelThreeChoice.equals(CardType.KING)) {
            payout += 8;
            System.out.println("You have won £8");
            return payout;
        } else {
            System.out.println("Oh dear! You have lost");
            return getPayout();


        }

    }

}
