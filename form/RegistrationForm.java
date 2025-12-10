import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class Result {
    boolean valid;
    String value;
    Result(boolean valid, String value){
        this.valid=valid;
        this.value=value;
    }
}

class Test implements ActionListener, MouseListener {
    
    JButton jb1, jb2;
    JFrame jf;
    JLabel jl1, jl2, jl3, jl4, jl5, jl6;
    JTextField jt1, jt2, jt3;
    JRadioButton female, male;
    JComboBox<String> jc1;
    ButtonGroup rd1;
    
    void showData(){
        
        String name=jt1.getText();
        String mail=jt2.getText();
        String pass=jt3.getText();
        String gender=male.isSelected()? "Male" : female.isSelected()? "Female": "None";
        String city=(jc1.getSelectedItem()==null)?"0":jc1.getSelectedItem().toString();
        
        jf.getContentPane().removeAll();
        jf.setLayout(null);
        JLabel jl_1=new JLabel("Your Registration Details");
        jl_1.setBounds(250, 20, 400, 40);
        jl_1.setFont(new Font("Verdana", 1, 24));
        jf.add(jl_1);
        
        JLabel jl_2=new JLabel("Name:");
        jl_2.setBounds(70, 90, 100, 40);
        jl_2.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl_2);
        
        JLabel jl_3=new JLabel(name);
        jl_3.setBounds(170, 90, 750, 40);
        jl_3.setFont(new Font("Tahoma", 1, 18));
        jf.add(jl_3);
        
        JLabel jl_4=new JLabel("Email:");
        jl_4.setBounds(70, 140, 100, 40);
        jl_4.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl_4);
        
        JLabel jl_5=new JLabel(mail);
        jl_5.setBounds(170, 140, 750, 40);
        jl_5.setFont(new Font("Tahoma", 1, 18));
        jf.add(jl_5);
        
        JLabel jl_6=new JLabel("Password:");
        jl_6.setBounds(70, 190, 120, 40);
        jl_6.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl_6);
        
        JLabel jl_7=new JLabel(pass);
        jl_7.setBounds(190, 190, 750, 40);
        jl_7.setFont(new Font("Tahoma", 1, 18));
        jf.add(jl_7);
        
        JLabel jl_8=new JLabel("Gender:");
        jl_8.setBounds(70, 240, 100, 40);
        jl_8.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl_8);
        
        JLabel jl_9=new JLabel(gender);
        jl_9.setBounds(170, 240, 90, 40);
        jl_9.setFont(new Font("Tahoma", 1, 18));
        jf.add(jl_9);
        
        JLabel jl_10=new JLabel("City:");
        jl_10.setBounds(70, 290, 100, 40);
        jl_10.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl_10);
        
        JLabel jl_11=new JLabel(city);
        jl_11.setBounds(170, 290, 750, 40);
        jl_11.setFont(new Font("Tahoma", 1, 18));
        jf.add(jl_11);
        
       
        
        
        jf.setVisible(true);
        jf.revalidate();
        jf.repaint();
        
    }
    
    void createFrame(){
        jf=new JFrame();
        jf.setSize(900, 700);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        
        jl1=new JLabel("Registration Form");
        jl1.setBounds(300, 20, 300, 40);
        jl1.setFont(new Font("Verdana", 1, 24));
        jf.add(jl1);
       
        jl2=new JLabel("Name:");
        jl2.setBounds(70, 90, 110, 40);
        jl2.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl2);
        
        jt1=new JTextField();
        jt1.setBounds(190, 90, 400, 40);
        jt1.setFont(new Font("Tahoma", 1, 20));
        jf.add(jt1);
        
        jl3=new JLabel("Email:");
        jl3.setBounds(70, 150, 110, 40);
        jl3.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl3);
        
        jt2=new JTextField();
        jt2.setBounds(190, 150, 400, 40);
        jt2.setFont(new Font("Tahoma", 1, 20));
        jf.add(jt2);
        
        jl4=new JLabel("Password:");
        jl4.setBounds(70, 210, 110, 40);
        jl4.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl4);
        
        jt3=new JPasswordField();
        jt3.setBounds(190, 210, 400, 40);
        jt3.setFont(new Font("Tahoma", 1, 20));
        jf.add(jt3);
        
        jl5=new JLabel("Gender:");
        jl5.setBounds(70, 270, 110, 40);
        jl5.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl5);
        
        male = new JRadioButton("Male");
        male.setBounds(190, 270, 110, 40);
        male.setFont(new Font("Tahoma", 1, 20));
        jf.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(320, 270, 110, 40);
        female.setFont(new Font("Tahoma", 1, 20));
        jf.add(female);
        
        rd1=new ButtonGroup();
        rd1.add(male);
        rd1.add(female); 
        
        jl6=new JLabel("City:");
        jl6.setBounds(70, 330, 110, 40);
        jl6.setFont(new Font("Tahoma", 1, 20));
        jf.add(jl6);
        
        String[] cities={"Delhi", "Pune", "Jaipur", "Bihar", "Mumbai"};
        jc1=new JComboBox<>(cities);
        jc1.setBounds(190, 330, 200, 40);
        jc1.setFont(new Font("Tahoma", 1, 20));
        jc1.setSelectedItem(null);
        jf.add(jc1);
        
        
        
        
        jb1=new JButton("Submit");
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jb1.setBounds(225, 420, 150, 60);
        jb1.setFont(new Font("Tw Cen MT", 1, 25));
        jf.add(jb1);
        
        jb2=new JButton("Clear");
        jb2.addActionListener(this);
        jb2.addMouseListener(this);
        jb2.setBounds(420, 420, 150, 60);
        jb2.setFont(new Font("Tw Cen MT", 1, 25));
        jf.add(jb2);
        
        
        jf.setVisible(true);
    }

    
    Result checkInput(){
        String name=jt1.getText();
        String mail=jt2.getText();
        String pass=jt3.getText();
        String gender=male.isSelected()? "Male" : female.isSelected()? "Female": "None";
        String city=(jc1.getSelectedItem()==null)?"0":jc1.getSelectedItem().toString();
        if(name.equals("")){
            return new Result(false, "Name");
        } else if(mail.equals("")) {
            return new Result(false, "Mail");
        } else if(pass.equals("")) {
            return new Result(false, "Password");
        } else if(gender.equals("None")) {
            return new Result(false, "Gender");
        } else if(city.equals("0")){
            return new Result(false, "City");
        } else {
            return new Result(true, "OK");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==jb1){
//           System.out.println("clicked on submit");
   
             Result r = checkInput();
             if(!r.valid) {
                 String nem=r.value;
                 JOptionPane.showMessageDialog(jf, nem+" can't be empty!");
             }
             else {
                 showData();
             }
           
       } else if(ae.getSource()==jb2) {
//           System.out.println("clicked on clear");
             jt1.setText("");
             jt2.setText("");
             jt3.setText("");
             rd1.clearSelection();
             jc1.setSelectedItem(null);
             
       }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==jb1){
            jb1.setBackground(Color.GREEN);
            jb1.setForeground(Color.WHITE);
        }
        else if(me.getSource()==jb2){
            jb2.setBackground(Color.RED);
            jb2.setForeground(Color.WHITE);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource()==jb1){
            jb1.setBackground(null);
            jb1.setForeground(null);
        }
        else if (me.getSource()==jb2) {
            jb2.setBackground(null);
            jb2.setForeground(null);
        }
    }
    
    
}

public class RegistrationForm {
    public static void main(String[] args) {
        Test t=new Test();
        t.createFrame();
        
    }
}
