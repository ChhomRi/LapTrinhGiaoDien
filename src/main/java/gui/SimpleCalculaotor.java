/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class SimpleCalculaotor extends JFrame{
    private JLabel lbNum1,lbNum2, lbResult;
    private JTextField txtNum1, txtNum2,txtResult;
    private JButton btAdd,btSub,btMul,btDiv;
     
    
    public SimpleCalculaotor(String title){
        super(title);
        createGUI();
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    private void createGUI() {
              //Tạo thùng chứa p1
              JPanel p = new JPanel();
              p.setLayout(null);
              p.add(lbNum1 = new JLabel("Num 1"));
              p.add(txtNum1 = new JTextField(10));
              
              
              p.add(lbNum2 = new JLabel("Num 2"));
              p.add(txtNum2 = new JTextField(10));
              
              
              p.add(lbResult = new JLabel("Result"));
              p.add(txtResult = new JTextField(10));
              
              
              //Tạo thùng chứa p2
              
               p.add(btAdd = new JButton("Add"));
               p.add(btSub = new JButton("Sub"));
               p.add(btMul = new JButton("Mul"));
               p.add(btDiv = new JButton("Div"));
               
               
               lbNum1.setBounds(10, 10, 100, 30);
               txtNum1.setBounds(120, 10, 200, 30);
               lbNum2.setBounds(10, 50, 100, 30);
               txtNum2.setBounds(120, 50, 200, 30);
               lbResult.setBounds(10, 100, 100, 30);
               txtResult.setBounds(120, 100, 200, 30);
               
               btAdd.setBounds(10, 140, 80, 40);
               btSub.setBounds(100, 140, 80, 40);
               btMul.setBounds(190, 140, 80, 40);
               btDiv.setBounds(280, 140, 80, 40);
               
               
               add(p);
               //Xử lý phép tính cổng
               btAdd.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                        double x = Double.parseDouble(txtNum1.getText());
                        double y = Double.parseDouble(txtNum2.getText());
                        double kq = x+y;
                        txtResult.setText(String.valueOf(kq));
                        
                        
                        
                        
                    }
                  
               });
               btSub.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                        double x = Double.parseDouble(txtNum1.getText());
                        double y = Double.parseDouble(txtNum2.getText());
                        double kq = x-y;
                        txtResult.setText(String.valueOf(kq));
                          
                    }
                  
               });
               btMul.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                        double x = Double.parseDouble(txtNum1.getText());
                        double y = Double.parseDouble(txtNum2.getText());
                        double kq = x*y;
                        txtResult.setText(String.valueOf(kq)); 
                    }
                  
               });
               btDiv.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                        double x = Double.parseDouble(txtNum1.getText());
                        double y = Double.parseDouble(txtNum2.getText());
                        double kq = x/y;
                        txtResult.setText(String.valueOf(kq));
                        
                    }
                  
               });
               
              
              
                             
              
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCalculaotor frm = new SimpleCalculaotor("Simple  Calculaotor");
        frm.setVisible(true);
    }

   
    
}
