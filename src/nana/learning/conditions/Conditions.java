package nana.learning.conditions;

public class Conditions {
    public static void main(String[] args) {
        // example of conditions (if-else)
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        } else {
            System.out.println("It is an alien!");
        }

        // example of conditions (if-else if-else)

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        } else if (topScore == 100) {
            System.out.println("You got the perfect score!");
        } else {
            System.out.println("You got the low score!");
        }

        // example of conditions (ternary operator)

        int secondTopScore = 60;
        String result = (secondTopScore > topScore) ? "You got the high score!" : "You got the low score!";

        System.out.println(result);

        // example of conditions (logical operators)

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }


        // example of conditions (switch)

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

    }
}
