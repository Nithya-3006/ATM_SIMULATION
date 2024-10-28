package ATM_project;

public class Cash_deposit extends Balance_enquiry{
	int deposit;

	public Cash_deposit(int deposit) {
		this.deposit = deposit;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	public int return_deposit() {
		return deposit + balance;
	}
}
