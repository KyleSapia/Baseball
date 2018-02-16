package src;

import java.util.Scanner;

public class BaseBall {
	
	public static void main(String[] args) {
		
		BaseBall baseball = new BaseBall();
		baseball.stats();
	}
		private double BA;
		private double OBP;
		private double SLG;
		private double OPS;
		private double TB;
		
		public void stats() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("At bats:");
			double AB = input.nextInt();
			
			System.out.print("Hits:");
			double H = input.nextInt();
			
			System.out.print("Doubles:");
			double Doub = input.nextInt();
			
			System.out.print("Triples:");
			double Trip = input.nextInt();
			
			System.out.print("Home Runs:");
			double HR = input.nextInt();
			
			System.out.print("Runs:");
			double R = input.nextInt();
			
			System.out.print("Walks:");
			double BB = input.nextInt();
			
			double BA = H / AB;
			System.out.printf("BA: %.3f %n", BA);
			
			double OBP = (H + BB) / AB;
			System.out.printf("OBP: %.3f %n", OBP);
			
			double SLG = ((H-HR-Trip-Doub) + (2*Doub) + (3*Trip) + (4*HR)) / AB;
			System.out.printf("SLG: %.3f %n", SLG);
			
			double OPS = OBP + SLG;
			System.out.printf("OBS: %.3f %n", OPS);
			
			double TB = (H-HR-Trip-Doub) + (2*Doub) + (3*Trip) + (4*HR);
			System.out.printf("TB: %.3f %n", TB);
	}
}