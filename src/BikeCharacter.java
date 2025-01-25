import java.util.Scanner;

public class BikeCharacter extends Character{

    public BikeCharacter(String Name, Integer XPosition, Integer YPosition) {
        super(Name, XPosition, YPosition);
    }

    @Override
    public void Move(String value){
        value = value.toLowerCase();
        switch (value){
            case ("up") : SetYPosition(20);
            break;
            case ("down") : SetYPosition(-20);
            break;
            case ("left") : SetXPosition(-20);
            break;
            case ("right") : SetXPosition(20);
            break;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Character Jack = new Character("Jack", 50, 50);
        BikeCharacter Karla = new BikeCharacter("Karla", 100, 50);

        String name;
        do {
            System.out.println("Who would like to move? ");
            name = keyboard.next().toLowerCase();
        } while (!name.equals("karla") && !name.equals("jack"));

        String value;
        do {
            System.out.println("Where would you like to move? ");
            value = keyboard.next().toLowerCase();
        } while (!value.equals("up") && !value.equals("down") && !value.equals("left") && !value.equals("right"));



        if (name.equalsIgnoreCase("Karla")) {
            Karla.Move(value);
            System.out.println("Karla's new position is X = " + Karla.GetXPosition() + " Y = " + Karla.GetYPosition());
        } else {
            Jack.Move(value);
            System.out.println("Jack's new position is X = " + Jack.GetXPosition() + " Y = " + Jack.GetYPosition());
        }
    }
}
