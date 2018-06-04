import java.util.ArrayList;
import java.util.Random;

public class FruitMachine {


    private int payout;
    private FruitType reelOneChoice;
    private FruitType reelTwoChoice;
    private FruitType reelThreeChoice;



    public FruitMachine () {

        this.payout = payout; //or should this be 0 at initialisation
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;
    }


    public FruitType randomiseReelChoice(){
        FruitType [] array = {FruitType.CHERRIES, FruitType.LEMONS, FruitType.ORANGES};
        Random rand =  new Random();
        int select = rand.nextInt(array.length);
        return array[select];
    }

    public void generateThreeWheels(){
//        this.reelOneChoice;
//        this.reelTwoChoice;
//        this.reelThreeChoice;
        setReelOneChoice();
        setReelTwoChoice();
        setReelThreeChoice();
    }

    public void setReelOneChoice(){
        this.reelOneChoice = randomiseReelChoice();
    }

    public void setReelTwoChoice(){
        this.reelTwoChoice = randomiseReelChoice();
    }

    public void setReelThreeChoice(){
        this.reelTwoChoice = randomiseReelChoice();
    }






}
