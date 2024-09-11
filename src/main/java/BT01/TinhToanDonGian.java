/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;
import gui.*;
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
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class TinhToanDonGian extends JFrame{
    private JLabel lbSo1,lbSo2, lbKetQua;
    private JTextField txtSo1, txtSo2,txtKetqua;
    private JButton btCong,btTru,btNhan,btChia;
     
    
    public TinhToanDonGian(String title){
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
              p.add(lbSo1 = new JLabel("Số 1"));
              p.add(txtSo1 = new JTextField(10));
              
              
              p.add(lbSo2 = new JLabel("Số 2"));
              p.add(txtSo2 = new JTextField(10));
              
              
              p.add(lbKetQua = new JLabel("Result"));
              p.add(txtKetqua = new JTextField(10));
              
              
              //Tạo thùng chứa p2
              
               p.add(btCong = new JButton("Cộng"));
               p.add(btTru = new JButton("Trừ"));
               p.add(btNhan = new JButton("Nhân"));
               p.add(btChia= new JButton("Chia"));
               
               
               lbSo1.setBounds(10, 10, 100, 30);
               txtSo1.setBounds(120, 10, 200, 30);
               lbSo2.setBounds(10, 50, 100, 30);
               txtSo2.setBounds(120, 50, 200, 30);
               lbKetQua.setBounds(10, 100, 100, 30);
               txtKetqua.setBounds(120, 100, 200, 30);
               
               btCong.setBounds(10, 140, 80, 40);
               btTru.setBounds(100, 140, 80, 40);
               btNhan.setBounds(190, 140, 80, 40);
               btChia.setBounds(280, 140, 80, 40);
               
               
               add(p);
               //Xử lý phép tính cổng
                btCong.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                      try{
                          double x = Double.parseDouble(txtSo1.getText());
                        double y = Double.parseDouble(txtSo2.getText());
                        double kq = x/y;
                        txtKetqua.setText(String.valueOf(kq));
                      }catch(Exception ex){
                          JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                      }
                      
                        
                        
                    }
                  
               });
                btTru.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                      try{
                          double x = Double.parseDouble(txtSo1.getText());
                        double y = Double.parseDouble(txtSo2.getText());
                        double kq = x/y;
                        txtKetqua.setText(String.valueOf(kq));
                      }catch(Exception ex){
                          JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                      }
                      
                        
                        
                    }
                  
               });
                btNhan.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                      try{
                          double x = Double.parseDouble(txtSo1.getText());
                        double y = Double.parseDouble(txtSo2.getText());
                        double kq = x/y;
                        txtKetqua.setText(String.valueOf(kq));
                      }catch(Exception ex){
                          JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                      }
                      
                        
                        
                    }
                  
               });
               btChia.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                      try{
                          double x = Double.parseDouble(txtSo1.getText());
                        double y = Double.parseDouble(txtSo2.getText());
                        double kq = x/y;
                        txtKetqua.setText(String.valueOf(kq));
                      }catch(Exception ex){
                          JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                      }
                      
                        
                        
                    }
                  
               });
               
              
              
                             
              
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TinhToanDonGian frm = new TinhToanDonGian("Tính toán cơ bản");
        frm.setVisible(true);
    }

   
    
}
