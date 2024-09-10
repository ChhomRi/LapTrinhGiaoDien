/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
/**ja
 *
 * @author DELL
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        JFrame frm = new JFrame("Login Sytem");
        //Tạo thùng chứa các Component
        JPanel p = new JPanel();
        
        p.setLayout(null);
        JLabel lbUser = new JLabel("User Name");
        JLabel lbPass = new JLabel("PassWork");
        
        JTextField txtUser = new JTextField(10);
        JPasswordField txtPass = new JPasswordField(10);
        
        JButton btLogin = new JButton("Login");
        JButton btReset = new JButton("Reset");
        //add các component vào thùng chứa
        p.add(lbUser);
        p.add(txtUser);
        p.add(lbPass);
        p.add(txtPass);
        p.add(btLogin);
        p.add(btReset);
        lbUser.setBounds(10, 10, 100, 30);
        txtUser.setBounds(120, 10, 150, 30);
        
        lbPass.setBounds(10, 50, 100, 30);
        txtPass.setBounds(120, 50, 150, 30);
        
        btLogin.setBounds(30, 90, 100, 30);
        btReset.setBounds(140, 90, 100, 30);
       
        
        frm.add(p);
        frm.setSize(300, 200);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
}
