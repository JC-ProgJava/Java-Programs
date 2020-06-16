import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class righttri{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        for(double x = 0; x < 100; x++){
                double ab = JOptionPane.showConfirmDialog(null, "Input a and b to get c: ");
            if(ab == JOptionPane.YES_OPTION){
                System.out.println(" |\\");
                System.out.println(" | \\");
                System.out.println(" |  \\");
                System.out.println(" |   \\");
                System.out.println(" |    \\");
                System.out.println("a|     \\");
                System.out.println(" |      \\");
                System.out.println(" |__     \\");
                System.out.println(" |  |     \\");
                System.out.println("  ---------");
                System.out.println("      b    \n\n");
                System.out.print("Enter a and b: \n");
                double userina = input.nextDouble();
                double userinb = input.nextDouble();
                if(userina < 1 || userinb < 1){
                    System.out.print("InputTYPE.ERROR -? non-positive\n");
                    continue;
                }else{
                    double calculated = Math.sqrt(Math.pow(userina,2) + Math.pow(userinb,2));
                    System.out.print("Hypotenuse side of the right angle triangle is: " + calculated + "\n\n");
                }
            }else if(ab == JOptionPane.NO_OPTION){
                double bcorac = JOptionPane.showConfirmDialog(null,"Input a and c to get b: ");
                if(bcorac == JOptionPane.NO_OPTION){
                    continue;
                }else if(bcorac == JOptionPane.CANCEL_OPTION){
                    break;
                }else{
                    System.out.println(" |\\");
                    System.out.println(" | \\");
                    System.out.println(" |  \\");
                    System.out.println(" |   \\");
                    System.out.println(" |    \\");
                    System.out.println("a|     \\");
                    System.out.println(" |      \\");
                    System.out.println(" |__     \\");
                    System.out.println(" |  |     \\");
                    System.out.println("  ---------");
                    System.out.println("      b    \n\n");
                    System.out.print("Enter a/b and c: \n");
                    double userinaorb = input.nextDouble();
                    double userinc = input.nextDouble();
                    if(userinaorb < 1 || userinc < 1){
                        System.out.print("InputTYPE.ERROR -? non-positive\n\n");
                        continue;
                    }else if(userinaorb >= userinc){
                        System.out.print("InputORDER.ERROR -? side a/b bigger than c\n\n");
                        continue;
                    }else{
                        double calculatedIt = Math.sqrt(Math.pow(userinc,2) - Math.pow(userinc,2));
                        System.out.print("Side a/b(not hypotenuse) is: " + calculatedIt + "\n\n");
                    }
                }
            }else if(ab == JOptionPane.CANCEL_OPTION){
                break;
            }
        }
            JOptionPane.showMessageDialog(null, "Hope this helped!");
    }
}
