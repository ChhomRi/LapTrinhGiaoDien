/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;
import java.awt.FlowLayout;
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
        JFrame frm = new JFrame("Tính toán đơn giản");
        //Tạo thùng chứa các Component
        JPanel p = new JPanel();
        
        p.setLayout(new FlowLayout());
        JLabel lbSo1 = new JLabel("Số 1");
        JLabel lbSo2 = new JLabel("Số 2");
        JLabel lbKetqua = new JLabel("Kết quả");
        
        JTextField txtSo1 = new JTextField(10);
        JPasswordField txtSo2 = new JPasswordField(10);
        JPasswordField txtKetQua = new JPasswordField(10);
        
        JButton btAdd = new JButton("Add");
        JButton btSub = new JButton("Sub");
        JButton btMul = new JButton("Mul");
        JButton btDiv = new JButton("Div");
        //add các component vào thùng chứa
        p.add(lbSo1);
        p.add(txtSo1);
        p.add(lbSo2);
        p.add(txtSo2);
        p.add(lbKetqua);
        p.add(txtKetQua);
        p.add(btAdd);
        p.add(btSub);
        p.add(btMul);
        p.add(btDiv);
        
       
        
        frm.add(p);
        frm.setSize(500, 400);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
}
