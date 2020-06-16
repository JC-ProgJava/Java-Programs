import java.util.Scanner;

public class bubblesortinputnum {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount of numbers: \n");
		int lengthofinput = input.nextInt();
		System.out.print("Enter numbers: ");
		double inputnum[] = new double[lengthofinput];
		double numentered;
		for(int i = 0; i < lengthofinput; i++){
			numentered = input.nextDouble();
			inputnum[i] = numentered;
			continue;
		}
for(int kj = 0; kj < inputnum.length * 3; kj++){
		for(int j = 0; j < inputnum.length - 1; j++){
			if(inputnum[j] > inputnum[j + 1]){
				double shifter = inputnum[j];
				inputnum[j] = inputnum[j + 1];
				inputnum[j + 1] = shifter;
			}
		}
}
System.out.print("Sorted order from least to greatest: \n");
for(int f = 0; f < inputnum.length; f++){
	System.out.print(inputnum[f] + "\n");
}
System.out.print("\n \n \n \n \n");
	}
}