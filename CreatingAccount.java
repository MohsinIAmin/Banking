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
        String holderNID=MassegeBox.inputBoxString("Enter your NID");
        String holderPhoto=MassegeBox.inputBoxString("Enter your photo");
        newAccount=new Account(holderName,holderAddress,holderNumber,holderNID,holderPhoto);
        return true;
    }
}
