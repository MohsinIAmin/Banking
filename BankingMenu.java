package userSector;

public class BankingMenu {

    MassegeBox showMenu = new MassegeBox();
    CreatingAccount user[] = new CreatingAccount[10];
    private int i = 0;
    private boolean controll=true;

    public void controller() {
        while (controll) {
            userMenu();
        }
    }

    private void userMenu() {
        int choice = showMenu.inputBoxInt("1.Account Information\n"
                + "2.Check Balance\n"
                + "3.Creat an account\n"
                + "4.Deposite\n"
                + "5.Withdraw");
        if (choice == 1) {
            String accountNumber = showMenu.inputBoxString("Account Number");
            int j = 0;
            boolean indicator=true;
            while (j != i) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    showMenu.outputBox(user[j].newAccount.informationOfAccountHolder());
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                showMenu.outputBox("No such "+accountNumber+" account number");
            }
        } else if (choice == 2) {
            String accountNumber = showMenu.inputBoxString("Account Number");
            int j = 0;
            boolean indicator=true;
            while (j != i) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    showMenu.outputBox("Balance : " + user[j].newAccount.cheakBalance());
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                showMenu.outputBox("No such "+accountNumber+" account number");
            }
        } else if (choice == 3) {
            user[i] = new CreatingAccount();
            if(user[i].takingInformation()){
                i++;
            } else {
                showMenu.outputBox("Need name ,phone,address to open an account");
            }
        } else if (choice == 4) {
            String accountNumber = showMenu.inputBoxString("Account Number");
            int j = 0;
            boolean indicator=true;
            while (j != i) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    user[j].newAccount.deposite(showMenu.inputBoxDouble("Enter amount"));
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                showMenu.outputBox("No such "+accountNumber+" account number");
            }
        } else if (choice == 5) {
            String accountNumber = showMenu.inputBoxString("Account Number");
            boolean indicator=true;
            int j = 0;
            while (j != i) {
                if (accountNumber.equals(user[j].newAccount.cheakAccountNumber())) {
                    user[j].newAccount.withdrawl(showMenu.inputBoxDouble("Enter amount"));
                    indicator=false;
                }
                j++;
            }
            if(indicator){
                showMenu.outputBox("No such "+accountNumber+" account number");
            }
        }
        else {
            controll=false;
        }
    }
}
