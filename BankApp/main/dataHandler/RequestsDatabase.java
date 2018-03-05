package dataHandler;

import java.io.Serializable;
import java.util.ArrayList;

import request.Request;

public class RequestsDatabase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 71804874035459512L;
    private ArrayList<Request> info;
    
    public RequestsDatabase(ArrayList<Request> info){
    	this.info = info;
    }
    
    public Request getEntityInfo(int BankID){
    	Request AssociateInfo = null;
    	for(Request CurrentInfo : this.info){
    		if(BankID == CurrentInfo.getAssociatedBankID()){
    			AssociateInfo = CurrentInfo;
    			break;
    		}
    	}
    	return AssociateInfo;
    }
    
    public void addRequest(Request AssociateInfo){
    	this.info.add(AssociateInfo);
    }
}
