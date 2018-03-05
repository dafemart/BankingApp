package account;

import java.util.ArrayList;

public class NormalAccount implements Account {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1882037529038128389L;
	private int AccountNumber;
	private int CurrentBalance;
	private int OwnersBankID;
	
    public NormalAccount(int AccNum, int balance, int BankID){
		
	}

	public void subtractBalance(int balance) {
		// TODO Auto-generated method stub
		
	}

	public void addBalance(int balance) {
		// TODO Auto-generated method stub
		
	}
	
	public void setBalance(int balance){
		
		// TODO Auto-generated method stub;
	}

	public void setAccountNumber(int AccNumber) {
		// TODO Auto-generated method stub
		
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return this.CurrentBalance;
	}

	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
}
