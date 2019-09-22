
package userSector;


public class Bank {
    public static void main(String[] args) {
        BankingMenu banker=new BankingMenu(MassegeBox.inputBoxInt("With how many account you want to open your bank"));
        banker.controller();
    }
}
