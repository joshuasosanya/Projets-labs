/**********************************************************
 @file ImplementingBlackJack.java
 @brief This program is a simple game of black jack that
 calculates the cards values of each player and provides
 the winner and loser based on the results of >21 and <21.
 @author Joshua Sosanya
 @date 9/15/22
 ************************************************************/





import java.util.Scanner;
import java.util.Random;

public class ImplementingBlackJack{

    public static void main(String[] args) {

        String anotherCard, playAgain = "y", ctn = null;
        int nextCard, card1, card2, dCard1, dCard2;
        int cardTotal = 0, dTotal = 0;

        Scanner keyboard = new Scanner(System.in);

        Random random = new Random();



        while ("y".equals(playAgain)) {
            dCard1 = random.nextInt(11) + 1;
            dCard2 = random.nextInt(11) + 1;

            card1 = random.nextInt(11) + 1;
            card2 = random.nextInt(11) + 1;
            cardTotal = card1 + card2;


            dTotal = dCard1 + dCard2;
            System.out.println("Dealer shows: " + dCard1);

            System.out.println("First Cards: " + card1 + ", " + card2);
            System.out.println("Total: " + cardTotal);

            System.out.println("Another Card (y/n)?: ");
            anotherCard = keyboard.nextLine();

            if ("y".equals(anotherCard)) {
                nextCard = random.nextInt(11) + 1;
                cardTotal += nextCard;
                System.out.println("Card: " + nextCard);
                System.out.println("Total: " + cardTotal);

                 if (cardTotal > 21) {
                    System.out.println("You busted, Dealer wins");
                    System.out.println("Do you want to play again? (y/n):");
                    playAgain = keyboard.nextLine();}


                else if (cardTotal < 21) {
                    System.out.println("Another Card (y/n)?: ");
                    anotherCard = keyboard.nextLine();}}

            else if ("n".equals(anotherCard)){
                    System.out.println("Dealer had: " + dTotal);

                System.out.println("You had: " + cardTotal);

                while ("n".equals(anotherCard)) {
                    if (dTotal < cardTotal && cardTotal < 21) {
                        System.out.println("Yay you win!");
                        System.out.println("Play again? (y/n): ");
                        playAgain = keyboard.nextLine();}
                    else if (dTotal > cardTotal && dTotal < 21){
                        System.out.println("You lose!");
                        System.out.println("Play again? (y/n): ");
                        playAgain = keyboard.nextLine();}

                        if (playAgain.equalsIgnoreCase("y")){
                            playAgain = "y";}}


                    }
                }
            }
        }

