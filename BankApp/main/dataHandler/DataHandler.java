package dataHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import entityInfo.*;
import account.*;
import request.Request;

public class DataHandler {
	 static private FileWriter RequestFileWriter;
	 static private FileWriter CustomerInfoFileWriter;
	 static private FileWriter EmployeeInfoFileWriter;
	 static private FileWriter BankInfoFileWriter;
	 static private FileWriter JointAccountInfoFileWriter;
	 static private FileWriter NormalAccountInfoFileWriter;
	 
	 final private static String RequestFilename      = "RequestFile.txt";
	 final private static String CustomerInfoFilename = "CustomerInfoFile.txt";
	 final private static String EmployeeInfoFilename = "EmployeeInfoFile.txt";
	 final private static String BankAdminInfoFilename     = "BankInfoFile.txt";
	 final private static String JointAccountInfoFilename  = "JointAccountInfo.txt";
	 final private static String NormalAccountInfoFilename = "NormalAccountInfo.txt";
	 
	 private static ArrayList<CustomerInfo> CustomerInfoArray;
	 private static ArrayList<EmployeeInfo> EmployeeInfoArray;
	 private static ArrayList<BankAdminInfo> BankAdminInfoArray;
	 private static ArrayList<Request> RequestArray;
	 private static ArrayList<JointAccount> JointAccountArray;
	 private static ArrayList<NormalAccount> NormalAccountArray;
	 
	 private static EntityInfoDatabase<CustomerInfo> CustomerInfoDatabase;
	 private static EntityInfoDatabase<EmployeeInfo> EmployeeInfoDatabase;
	 private static EntityInfoDatabase<BankAdminInfo> BankAdminInfoDatabase;
	 private static RequestsDatabase RequestsDatabase;
	 private static AccountsDatabase<JointAccount> JointAccountsDatabase;
	 private static AccountsDatabase<NormalAccount> NormalAccountsDatabase;

	 
	 public static void initializeFileSystem() throws IOException{
		 RequestFileWriter            = new FileWriter(RequestFilename);
		 CustomerInfoFileWriter       = new FileWriter(CustomerInfoFilename);
		 EmployeeInfoFileWriter       = new FileWriter(EmployeeInfoFilename);
		 BankInfoFileWriter           = new FileWriter(BankAdminInfoFilename);
		 JointAccountInfoFileWriter   = new FileWriter(JointAccountInfoFilename);
		 NormalAccountInfoFileWriter  = new FileWriter(NormalAccountInfoFilename);
		 
		 
		 CustomerInfoArray       = new ArrayList<CustomerInfo>();
		 EmployeeInfoArray       = new ArrayList<EmployeeInfo>();
		 BankAdminInfoArray      = new ArrayList<BankAdminInfo>();
		 RequestArray            = new ArrayList<Request>();
		 JointAccountArray       = new ArrayList<JointAccount>();
		 NormalAccountArray      = new ArrayList<NormalAccount>();
		 
		 CustomerInfoDatabase   = new EntityInfoDatabase<CustomerInfo>(CustomerInfoArray);
		 EmployeeInfoDatabase   = new EntityInfoDatabase<EmployeeInfo>(EmployeeInfoArray);
		 BankAdminInfoDatabase  = new EntityInfoDatabase<BankAdminInfo>(BankAdminInfoArray);
         RequestsDatabase       = new RequestsDatabase(RequestArray);
         JointAccountsDatabase  = new AccountsDatabase<JointAccount>(JointAccountArray);
         NormalAccountsDatabase = new AccountsDatabase<NormalAccount>(NormalAccountArray); 
		 
		 //to be continued
		 
		 storeCustomerInfo(CustomerInfoDatabase);
		 storeBankAdminInfo(BankAdminInfoDatabase);
		 storeEmployeeInfo(EmployeeInfoDatabase);
		 storeRequest(RequestsDatabase);
		 
		 
		 RequestFileWriter.close();
		 EntityInfoFileWriter.close();
		 AccountInfoFileWriter.close();
	 }
	
     public static void storeCustomerInfo(EntityInfoDatabase<CustomerInfo> info){
    	 
     }
     
     public static CustomerInfo readCustomerInfo(int BankID){
    	 return null;
     }
     
     public static void storeBankAdminInfo(EntityInfoDatabase<BankAdminInfo> info){
    	 
     }
     
     public static BankAdminInfo readBankAdminInfo(int BankID){
    	return null; 
     }
     
     public static void storeEmployeeInfo(EntityInfoDatabase<EmployeeInfo> info){
    	 
     }
     
     public static EmployeeInfo readEmployeeInfo(int BankID){
    	 return null;
     }
     
     public static void storeJointAccount(JointAccount account){
    	 
     }
     
     public static JointAccount readJointAccount(int AccountNumber){
    	 return null;
     }
     
     public static void storeNormalAccount(NormalAccount account){
    	 
    	 
     }
     
     public static NormalAccount readNormalAccount(int AccountNumer){
    	 return null;
     }
     
     public static void storeRequest(RequestsDatabase requestsDatabase2){
    	 
     }
     
     public static Request readRequest(int CustomerBankID){
    	 return null;
     }
}
