import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class GuessNumber {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int chance=3;//fixed no.of chances.
            for(int i=1;i<=chance;i++) {   //i=no of attempts.
                System.out.println("attempt:"+i);
                System.out.print("Guess a number:");
                int num = sc.nextInt();  //guess a number 1 to 100.
                int RandomNum = (int) (Math.random() * 101); //system generates a number between 1 to 100.
                System.out.println("computer generated num:"+RandomNum);
                //checking  the conditions.
                if (num == RandomNum)
                    System.out.println("u have guessed correctly");
                else if(num< RandomNum)
                    System.out.println("The number you have guessed is less than Generated number.\nBetter Luck NextTime.");
                else
                    System.out.println("The number you have guessed is greater than Generated number.\nBetter Luck NextTime.");
            }
        }


    }
