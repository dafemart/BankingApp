package request;

import java.io.Serializable;

public class Request implements Serializable {

	/**
	 * 
	 */
	public enum RequestType{
		OPENACCOUNT,
		CLOSEACCOUNT
	}
	
	public enum RequestStatus{	
		DENIED,
		APPROVED,
		ONHOLD
	}
	
	private static final long serialVersionUID = 936273822996278867L;
	private RequestType WhatType;
	private int AssociatedBankID;
	private RequestStatus CurrentStatus;
	
	
	public Request(RequestType type, RequestStatus status, int AssociatedBankID){
	     this.WhatType = type;
	     this.CurrentStatus = status;
	     this.AssociatedBankID = AssociatedBankID;
	}
	
	public void setRequestType(RequestType type){
		this.WhatType = type;
	}
	
	public RequestType getRequestType(){
	    return this.WhatType;
	}
	
	public void setRequestStatus(RequestStatus status){
	    this.CurrentStatus = status;
	}
	
	public RequestStatus getRequestStatus(){
	    return this.CurrentStatus;
	}
	
	public int getAssociatedBankID(){
		return this.AssociatedBankID;
	}
}

