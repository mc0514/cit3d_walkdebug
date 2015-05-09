import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DebugInterface extends JFrame implements ActionListener
{
	protected JLabel var_name1=new JLabel("变量1");
	protected JTextField var1_value1=new JTextField(15);
    protected JButton var_update1=new JButton("更新");
    
    protected JLabel var_name2=new JLabel("变量2");
    protected JTextField var1_value2=new JTextField(15);
    protected JButton var_update2=new JButton("更新");
 
    protected JLabel var_name3=new JLabel("变量3");
    protected JTextField var1_value3=new JTextField(15);
    protected JButton var_update3=new JButton("更新");
 
    protected JLabel var_name4=new JLabel("变量4");
    protected JTextField var1_value4=new JTextField(15);
    protected JButton var_update4=new JButton("更新");
 
    protected JLabel var_name5=new JLabel("变量5");
    protected JTextField var1_value5=new JTextField(15);
    protected JButton var_update5=new JButton("更新");
 
    protected JLabel var_name6=new JLabel("变量6");
    protected JTextField var1_value6=new JTextField(15);
    protected JButton var_update6=new JButton("更新");
 
    protected JLabel var_name7=new JLabel("变量7");
    protected JTextField var1_value7=new JTextField(15);
    protected JButton var_update7=new JButton("更新");
    
    protected JLabel var_name8=new JLabel("变量8");
    protected JTextField var1_value8=new JTextField(15);
    protected JButton var_update8=new JButton("更新");
 
    protected JLabel var_name9=new JLabel("变量9");
    protected JTextField var1_value9=new JTextField(15);
    protected JButton var_update9=new JButton("更新");
    
    protected JLabel var_name10=new JLabel("变量10");
    protected JTextField var1_value10=new JTextField(15);
    protected JButton var_update10=new JButton("更新");
    
    protected JLabel var_name11=new JLabel("变量11");
    protected JTextField var1_value11=new JTextField(15);
    protected JButton var_update11=new JButton("更新");
    
    protected JLabel var_name12=new JLabel("变量12");
    protected JTextField var1_value12=new JTextField(15);
    protected JButton var_update12=new JButton("更新");
    
    protected JLabel var_name13=new JLabel("变量13");
    protected JTextField var1_value13=new JTextField(15);
    protected JButton var_update13=new JButton("更新");
    
    protected JLabel var_name14=new JLabel("变量14");
    protected JTextField var1_value14=new JTextField(15);
    protected JButton var_update14=new JButton("更新");
    
    protected JLabel var_name15=new JLabel("变量15");
    protected JTextField var1_value15=new JTextField(15);
    protected JButton var_update15=new JButton("更新");
                                                    
    protected JButton action1=new JButton("前倒");
    protected JButton action2=new JButton("后倒");
    protected JButton action3=new JButton("前进");
    protected JButton action4=new JButton("前起身");
    protected JButton action5=new JButton("后起身");
    protected JButton action6=new JButton("停止");
    protected JButton action7=new JButton("右转15度");
    protected JButton action8=new JButton("左转15度");
    protected JButton action9=new JButton("后退");
    protected JButton action10=new JButton("水平左移");
    protected JButton action11=new JButton("水平右移");
    
    protected JLabel label1=new JLabel("信息1：：");
    protected JLabel label2=new JLabel("信息2：：");
    protected JLabel label3=new JLabel("信息3：：");
    protected JLabel label4=new JLabel("信息4：：");
    protected JLabel label5=new JLabel("信息5：：");
                                    
    public DebugInterface()  
    {
    	
        super("CIT3D 实时调试工具");
        this.setSize(600,600);
        this.setLayout(null);
        JPanel panel1 = new JPanel();
        this.add(panel1);
        panel1.setBounds(0, 0,100,400);
        panel1.setLayout(new GridLayout(11,1));
        panel1.add(action3);
        panel1.add(action9);
        panel1.add(action6);
        panel1.add(action7);
        panel1.add(action8);
        panel1.add(action10);
        panel1.add(action11);
        panel1.add(action1);
        panel1.add(action4);
        panel1.add(action2);
        panel1.add(action5);
        action1.addActionListener(this);
        action2.addActionListener(this);
        action3.addActionListener(this);
        action4.addActionListener(this);
        action5.addActionListener(this);
        action6.addActionListener(this); 
        action7.addActionListener(this); 
        action8.addActionListener(this); 
        action9.addActionListener(this); 
        action10.addActionListener(this); 
        action11.addActionListener(this); 
        
        JPanel panel2 = new JPanel();
        this.add(panel2);
        panel2.setBounds(110, 0,470,400);
        panel2.setLayout(new GridLayout(9,5));
        panel2.add(var_name1);
        panel2.add(this.var_name2);
        panel2.add(this.var_name3);
        panel2.add(this.var_name4);
        panel2.add(this.var_name5);
        panel2.add(this.var_update1);
        panel2.add(this.var_update2);
        panel2.add(this.var_update3);
        panel2.add(this.var_update4);
        panel2.add(this.var_update5);
        panel2.add(this.var1_value1);
        panel2.add(this.var1_value2);
        panel2.add(this.var1_value3);
        panel2.add(this.var1_value4);
        panel2.add(this.var1_value5);
        panel2.add(this.var_name6);
        panel2.add(this.var_name7);
        panel2.add(this.var_name8);
        panel2.add(this.var_name9);
        panel2.add(this.var_name10);
        panel2.add(this.var_update6);
        panel2.add(this.var_update7);
        panel2.add(this.var_update8);
        panel2.add(this.var_update9);
        panel2.add(this.var_update10);
        panel2.add(this.var1_value6);
        panel2.add(this.var1_value7);
        panel2.add(this.var1_value8);
        panel2.add(this.var1_value9);
        panel2.add(this.var1_value10);
        panel2.add(this.var_name11);
        panel2.add(this.var_name12);
        panel2.add(this.var_name13);
        panel2.add(this.var_name14);
        panel2.add(this.var_name15);
        panel2.add(this.var_update11);
        panel2.add(this.var_update12);
        panel2.add(this.var_update13);
        panel2.add(this.var_update14);
        panel2.add(this.var_update15);
        panel2.add(this.var1_value11);
        panel2.add(this.var1_value12);
        panel2.add(this.var1_value13);
        panel2.add(this.var1_value14);
        panel2.add(this.var1_value15);
        
        var_update1.addActionListener(this);
        var_update2.addActionListener(this);
        var_update3.addActionListener(this);
        var_update4.addActionListener(this);
        var_update5.addActionListener(this);
        var_update6.addActionListener(this);
        var_update7.addActionListener(this);
        var_update8.addActionListener(this);
        var_update9.addActionListener(this);
        var_update10.addActionListener(this);
        var_update11.addActionListener(this);
        var_update12.addActionListener(this);
        var_update13.addActionListener(this);
        var_update14.addActionListener(this);
        var_update15.addActionListener(this);
        
        JPanel panel3 = new JPanel();
        this.add(panel3);
        panel3.setBounds(4,402,584,160);
        panel3.setLayout(new GridLayout(5,1));
        panel3.setBackground(Color.PINK);
        panel3.add(label1);
        panel3.add(label2);
        panel3.add(label3);
        panel3.add(label4);
        panel3.add(label5);
        
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
    	
    }

    /*public static void main(String args[])
    {
    	DebugInterface s= new DebugInterface();
    }*/
}
