
package guitest;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class GUITest {

    
    public static void main(String[] args) {
        JFrame jf = new JFrame("My First Window");
        jf.setLayout(new java.awt.GridLayout(3,2));
        JTextField text = new JTextField(20);
        JButton jbok = new JButton("OK");
        JButton jbcancel = new JButton("Cancel");
        
        jbok.addActionListener(new ActionListener(){            
           public void actionPerformed(ActionEvent e){
          
               text.setText("you clicked ok");
               //System.out.println("Okay button clicked");            
             //   JOptionPane.showMessageDialog(null,'');
            }          
        }); 
        
         jbcancel.addActionListener(new ActionListener(){            
           public void actionPerformed(ActionEvent e){
               
               text.setText("you clicked cancel");
        
       
            
            System.out.println("Cancel button clicked");
        }
    });
        jf.add(text);
        jf.add(jbok);
        jf.add(jbcancel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,300);
        jf.setVisible(true);
    }
}
