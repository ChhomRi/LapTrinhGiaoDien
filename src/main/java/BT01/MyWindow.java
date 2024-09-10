/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;
//import gui.*;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
/**
 *
 * @author DELL
 */
public class MyWindow extends JFrame{
    private JLabel lbUser,lbPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btLogin,btReset;
    public MyWindow(String title){
        super(title);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3,2,10,10));
        p.add(lbUser = new JLabel("User name"));
        p.add(txtUser =new JTextField(10));
        p.add(lbPass = new JLabel("PassWork"));
        p.add(txtPass = new JPasswordField(10));
        
        p.add(btLogin = new JButton("Login"));
        p.add(btReset = new JButton("Reset"));
       
        add(p);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyWindow frm = new MyWindow("Login Sytem");
        frm.setVisible(true);
        
    }
    
}
