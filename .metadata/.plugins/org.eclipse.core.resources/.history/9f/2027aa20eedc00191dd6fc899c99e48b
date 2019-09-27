package maliha_p2;

import java.util.Scanner;

public class maliha_p2 {


		@SuppressWarnings("resource")
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		//weight and height
		//pounds(lbs) or kilograms(kgs)
		//inches or meters

		System.out.print("Enter weight (1 for lbs or 2 for kgs)");
		int wgtInput;
		wgtInput = in.nextInt();
			
			
			if (wgtInput == 1)
			{
				//get weight

				System.out.print("Enter your weight in pounds: ");
				int wgtPounds = 0;
				wgtPounds = in.nextInt();
				
				//get height

				System.out.println("Enter your height in inches: ");
				int hgtInches = in.nextInt();
				
				int bmi1 = ((703 * wgtPounds)/(hgtInches * hgtInches));
				
				//calculate BMI

				System.out.println("Your BMI is: " + bmi1);
				System.out.println("According to the National Heart, Lung and Blood Institute, ");
				
				if (bmi1 < 18)
					System.out.println("You are underweight.");
				
				if (bmi1 >= 18 && bmi1 <= 24)
					System.out.println("You are normal weight.");
				
				if (bmi1 >= 25 && bmi1 <= 29)
					System.out.println("You are overweight.");
				
				if (bmi1 >= 30)
					System.out.println("you are obese.");
			}
			
			if (wgtInput == 2)
			{
				//get weight

				System.out.print("Enter your weight in kilograms: ");
				int wgtKilos = 0;
				wgtKilos = in.nextInt();
				
				System.out.println("Please enter your height in meters: ");
				int hgtMeters = in.nextInt();
				int bmi2 = wgtKilos / (hgtMeters * hgtMeters);
				
				//calculate BMI

				System.out.println("Your BMI is: " + bmi2);
				System.out.println("According to the National Heart, Lung and Blood Institute");
				
				if (bmi2 < 18)
					System.out.println("You are underweight.");
				
				if (bmi2 >= 18 && bmi2 <= 24)
					System.out.println("You are normal weight.");
				
				if (bmi2 >= 25 && bmi2 <= 29)
					System.out.println("You are overweight.");
				
				if (bmi2 >= 30)
					System.out.println("You are obese.");
				
			}
						
			
			//display BMI
			
			
		}
		
	}

