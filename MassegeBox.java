/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userSector;

import javax.swing.JOptionPane;


public class MassegeBox {
    double inputBoxDouble(String showMassege)
    {
        String input=JOptionPane.showInputDialog(showMassege);
        if("".equals(input)){
            return -1;
        }
        double number=Double.parseDouble(input);
        return number;
    }
    int inputBoxInt(String showMassege)
    {        
        String input=JOptionPane.showInputDialog(showMassege);
        if("".equals(input)){
            return -1;
        }
        int number=Integer.parseInt(input);
        return number;
    }
    String inputBoxString(String showMassege)
    {
        String input=JOptionPane.showInputDialog(showMassege);
        return input;
    }
    void outputBox(String showMassege)
    {
        JOptionPane.showMessageDialog(null,showMassege);
    }
    
}
