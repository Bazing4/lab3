/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacteditor;

import javax.swing.JFrame;
import my.contacteditor.ContactEditorUI;

/**
 *
 * @author clifp
 */
public class ContactEditor extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ContactEditorUI CON = new ContactEditorUI();
      CON.setVisible(true);
    }
    
}