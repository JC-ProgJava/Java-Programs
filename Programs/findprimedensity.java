import java.lang.Math;
import java.util.Scanner;
    public class findprimedensity{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter search range:");
            double findif = input.nextDouble();
            System.out.println("Prime Density using Prime Number Theorem(%):");
            double result = (1 / Math.log(findif)) * 100;
            System.out.println(result);
            System.out.println("Number of primes under input number using Prime Number Theorem:");
            result = findif / Math.log(findif);
            System.out.println(result);
            
        }
    }

  