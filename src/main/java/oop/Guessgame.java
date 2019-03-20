package oop;

public class Guessgame {

    Player p1; //instance variables
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player(); //new player objects assigned to 3 player instance variables
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; //declared three variables to hold the three guesses the player makes
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1GuessRight = false; //declared three variables to hold false statement on players answers
        boolean p2GuessRight = false;
        boolean p3GuessRight = false;

        int targetnum = (int) (Math.random() * 10); //make target number that player has to guess
        System.out.println("I am thinking of a number between 0 and 9 ");

        while(true){
            System.out.println("The number to guess is " + targetnum);

            p1.guess(); //call each players guess method
            p2.guess();
            p3.guess();

            guessp1 = p1.number; //get each players guess by accessing the number variable of each player
            System.out.println("Player one's guess is " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two's guess is " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three's guess is " + guessp3);

            if(guessp1 == targetnum){ //check each players guess to see if it matches with target number
                p1GuessRight = true;
            }
            if (guessp2 == targetnum){
                p2GuessRight = true;
            }
            if (guessp3 == targetnum){
                p3GuessRight = true;
            }
            if(p1GuessRight || p2GuessRight || p3GuessRight ){ //if p1 or p2 or p3 is right
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1GuessRight);
                System.out.println("Player two got it right? " + p2GuessRight);
                System.out.println("Player three got it right? " + p3GuessRight);
                System.out.println("Game over.");
                break;
            } else { //otherwise stay in the loop and ask players to guess again
                System.out.println("Sorry players, try again!");
            }



        }

    }

}
