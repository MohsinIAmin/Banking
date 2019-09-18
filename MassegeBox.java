/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userSector;

import javax.swing.JOptionPane;


public class MassegeBox {
    double inputBox(String showMassege)
    {
        String input=JOptionPane.showInputDialog(showMassege);
        double number=Double.parseDouble(input);
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
