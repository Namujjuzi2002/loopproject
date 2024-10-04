package loopproject;
import java.util.Scanner;
public class Loopproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//public banking System
		
		Scanner scanner=new Scanner(System.in);
		//Initialization
		double balance =0.0;
		int choice;
		//using loops to allow user to use banking system
		do {
			System.out.println("welcome to the Banking  system");
			System.out.println("1. check balance");
			System.out.println("2. deposit money");
			System.out.println("3. withdraw money");
			System.out.println("4.exit");
			
			System.out.println("Enter your choice");
			choice= scanner.nextInt();
			//if statements to allow user make choice
			if (choice==1) {
				//to provide feed back based on the users choice
				System.out.println("current  balance is:shs + balance");
				
			}else if(choice==2) {
				System.out.println("enter amount to deposit");
				   double deposit =scanner.nextDouble();
					System.out.println("successfully deposited : shs + deposit");
					
				}else if(choice==3) {
				System.out.println("enter amount to withdraw");
				double withdraw=scanner.nextDouble();
				
				if(withdraw <= balance) {
					balance=withdraw;
					System.out.println("successfully withdrew shs +withdraw");
					}else {
						System.out.println("insufficient balance ");
					}
			}else if(choice==4) {
				System.out.println("thank you for using our bank !");
				
			}else {
				System .out.println("invalid choice! please try again later.");
			}
		
			}while(choice !=4);
		  scanner.close();
		}

}
