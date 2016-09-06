import java.util.Random;

public class DiceRoller
 {
    public static void main( String[] args )
    {
    	Random rnd = new Random();
        int dienumber = 1 + rnd.nextInt(6);
        System.out.println("Your die roll was : " + dienumber);
    }
 }

