import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class factorsimple{
    public static void main(String[]args) throws IOException{
        Scanner input = new Scanner(System.in);
        double primem = 0;
        double limit = Double.MAX_VALUE / 1000000000;

        System.out.println("Enter a positive integer bigger than zero:(no numbers behind the decimal point or errors occur)");
        System.out.println("Can go up to 1.8E+299!");
        System.out.print("The bigger the number, the longer it will take to calculate... \n \n");
        double factorss = input.nextDouble();
        String factorssstring = String.format ("%.0f", factorss);
        if(factorss > 0){
            File file = new File("/Users/JC/Desktop/Programming/BlueJ 4.2.2/Programs/factorsimple.java/Factorise Number/" + factorssstring + ".txt");
            file.createNewFile();
            FileWriter filewrite = new FileWriter(file);

        final double factorss22 = factorss;
        String factorss22string = String.format ("%.0f", factorss22);

        double factorss44 = factorss22 * factorss22;
        String factorss44string = String.format ("%.0f", factorss44);

        double factorss55 = factorss22 * factorss22 * factorss22;
        String factorss55string = String.format ("%.0f", factorss55);

        if (factorss <= 0){
            System.out.print("Wrong input format... please run program again. \n \n \n");
        }else if(factorss == 1){
            filewrite.write("1 has properties of: \n \n");
            filewrite.write("Square root of 1 is: 1\n");
            filewrite.write("1 squared is: " + factorss44 +"\n");
            filewrite.write("1 cubed is: 1 \n");
            filewrite.write("Multiple Of One \n");
            filewrite.write("Factorial of 0 and 1 \n \n");
            filewrite.write("Prime Factors Of Number \n \n");
            filewrite.write("Number is : 1 \n \n \n");
            filewrite.write("Prime Factorisation is: \n \nCalculating...\n \n \n \n \n \n");
            filewrite.write("1 \n(1 * 1)\n \nFinished! \n \n [Look at last one...]\n \n \n \n");
            filewrite.write("Caution: remember that this program only displays multiples up to 1.8E+299... \n \n");

        }else if(factorss > limit) {
            System.out.print("Sorry, number too big... \n \n \n \n");
        } else {
            String factorstring = String.format ("%.0f", factorss);
            filewrite.write("\n" + factorstring + " has properties of: \n");

            double plm = 1;

//Find if factorss might be the result of a factorial number. eg. 2! = 2, factorss = 2, factorss == factorial of 2
            for(int i = 1; i < 169; i++){
                plm = i * plm;
                if(factorss == plm){
                    filewrite.write("\nFactorial of " + i + "\n");
                }//if-else closure
            }//for closure

            if (factorss % 2 == 0){
                filewrite.write("Even Number \n");
            }else{
                filewrite.write("Odd Number \n");
            }
            filewrite.write("Square root of " + factorss22string + " is: " + Math.sqrt(factorss22) + "\n");
            filewrite.write(factorss22string + " squared is: " + factorss44string +"\n");
            filewrite.write(factorss22string + " cubed is: " + factorss55string + "\n");

            double lkjh = 0;
            boolean iftrue = false;
            double start =  System.currentTimeMillis();
            for (double i = 1; i <= Math.floor(Math.sqrt(factorss22)); i++){
                if(i <= factorss / 2){
                    if(factorss % i == 0){
                        lkjh = factorss / i;
                        String stringi = String.format ("%.0f", i);
                        String stringl = String.format("%.0f", lkjh);

                        filewrite.write("Multiple Of " + stringi + " \n");
                        primem += 1;
                        if(!stringi.equals(stringl)){
                            filewrite.write("Multiple Of " + stringl + " \n");
                            primem += 1;
                        }
                    }//Second if statement closure
                }//if - else statement below for (1st one) closure
            }//for loop closure

            if(primem <= 2){
                filewrite.write("\nPrime Number \n \n \n \n");
            }
            
            String primemst = String.format("%.0f",primem);
            filewrite.write("\n\n" + factorss22string + " has " + primemst + " factors");
            
            filewrite.write("\n \n");
            filewrite.write("Prime Factorisation Of Number \n");
            filewrite.write("Number is : " + factorstring + "\n \n");
            filewrite.write("Prime Factorisation is: \n \n" );
            if(primem <= 2){
                filewrite.write("Calculating... \n \n");
                filewrite.write("1 * " + factorstring + "\n\n");
                filewrite.write("Finished! \n \n");
            }else{
                String output = "";
                for (int i = 2; i <= factorss; i++) {
                    while (factorss % i == 0) {
                        filewrite.write("Calculating... \n \n");
                        String prnum = i + " * ";
                        factorss = factorss / i;
                        output += prnum;
                        filewrite.write(output.substring(0, output.length()-2) + "\n \n");
                    }
                }

                filewrite.write("Finished! \n \n[Look at last one] \n \n \n");

            }

            double stop = System.currentTimeMillis();
            double ELLTime = stop - start;
            ELLTime = ELLTime / 1000;

            if(ELLTime == 1){
                filewrite.write("\n \n" + "1 second has elapsed after number entered...");

            }else{
                filewrite.write("\n \n" + ELLTime + " seconds has elapsed/passed after number entered...");
                double speed = primem / ELLTime;
                String speedstr = String.format("%.4f",speed);
                filewrite.write("\nSpeed of printing(numbers/s): " + speedstr);
            }

            if(factorss22 < 2147483647){
                System.out.print("\n \nEnter number 0 to exit,");
                System.out.print(" enter 1 to list multiples of number...(guaranteed to take time)\n \n");

                double ans = input.nextDouble();
                double addad = 0;
                filewrite.write("\n \n \n \n");

                if(ans == 1){
                    filewrite.write("Listing multiples:\n\n");
                    for(double j = 1; j <= 2147483647; j++){
                        if(addad <= 2147483647){
                            addad = factorss22 * j;
                            filewrite.write(addad + " \n");
                        }
                    }

                }else if(ans < 0 || ans > 1){
                    System.out.print("Wrong input. Program exiting... \n \n \n \n");
                }
            }else if(factorss22 > 2147483647){
                System.out.print("Sorry, \"Displaying Multiples\" method is not available for numbers entered that are larger than 2147483647 \n \n \n \n");
            }
            //#else bracket (first one)
    }
    filewrite.close();
    System.out.println("\n" + "Read from file:\n");
    FileReader fileread = new FileReader("/Users/JC/Desktop/Programming/BlueJ 4.2.2/Programs/factorsimple.java/Factorise Number/" + factorssstring + ".txt");
    int oo = 0;  
    while((oo = fileread.read())!=-1){  
        System.out.print((char)oo);  //prints the content of the file   
    }          
}//#if ln16
    }

}//#program closure//
