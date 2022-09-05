package sahil.projects;

import java.util.Scanner;
import java.util.Random;
public class stonePapperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random number = new Random();
        System.out.println("WELCOME TO THE ROCK, PAPER AND SCISSOR GAME");
        int x = number.nextInt(0,2);
        System.out.println("Please enter your input");
        System.out.println(" 0--> Scissors \n 1--> Paper \n 2 --> Rock");
        int a = sc.nextInt();
        String game= "y";
        String game1 = "x";

        if(x==0){
            game = "Scissors";
        }
        else if(x==1){
             game = "Stone";
        }
        else if(x==2) {
             game = "Paper";
        }
        if(a==0){
            game1= "Scissors";
        }
        else if(a==1){
             game1 = "Paper";
        }
        else if(a==2){
             game1 = "Rock";
        }
        else {
            System.out.println("You have entered wrong input");
        }
        System.out.println("You have chosen " +  game1);
        System.out.println("Computer has chosen " + game );
        System.out.println("Thank-you for playing!!!");


        }
}
