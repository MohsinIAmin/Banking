
package userSector;


public class Account {
    private String accountNumber;
    private String accountHolderName;
    private String accountHolderNID;
    private String accountHolderAddress;
    private String accountHolderPhone;
    private String accountHolderPhoto;
    private double balance;
    private String type;
    private static int accountCounter=0;
    private final int accountStartingRange=10000;
    
    MassegeBox massege=new MassegeBox();
    public Account(){
        
    }
    public Account (String name,String address,String phone){
        this.accountHolderName=name;
        this.accountHolderAddress=address;
        this.accountHolderPhone=phone;
        this.accountHolderNID="";
        this.accountHolderPhoto="";
        accountNumberGenerator();
        this.balance=0;
    }
    public Account(String name,String address,String phone,String nid){
        this.accountHolderName=name;
        this.accountHolderAddress=address;
        this.accountHolderPhone=phone;
        this.accountHolderNID=nid;
        this.accountHolderPhoto="";    
        accountNumberGenerator();
        this.balance=0;
    }
    
    public Account(String name,String address,String phone,String nid,String photo){
        this.accountHolderName=name;
        this.accountHolderAddress=address;
        this.accountHolderPhone=phone;
        this.accountHolderNID=nid;
        this.accountHolderPhoto=photo; 
        accountNumberGenerator();
        this.balance=0;
    }
    public double cheakBalance(){
        return this.balance;
    }
    public String cheakAccountNumber(){
        return this.accountNumber;
    }
    public boolean withdrawl(double amount){
        if(amount<0){
            massege.outputBox("Warning","Negative amount can not be withdrowl");
            return false;
        }
        if(balance-amount>=100){
            balance=balance-amount;
            massege.outputBox("Withdrawl succeful");
            return true;
        }
        massege.outputBox("Warning","Cut your coat according to your cloth");
        return false;
    }
    public boolean deposite(double amount){
        if(amount>0){
            balance=balance+amount;
            massege.outputBox("Deposit succeful");
            return true;
        }
        massege.outputBox("Warning","Deposit failur");
        return false;
    }
    private void accountNumberGenerator(){
        accountCounter+=1;
        int accountNum=accountCounter + accountStartingRange;
        this.accountNumber = ""+accountNum;
    }
    public String informationOfAccountHolder(){
        return "Your account no: "+this.accountNumber
                +"\nName : "+this.accountHolderName
                +"\nNID : "+this.accountHolderNID
                +"\nAddress : "+this.accountHolderAddress
                +"\nPhone : " + this.accountHolderPhone;
    }
    
}
