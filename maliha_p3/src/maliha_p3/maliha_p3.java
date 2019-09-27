package maliha_p3;

	import java.util.Scanner;
	public class maliha_p3 {

	public static void main(String[] args) 
	{

			Scanner scnr = new Scanner(System.in);
			
			//String topics
			String[] topics = {"Life", "Politics", "School", "GLobal Warming", "Food"};
			
				
			int [][] ratings = new int [topics.length][];
			
			int m, n;
			
			int rating = 0;

			int numUsers = 0;
			
				
				
			for (m = 0; m < rating; m++){
				
				ratings[m] = new int[10];
				for (n = 0; n < ratings[m].length; n++);
				ratings[m][n] = 0;
			}
				
				
			System.out.print("Number of users rating this topic:");
			numUsers = scnr.nextInt();
				
			//for loop
			System.out.println("Please rate the following topics from 1 being the least important to 10 being the most important.");
				
			for (n = 0; n < topics.length; n++){
				
				System.out.print("Enter your rating for " + topics[n] + ": ");
				rating = scnr.nextInt();
				}
		
				System.out.println("Thank you.");
				
			}
		}
