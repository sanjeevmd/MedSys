/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Common;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class ValidateStrings extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
     
        String pattern = "^[0-9]*[a-zA-Z][a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(input, "Please enter a valid string. Special characters are not allowed", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                return true;
            }
        }
        else
        {
            input.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            return true;
        }
    }    
}
