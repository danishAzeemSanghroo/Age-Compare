import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class AgeCompare extends Frame implements ActionListener{ 
	JFrame f;
	JLabel L1,L2,L3,trollyL1,trollyL2;
    JTextField tf1,tf2,tf3,result;  
    JButton calc,exit,clear,about;  
    AgeCompare(){  
		f=new JFrame("Age Compare");
		f.setBounds(0,0,1000,1000);

		trollyL1=new JLabel("Sindhiana Transport Co.");
		trollyL1.setBounds(140,20,300,50);
		Font font1=new Font("Adobe Hebrew",Font.BOLD,25);
		trollyL1.setFont(font1);

		trollyL2=new JLabel("AGE COMPARE");
		trollyL2.setBounds(160,40,300,50);
		Font font2=new Font("Adobe Hebrew",Font.BOLD,25);
		trollyL2.setFont(font2);		
		
		L1=new JLabel("Enter 1st Age");
		L1.setBounds(10,100,200,20);
		
		L2=new JLabel("Enter 2nd Age");
		L2.setBounds(10,150,200,20);
		
		L3=new JLabel("Enter 3rd Age");
		L3.setBounds(10,200,200,20);
		
        tf1=new JTextField();  
        tf1.setBounds(200,100,200,20);
		
        tf2=new JTextField();  
        tf2.setBounds(200,150,200,20); 
		
        tf3=new JTextField();  
        tf3.setBounds(200,200,200,20); 
			
		result=new JTextField();
		result.setBounds(200,250,200,30);
		result.setEditable(false);
        calc=new JButton("Compare");  
        calc.setBounds(10,250,150,30);  
				
		
		exit=new JButton("EXIT");
		exit.setBounds(20,300,100,40);
		
		clear=new JButton("CLEAR");
		clear.setBounds(120,300,100,40);
		
		about=new JButton("ABOUT");
		about.setBounds(220,300,100,40);
		
   
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		f.add(calc);
		f.add(trollyL1);
		f.add(trollyL2);
		f.add(L1);
		f.add(L2);
		f.add(L3); 
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(result);
		f.add(exit);
		f.add(clear);
		f.add(about);
		
        setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
		f.show();
	}
	private void clear()
	{
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		result.setText("");
	}			
             
    public void actionPerformed(ActionEvent e) {  
		String s1=tf1.getText();
		int a=Integer.parseInt(s1);
		String s2=tf2.getText();
		int b=Integer.parseInt(s2);
		String s3=tf3.getText();
		int c=Integer.parseInt(s3);	
			if(a>b && a>c)
				result.setText(""+(a+" Age is Greater"));
			if(b>a && b>c)
				result.setText(""+(b+" Age is Greater"));
			if(c>a && c>b)
				result.setText(""+(c+" Age is Greater"));
		
		if(clear==e.getSource()){
			clear();
		}
		if(exit==e.getSource()){
			System.exit(0);
		}
		if(about==e.getSource()){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nContact: 03066558872");
		}				
    }  
public static void main(String[] args) {  
    new AgeCompare();  
}  
}  