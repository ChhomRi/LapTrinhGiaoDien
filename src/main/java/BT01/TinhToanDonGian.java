/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;
import gui.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
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
    private JButton btCong,btTru,btNhan,btChia,btKetThuc;
     
    
    public TinhToanDonGian(String title){
        super(title);
        createGUI();
        
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    private void createGUI() {
              //Tạo thùng chứa p1
              JPanel p = new JPanel();
              p.setLayout(new  GridLayout(6,3,20,20));
              p.add(lbSo1 = new JLabel("Số 1"));
              p.add(txtSo1 = new JTextField(10));
              
              
              p.add(lbSo2 = new JLabel("Số 2"));
              p.add(txtSo2 = new JTextField(10));
              
              
              p.add(lbKetQua = new JLabel("Result"));
              p.add(txtKetqua = new JTextField(10));
              txtKetqua.setEditable(false);
             
              //Tạo thùng chứa p2
              
               p.add(btCong = new JButton("Cộng"));
               p.add(btTru = new JButton("Trừ"));
               p.add(btNhan = new JButton("Nhân"));
               p.add(btChia= new JButton("Chia"));
               p.add(btKetThuc = new JButton("Kết thúc"));
               
               
              
              
              
               
               add(p);
               //Xử lý phép tính cổng
                btCong.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      //lấy giá trị trong JTextField chuyển sang số
                      try{
                        double x = Double.parseDouble(txtSo1.getText());
                        double y = Double.parseDouble(txtSo2.getText());
                        double kq = x*y;
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
                        double kq = x-y;
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
                        double kq = x*y;
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
               btKetThuc.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      int chon = JOptionPane.showConfirmDialog(null, "Bạn có chắc đóng ứng dụng", "Hỏi lại", JOptionPane.YES_NO_OPTION);
                      if(chon == JOptionPane.YES_OPTION){
                          System.exit(0);
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
