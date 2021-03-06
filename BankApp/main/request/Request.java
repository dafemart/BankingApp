package request;

import java.io.Serializable;

public class Request implements Serializable {

	/**
	 * 
	 */
	public static enum RequestType{
		OPENJOINTACCOUNT,
		OPENNORMALACCOUNT,
		CLOSEJOINTACCOUNT,
		CLOSENORMALACCOUNT,
		LINKTOACCOUNT
	}
	
	public static enum RequestStatus{	
		DENIED,
		APPROVED,
		ONHOLD
	}
	
	private static final long serialVersionUID = 936273822996278867L;
	private RequestType WhatType;
	private int AssociatedBankID;
	private int AssociatedAccountNumber;
	private RequestStatus CurrentStatus;
	private int LinkToBankID;
	
	
	public Request(RequestType type, RequestStatus status, int AssociatedBankID){
	     this.WhatType = type;
	     this.CurrentStatus = status;
	     this.AssociatedBankID = AssociatedBankID;
	     this.LinkToBankID = 0;
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
	
	public void setLinkToBankID(int toBankID){
		this.LinkToBankID = toBankID;
	}
	
	public int getLinkToBankID(){
		return this.LinkToBankID;
	}
	
	public void setAccountNumer(int AccountNumber){
		this.AssociatedAccountNumber = AccountNumber;
	}
	
	public int getAccountNumber(){
		return this.AssociatedAccountNumber;
	}
}

