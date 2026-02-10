import swiftbot.Button;
import java.util.Scanner;
import swiftbot.SwiftBotAPI;

public class Calibration {
	static SwiftBotAPI swiftbot = SwiftBotAPI.INSTANCE;
	
	final static int time = 2; // time in seconds
	final static int[] speedPercentages = {20, 30, 40, 50, 60, 70, 80, 90,
	100};
	static int i = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Calibrate Your SwiftBot: ");
		
		for (int i = 0; i < speedPercentages.length; i++) {
			System.out.println("\nType x to and press enter to initialize the test!");
			
			if (i < speedPercentages.length - 1) {
				System.out.println("\nCurrent speed Test: " + speedPercentages[i] + "%");
				System.out.println("\nNext speed Test: " + speedPercentages[i + 1] + "%");
			} else {
				System.out.println("\nCurrent speed Test: " + speedPercentages[i] + "%");
			}
			
			String input = reader.next();
			
			if (input.equalsIgnoreCase("x")) {
				int currentSpeed = speedPercentages[i];
				
				System.out.println("Moving at (" + currentSpeed + ", " + currentSpeed + ")...");
				swiftbot.move(currentSpeed, currentSpeed, time*1000);
			} else {
				System.out.println("\nInavlid input, pls try again!");
				i--;
			}
		}
		System.out.println("\nTesting Finished! Do your measurements.");
		reader.close();
		System.exit(0);
	}
}
