package dataHandler;

import java.io.Serializable;
import java.util.ArrayList;

import request.Request;
import account.Account;

public class AccountsDatabase<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637091477132668554L;
    private ArrayList<T> accounts;
    
    public AccountsDatabase(ArrayList<T> accounts){
    	this.accounts = accounts;
    }
    
    public T getAccountInfo(int AccountNumber){
    	T AssociatedAccount = null;
    	for(T CurrentAccount : this.accounts){
    		if(AccountNumber == ((Account) CurrentAccount).getAccountNumber() ){
    			AssociatedAccount = CurrentAccount;
    			break;
    		}
    	}
    	return AssociatedAccount;
    }
    
    public void addAccount(T AssociatedAccount){
    	this.accounts.add(AssociatedAccount);
    }
}
