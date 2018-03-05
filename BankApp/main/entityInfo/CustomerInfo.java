package entityInfo;

import java.util.ArrayList;

public class CustomerInfo extends EntityInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7967811018727742409L;
	private ArrayList<Integer> AccountNumbers;

	public CustomerInfo(String name, String username, String password, int EntityBankID){
		super(name,username,password,EntityBankID);
	}     
	
	public void setBankID(){
	  //Auto_generated
	}    
}
