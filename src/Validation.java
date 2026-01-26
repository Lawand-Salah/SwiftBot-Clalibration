import swiftbot.Button;
import java.util.Scanner;
import swiftbot.SwiftBotAPI;

public class Validation {
	
static SwiftBotAPI swiftbot = SwiftBotAPI.INSTANCE;
	
	final static double kValue = 3.8022; // time in seconds
	final static int timeSeconds = 2;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("--- Swiftbot Validation Test ---");
		System.out.println("Enter the distance the robot should travel (cm): ");
		
		double targetDistance = reader.nextDouble();
		double calculatedSpeed = (targetDistance / timeSeconds) / kValue;
		
//		NOTE: This rounds the variable into a whole integer number
		int finalSpeed = (int) Math.round(calculatedSpeed);
		
		System.out.println("To travel distance " + targetDistance + "cm, moving at speed: " + finalSpeed + "%");
		System.out.println("Press Enter");
		reader.nextLine();	
		reader.nextLine();
		swiftbot.move(finalSpeed, finalSpeed, timeSeconds * 1000);
		
		System.out.println("Test Complete.");
		reader.close();
	}

}
