public class MarioKartPlayer {
    //makes 3 new variables playerName, character, and speed
    private String playerName;
    private String character;
    private int speed;

    //Constructor for class
    public MarioKartPlayer(String name, String character, int speed){
        //sets the variables from the arguments to the variables for the class
        this.playerName = name;
        this.character = character;
        this.speed = speed;
    }
    //boost function that takes in an int to add to the speed
    public void boost(int boost){
        //addes the boost amount to the speed
        speed += boost;
    }
    //Function to display all the info for the class
    public void displayInfo(){
        //prints out all of the variables in the class
        System.out.println("Name: " + playerName + " Character: " + character + " Speed: " + speed);
    }

}
