package ATM_project;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		User_authentication user_auth = new User_authentication();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ATM card");
		System.out.println("ATM Card Insertion Successful");
		System.out.println("Now enter your pin number");
		int pin = sc.nextInt();
		int flag = 1;
		if(user_auth.authentication(pin)==1) {
			System.out.println("Login successful");
		}
		else {
			flag = 0;
			System.out.println("Incorrect Pin number. Try again later");
		}
		if(flag == 1) {
			System.out.println("What can I do for you");
			System.out.println("Press 1 for Balance_enquiry");
			System.out.println("Press 2 for Cash_WithDrawal");
			System.out.println("Press 3 for Cash_Deposit");
			int prompt = sc.nextInt();
			switch(prompt) {
			case 1 :
				Balance_enquiry balan = new Balance_enquiry();
				System.out.println("Your balance is " + balan.getBalance());
				break;
			case 2:
				System.out.println("Enter amount for withdrawl");
				int amount = sc.nextInt();
				Cash_withdrawal withdraw = new Cash_withdrawal(amount);
				System.out.println("Here is your withdrawl amount : "+amount + " and here is your balance : "+ withdraw.return_balance());	
				break;
			case 3:
				System.out.println("Enter amount for deposit");
				int depo = sc.nextInt();
				Cash_deposit deposit = new Cash_deposit(depo);
				System.out.println("Deposit Successful");
				System.out.println("Here is your total balance after deposit : "+deposit.return_deposit());
				break;
			default:
				System.out.println("Caught invalid input : Try after sometime.");
				
			}
		}
		System.out.println("Thank you for reaching us");
		sc.close();
	}
}
