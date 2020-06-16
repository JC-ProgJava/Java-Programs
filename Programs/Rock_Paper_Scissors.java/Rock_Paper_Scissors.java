import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 1 to 3 (1 == rock, 2 == paper, 3 == scissors): \n");

            int num = input.nextInt();
            Random randnum = new Random();

            int comrandnum = randnum.nextInt(3);
            comrandnum = comrandnum + 1;
            if(num < 1 || num > 3){
                System.out.print("Wrong input, please re-run program... \n \n \n \n \n \n");
            } else {
                delayer(5);
                System.out.print("\n \n((_)) Rock! \n \n");
                delayer(5);
                System.out.print("|_-_-_| Paper! \n \n");
                delayer(5);
                System.out.print("XXX Scissor! \n \n");
                delayer(5);
                System.out.print("Shoot! \n \n");
                delayer(6);
                
            if(comrandnum == 1 && num == 1){
                System.out.print("\n \nDraw, the computer chose rock and so did you. \n \n \n");
            }else if(comrandnum == 1 && num == 2){
                System.out.print("\n \nYou won! The computer chose rock and you chose paper. \n \n \n");
            }else if(comrandnum == 1 && num == 3){
                System.out.print("\n \nYou lost! The computer chose rock and you chose scissors. \n \n \n");
            }

            if(comrandnum == 2 && num == 1){
                System.out.print("\n \nYou lost! The computer chose paper and you chose rock. \n \n \n");
            }else if(comrandnum == 2 && num == 2){
                System.out.print("\n \nDraw, the computer chose paper and so did you. \n \n \n");
            }else if(comrandnum == 2 && num == 3){
                System.out.print("\n \nYou won! The computer chose paper and you chose scissors. \n \n \n");
            }
    
            if(comrandnum == 3 && num == 1){
                System.out.print("\n \n You won! The computer chose scissors and you chose rock. \n \n \n");
            }else if(comrandnum == 3 && num == 2){
                System.out.print("\n \n You lost! The computer chose scissors and you chose paper. \n \n \n");
            }else if(comrandnum == 3 && num == 3){
                System.out.print("\n \n Draw, the computer chose scissors and so did you. \n \n \n");
            }
        }
    }
    
    public static void delayer(double x){
        for(double i = 0; i < x; i++){
            try {
                Thread.sleep(50);
            }catch (InterruptedException ex){
            }
        }
    }
}