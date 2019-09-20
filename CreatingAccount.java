package userSector;

public class CreatingAccount {
    MassegeBox takingAccountInformation=new MassegeBox();
    Account newAccount=new Account();
    public boolean takingInformation(){
        String holderName=takingAccountInformation.inputBoxString("Enter your name");
        if("".equals(holderName)){
            return false;
        } else {
        }
        String holderAddress=takingAccountInformation.inputBoxString("Enter your address");
        if(holderAddress.equals("")){
            return false;
        }
        String holderNumber=takingAccountInformation.inputBoxString("Enter your Phone Number");
        if(holderNumber.equals("")){
            return false;
        }
        newAccount=new Account(holderName,holderAddress,holderNumber,
                takingAccountInformation.inputBoxString("Enter your NID"),
                takingAccountInformation.inputBoxString("Enter your photo"));
        return true;
    }
}
