package ATM_project;

public class Cash_withdrawal extends Balance_enquiry{
	int withdrawal;

	public Cash_withdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	public int getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	
	public int return_balance() {
		return balance - withdrawal;
	}
}
