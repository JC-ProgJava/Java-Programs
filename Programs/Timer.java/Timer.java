import java.util.Scanner;

public class Timer {
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of hours: ");
	double hourTime = input.nextLong();
	double hourtosec = hourTime * 60 * 60;

	System.out.print("Enter the number of minutes: ");
	double minTime = input.nextLong();
	double mintosec = minTime * 60;

	System.out.print("Exnter the number of seconds: ");
	double time = input.nextLong();
	time = time + mintosec;
	time = time + hourtosec;
        String strihourtsec = String.format ("%.0f", time);

	if(time > 2147483647 || minTime > 2147483647 || hourTime > 2147483647){


		System.out.print("\n \n Sorry, too big...");

	}else if(time < 0 || minTime < 0 || hourTime < 0){
		System.out.print("Incorrect format, numbers are negative");
	} else {
		double as = 0;
System.out.print("\n \n" + strihourtsec + " seconds left \n");
	for (double i = time * 2; i > 0; i--){

		as = as + 1;
		try {
			Thread.sleep(500);
		}catch (InterruptedException ex){
	}

		time = time - 0.5;
		String timestr = String.format ("%.1f", time);

		if(as % 2 == 0){
			System.out.print("\n");
		}
		if(time == 1){
			System.out.print("1 second left \n");
		}else{
		System.out.print(timestr + " seconds left \n");
		}

	}

    }//first if end

System.out.print("\n \n \n \n");

	}//main method end
}//program end