package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            // objective one
    {
        int randomNum = (int)(17 * Math.random());

        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number between 1-16");

        int userguess = input.nextInt();

        while(userguess != randomNum)
        {
            System.out.println("Your answer is incorrect, please try again");
            userguess = input.nextInt();
        }

        System.out.println("Correct! You guessed the number");





    }
    public static void secondary(String input)
            //objective two
    {
        Scanner input1 = new Scanner(System.in);
        int toprange = 100;
        int bottomrange = 1;
        int guess = 0;
        boolean trueorfalse = false;
        System.out.println("In this game you come up with a number 1 to 100, and I will try to guess it, you have to help me though." +
        "Let me know if my guess is too high, too low, or correct");
        String userinput = "";
        while(boolean trueorfalse != true)
        {

        }
        }


    }

}
