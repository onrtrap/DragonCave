package main;
import java.util.Scanner;
public class dragonCave {
   static String intro = "You are in a land full of dragons. In front of you,\n" +
           "you see two caves. In one cave, the dragon is friendly\n" +
           "and will share his treasure with you. The other dragon\n" +
           "is greedy and hungry and will eat you on sight.\n" +
           "Which cave will you go into? (1 or 2)";
   static String hungryDragon = "You approach the cave...\n" +
           "it is dark and spooky...\n" +
           "A large dragon jumps out in front of you! He opens his jaws and...\n" +
           "Gobbles you down in one bite!";
    static String friendlyDragon = "You approach the cave...\n" +
            "it is dark and spooky...\n" +
            "A large dragon jumps out in front of you! He opens his jaws and...\n" +
            "Says hello!  They share their treasure with you!  How nice!";
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean correctInput = false;
        String firstCave = "";
        String secondCave = "";
        String input;
        int random = (int)((Math.random() * 2) + 1);
        if(random == 1)
        {
            firstCave = hungryDragon;
            secondCave = friendlyDragon;
        }
        else if(random == 2)
        {
            firstCave = friendlyDragon;
            secondCave = hungryDragon;
        }
        System.out.println(intro);
        while(!correctInput) {
                input = in.nextLine();
            try {
                if (input.equals("1") || input.equals("2")) {
                    if (input.equals("1")) {
                        System.out.println(firstCave);
                    } else if (input.equals("2")) {
                        System.out.println(secondCave);
                    }
                    correctInput = true;
                }
                else
                    System.out.println("Please choose 1 or 2");
            }
            catch(Exception e) {
                System.out.println("Please choose 1 or 2");
            }
        }

        in.close();
    }
}
