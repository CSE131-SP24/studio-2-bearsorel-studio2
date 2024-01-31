package studio2;

import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int wins = 0;
		int losses = 0;
		int totalSimulations=0;
		int amount=startAmount;
		
	for(int i = 0; i < 500; i ++)
	{
		if (startAmount == 0){
			totalSimulations=i;
			break;
		}
		
		if (wins > winLimit) {
			totalSimulations=i;
			break;
			
		}
		
		if (Math.random()>(winChance)){
		System.out.println("Simulation" + i + ": LOSE");
		amount = amount-1;
		losses += 1;
		totalSimulations=i;
		}
		else {
			System.out.println("Simulation" + i + ": WIN");
			amount = amount +1;
			wins += 1;
			totalSimulations=i;
		}
	}
		System.out.println("Losses: " + losses + " Simulations: " + totalSimulations);
		double a = (1-winChance)/winChance;
		double expectedRuin = ((double)Math.pow(a,startA2mount)-(double)Math.pow(a,winLimit))/(1-(double)Math.pow(a, winLimit));
		
		System.out.println("Ruin Rate from Simulation: " + (double)losses/(double)totalSimulations);
		System.out.println("Expected Ruin Rate: " + expectedRuin);
	}

}
