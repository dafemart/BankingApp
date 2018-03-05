package account;

import java.util.ArrayList;

public class JointAccount implements Account {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = -2936039876710552897L;
	private int AccountNumber;
	private int CurrentBalance;
	private ArrayList<Integer> OwnersBankIDs;
	
	public JointAccount(int AccNum, int balance, ArrayList<Integer> BankIDs){
		AccountNumber = AccNum;
		CurrentBalance = balance;
		OwnersBankIDs = BankIDs;
	}

	public void subtractBalance(int balance) {
		this.CurrentBalance -= balance;
		
	}

	public void addBalance(int balance) {
	   this.CurrentBalance += balance;	
	}
	
	public void setBalance(int balance){
		this.CurrentBalance = balance;
	}

	public void setAccountNumber(int AccNumber) {
		this.AccountNumber = AccNumber;
	}

	public int getBalance() {
		return this.CurrentBalance;
	}

	public int getAccountNumber() {
		return this.AccountNumber;
	}
}
