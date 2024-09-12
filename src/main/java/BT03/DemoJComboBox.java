/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT03;
import gui.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
/**
 *
 * @author DELL
 */
public class DemoJComboBox extends JFrame{
    private JLabel lbNum1,lbNum2,lbOp, lbResult;
    private JTextField txtNum1, txtNum2,txtResult;
    private JButton btTinh,btNhapLai;
    private JComboBox<String> cboPhepTinh;

     
    
    public DemoJComboBox(String title){
        super(title);
        createGUI();
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    private void createGUI() {
              //Tạo thùng chứa p1
              JPanel p = new JPanel();
              p.setLayout(new GridLayout(5,2,10,10));
              p.add(lbNum1 = new JLabel("Num 1"));
              p.add(txtNum1 = new JTextField(10));
              
              //2
              p.add(lbNum2 = new JLabel("Num 2"));
              p.add(txtNum2 = new JTextField(10));
             
              
              //4
              p.add(lbOp = new JLabel("Phép tính"));
              p.add(cboPhepTinh = new JComboBox<>());
              
              p.add(lbResult = new JLabel("Result"));
              p.add(txtResult = new JTextField(10));
              
              txtResult.setEditable(false);
              
              
              //5
              p.add(btTinh = new JButton("Tính"));
              p.add(btNhapLai = new JButton("Nhập lại"));
   
               
               
               add(p);
               
               
               cboPhepTinh.addItem("Cộng");
               cboPhepTinh.addItem("Trừ");
               cboPhepTinh.addItem("Nhân");
               cboPhepTinh.addItem("Chia");
               

               
               
               
               btTinh.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      try{
                          double x = Double.parseDouble(txtNum1.getText());
                          double y = Double.parseDouble(txtNum2.getText());
                          double kq = 0;
                          
                          int selectIntdex = cboPhepTinh.getSelectedIndex();
                          if(selectIntdex==0){
                              kq = x+y;
                          }else if(selectIntdex==1){
                              kq = x-y;
                              
                          }else if(selectIntdex==2){
                              kq = x*y;
                          }else {
                              kq = x/y;
                          }
                          txtResult.setText(String.valueOf(kq));
                          
                      }catch(Exception ex){
                          JOptionPane.showMessageDialog(null, "Lỗi Nhập liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);
                      }
                   }
               });
               btNhapLai.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      txtNum1.setText("");
                      txtNum2.setText("");
                      txtResult.setText("");
                      cboPhepTinh.setSelectedIndex(0);
                       txtNum1.requestFocus();
                     
                     
                    
                    }  
               });
               
               
              
               
              
              
                             
              
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoJComboBox frm = new DemoJComboBox("Simple  Calculaotor");
        frm.setVisible(true);
    }

   
    
}
