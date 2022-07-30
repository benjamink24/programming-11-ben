
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        int r = 1;//defining variables
        int p = 2;
        int s = 3;
        String c = "c";


        System.out.println("Choose rock paper or scissors. r is for rock p is for paper and s is for scissors. have fun:)");// this is just printing the players instructions to the console
        Scanner scan = new Scanner(System.in);// installing the scanner
        String input = (scan.nextLine());// scanning for players choice
        if (input.matches("r") || input.matches("p") || input.matches("s")) {//this is just establishing the valid choice options and the if is for the else

        } else {
            System.out.println("invalid choice");// this is the invalid choice selection if it doesnt match s r or p any other sybol word number or charicter will be rejected
        }
        int compchoice = (int) (Math.random() * 100);// this ensures that the computer choice is random. and the int cuts of the decimal. this operation generates a numb from 1-100 not zero because integer
        if (compchoice <= 33) {// this is a third of the numbers if it lands in this range the computer will pick rock
            compchoice = r;
            c = "r";
        }

        if ((compchoice <= 66) && (compchoice >= 34)) {// if it lands in this range it will pick paper
            compchoice = p;
            c = "p";
        }

        if (compchoice >= 67) {//if it lands in this range it will pick scissors
            compchoice = s;
            c = "s";
        }


        if ((c.equals(input))) {// if they are equal then it will print draw
            System.out.println("its a draw");
        }

        if ((input.equals("p")) && (compchoice == r) || ((input.equals("s")) && (compchoice == p) || (("r".equals(input)) && (compchoice == s)))) {//this will check all the win out comes if none of them match nothing will happen if one of them match then it will sout you win
            System.out.println("you win");
        } else if ((input.equals("s")) && (compchoice == r) || ((input.equals("r")) && (compchoice == p) || ((input.equals("p")) && (compchoice == s)))) {//this checks the lose posibilities if one of them are true it will sout you lose
            System.out.println("you lose");
        }

        if (input.equals("r")) {//this redefines the string variables and makes the r s and p their counterparts.
            input = "rock";
        }
        if (input.equals("s")) {
            input = "scissors";
        }
        if (input.equals("p")) {
            input = "paper";
        }

        if (c.equals("r")) {
            c = "rock";
        }
        if (c.equals("s")) {
            c = "scissors";
        }
        if (c.equals("p")) {
            c = "paper";
        }
        System.out.println(("computer choice: ") + c + (" players choice: ") + input);// this prints out the computers choice and the players choice as the full word ex r for rock
    }
}