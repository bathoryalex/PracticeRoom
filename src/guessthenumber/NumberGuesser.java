package guessthenumber;

import java.util.Scanner;

/**
 * Created by bathoryalex on 16/10/12.
 */
public class NumberGuesser
{
    public static void guess()
    {
        int randomNumber = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int yourGuessNumber;

        System.out.println("Enter your guess between 1 and 100!");
        yourGuessNumber = input.nextInt();

        while (yourGuessNumber > 100 || yourGuessNumber < 1)
        {
            System.out.println("Enter your guess again (between 1 and 100)!");
            yourGuessNumber = input.nextInt();
        }

        while (yourGuessNumber != randomNumber)
        {
            if (yourGuessNumber < randomNumber)
            {
                System.out.println("Your guess is lower than mine!");
                yourGuessNumber = input.nextInt();
            }

            else if (yourGuessNumber > randomNumber)
            {
                System.out.println("Your guess is greater than mine!");
                yourGuessNumber = input.nextInt();
            }
        }
        System.out.println("Congrats, you guessed it!");
    }

    public static void main(String[] args)
    {
        guess();
    }
}
