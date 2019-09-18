
package userSector;


public class Bank {
    public static void main(String[] args) {
        MassegeBox massege=new MassegeBox();
        Account arrayOfAccount[]=new Account[2];
        arrayOfAccount[0]=new Account("Mohsin","Gazipur","01534115844");
        arrayOfAccount[1]=new Account("Shirsho","Dhaka","01823546197","12344321566578");
        //arrayOfAccount[0].deposite(massege.inputBox("Deposit"));
        //arrayOfAccount[0].withdrawl(massege.inputBox("Withdrawl"));
        String accountInformation=massege.inputBoxString("Account Number");
        massege.outputBox(accountInformation);
        
        for(Account tempAccount:arrayOfAccount){
            if(accountInformation.equals(tempAccount.cheakAccountNumber())){
                massege.outputBox(tempAccount.informationOfAccountHolder());
            }
        }
    }
}
