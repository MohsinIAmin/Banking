package userSector;

public class BankingMenu {
    
    private int accountHighest = 2;
    public BankingMenu(int accountCount){
        accountHighest=accountCount;
    }
    CreatingAccount user[] = new CreatingAccount[accountHighest];
    private int accountIterator = 0;
    private boolean controll=true;

    public void controller() {
        while (controll) {
            userMenu();
        }
    }
    private void creatNewAccount(){
        user[accountIterator] = new CreatingAccount();
            if(user[accountIterator].takingInformation()){
                accountIterator++;
            } else {
                MassegeBox.outputBox("Warning","Need name ,phone,address to open an account");
            }
    }
    private void userMenu() {
        int choice = MassegeBox.inputBoxInt("1.Account Information\n"
                + "2.Check Balance\n"
                + "3.Creat an account\n"
                + "4.Deposite\n"
                + "5.Withdraw");
        if (choice == 1) {
            String accountNumber=MassegeBox.inputBoxString("AccountNumber");
            
            int j = 0;
            boolean indicator=true;
            while (j != accountIterator) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    MassegeBox.outputBox("Information",user[j].newAccount.informationOfAccountHolder(),
                            user[j].newAccount.accountHolderPhoto());
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                MassegeBox.outputBox("Who are you","No such "+accountNumber+" account number");
            }
        } else if (choice == 2) {
            String accountNumber = MassegeBox.inputBoxString("Account Number");
            int j = 0;
            boolean indicator=true;
            while (j != accountIterator) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    MassegeBox.outputBox("Balance : " + user[j].newAccount.cheakBalance());
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                MassegeBox.outputBox("No such "+accountNumber+" account number");
            }
        } else if (choice == 3) {
            if(accountIterator<accountHighest){
               creatNewAccount(); 
            }else {
                MassegeBox.outputBox("Warning","You account limit is exceed");
            }
        } else if (choice == 4) {
            String accountNumber = MassegeBox.inputBoxString("Account Number");
            int j = 0;
            boolean indicator=true;
            while (j != accountIterator) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    user[j].newAccount.deposite(MassegeBox.inputBoxDouble("Enter amount"));
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                MassegeBox.outputBox("No such "+accountNumber+" account number");
            }
        } else if (choice == 5) {
            String accountNumber = MassegeBox.inputBoxString("Account Number");
            boolean indicator=true;
            int j = 0;
            while (j != accountIterator) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    user[j].newAccount.withdrawl(MassegeBox.inputBoxDouble("Enter amount"));
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                MassegeBox.outputBox("No such "+accountNumber+" account number");
            }
        }
        else {
            int surety=MassegeBox.inputBoxInt("Are you want to quite\n"
                    + "1.Yes\n"
                    + "2.No");
            if(surety==1){
                controll=false;
            }
            else if(surety==2){
                
            }else{
                MassegeBox.outputBox("Warning","Don't play with a software");
                controll=false;
            }
        }
    }
}
