import java.util.Scanner;
import javax.swing.JOptionPane;

public class calculator {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

			System.out.print("Enter two numbers with a space between them: \n \n");
			double s = input.nextDouble();
			double ss = input.nextDouble();
			double ans = JOptionPane.showConfirmDialog(null, "Add?: ");

			if(ans == JOptionPane.YES_OPTION){
				double j = s + ss;
				JOptionPane.showMessageDialog(null, "The answer of " + s + " " + ss + "added together is:  \n \n" + j );

			}else if(ans == JOptionPane.NO_OPTION){
				double anss = JOptionPane.showConfirmDialog(null, "Subtract?");

				if(anss == JOptionPane.YES_OPTION){
					double k = s - ss;
					JOptionPane.showMessageDialog(null, "The answer of " + s + " subtracted from " + ss + "  is:  \n \n" + k );

				}else if(anss == JOptionPane.NO_OPTION){
					double ansss = JOptionPane.showConfirmDialog(null, "Multiply?");

						if(ansss == JOptionPane.YES_OPTION){
							double l = s * ss;
							JOptionPane.showMessageDialog(null, "The answer of " + s + " and " + ss + " multiplied together is: \n \n" + l);

							}else if(ansss == JOptionPane.NO_OPTION){
								double anssss = JOptionPane.showConfirmDialog(null, "Divide?");

									if(anssss == JOptionPane.YES_OPTION){
										double a = s / ss;
										JOptionPane.showMessageDialog(null, "The answer of " + s + " divided by " + ss + " is: \n \n" + a);
									}
							}
				}
		}

	}
}