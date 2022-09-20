/**********************************************************
@file MultiplicationQuiz.java
@brief This program is a mulitplication quiz that takes in
the users requested number of questions and the numbers they
want to work with (min/mam)
@author Joshua Sosanya
@date 9/15/22
************************************************************/





import java.util.Scanner;
import java.util.Random;


public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random generator = new Random();

        int randomOne = 0;
        int randomTwo = 0;
        int problems;
        int product = 0;
        int userAnswer = 0;
        int correct = 0;
        int incorrect = 0;
        int i;
        int Min;
        int Max;



        System.out.println("Multiplication Quiz Wiz");
        System.out.println(" ");
        System.out.println("How many problems do you want to work on?");
        problems = scnr.nextInt();
        System.out.println("What are the smallest and largest numbers you want to use?");
        Min = scnr.nextInt();
        Max = scnr.nextInt();

        for (i = 0; i < problems; i++ ){
            System.out.println("Problems " + (i + 1));
            randomOne = generator.nextInt(Max-Min +1) + Min;
            randomTwo = generator.nextInt(Max-Min +1) + Min;
            product = randomOne * randomTwo;
            System.out.println(randomOne + " * " + randomTwo);
            userAnswer = scnr.nextInt();
            if (userAnswer == product){
                System.out.println("Correct!");
                correct++;}
            else {
                System.out.println("Incorrect");
                incorrect++;}

          }

        System.out.printf("You got %d correct\n", correct);
        System.out.printf("You got %d incorrect\n", incorrect);
        System.out.printf("You got %.2f .\n", 100 * ((double)correct / (correct + incorrect)));





        }







    }


