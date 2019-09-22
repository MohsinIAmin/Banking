package userSector;

public class CreatingAccount {
    //MassegeBox takingAccountInformation=new MassegeBox();
    Account newAccount;
    public boolean takingInformation(){
        String holderName=MassegeBox.inputBoxString("Enter your name");
        if("".equals(holderName)){
            return false;
        } else {
        }
        String holderAddress=MassegeBox.inputBoxString("Enter your address");
        if(holderAddress.equals("")){
            return false;
        }
        String holderNumber=MassegeBox.inputBoxString("Enter your Phone Number");
        if(holderNumber.equals("")){
            return false;
        }
        newAccount=new Account(holderName,holderAddress,holderNumber,
                MassegeBox.inputBoxString("Enter your NID"),
                MassegeBox.inputBoxString("Enter your photo"));
        return true;
    }
}
