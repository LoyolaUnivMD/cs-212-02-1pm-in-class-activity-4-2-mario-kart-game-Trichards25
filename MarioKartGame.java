public class MarioKartGame {
    public static void main(String[] args) {
        //makes a new MarioKartPlayer called Thomas. The name is Thomas, Character is Mario, and speed is 10
        MarioKartPlayer Thomas = new MarioKartPlayer("Thomas", "Mario", 10);
        //makes a new MarioKartPlayer called Jacob. The name is Jacob, Character is Luigi, and speed is 12
        MarioKartPlayer Jacob = new MarioKartPlayer("Jacob", "Luigi",12);

        //prints out the info for both of the players
        Thomas.displayInfo();
        Jacob.displayInfo();

        //adds 10 to the players speed
        Thomas.boost(10);
        //adds 15 to the players speed
        Jacob.boost(15);

        //outputs the updated info after boosting
        Thomas.displayInfo();
        Jacob.displayInfo();
    }
}
