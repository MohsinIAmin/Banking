package userSector;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MassegeBox {
    private static String input;
    private static boolean cheacker(){
        int check=input.length()-1;
        for(;check!=-1;check--){
            if(!Character.isDigit(input.charAt(check))){
                return false;
            }
        }
        return true;
    }
    public static double inputBoxDouble(String showMassege)
    {
        input=JOptionPane.showInputDialog(showMassege);
        if(!cheacker()){  
            return -1;
        }
        double number=Double.parseDouble(input);
        return number;
    }
    public static int inputBoxInt(String showMassege)
    {        
        input=JOptionPane.showInputDialog(showMassege);
        if(!cheacker()){
            return -1;
        }
        int number=Integer.parseInt(input);
        return number;
    }
    public static String inputBoxString(String showMassege)
    {
        String input=JOptionPane.showInputDialog(showMassege);
        return input;
    }
    public static void outputBox(String showMassege)
    {
        JOptionPane.showMessageDialog(null,showMassege);
    }
    public static void outputBox(String worning,String showMassege){
        JOptionPane.showMessageDialog(null, showMassege , worning, JOptionPane.ERROR_MESSAGE);
    }
    public static void outputBox(String heading,String showMassege,String source){
        ImageIcon icon = new ImageIcon(source);
        JOptionPane.showMessageDialog(null, heading,showMassege, JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}
