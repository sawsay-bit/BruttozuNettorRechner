import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main implements ActionListener{
	private static JFrame frame;
	private static JLabel salary;
	private static JTextField text;
	private static JButton button;
	private static JLabel answer;
	byte percent = 100;
	double netSalary;
	
	double pOfs = 5.5;
	double s;
	
	double pOfk = 14.6;
	double k;
	
	double pOfkk = 0.90;
	double kk;
	
	double pOfp = 2.55;
	double p;
	
	double pOfa = 3.0;
	double a;
	
	double pOfr = 18.6;
	double r;

	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
        frame.setLayout(null);
        frame.setSize(350,200);
        frame.setBackground(Color.green);
        frame.getContentPane().setBackground(Color.darkGray);
        
        salary = new JLabel("Enter Salary");
        salary.setBounds(10,30,150,25);
        salary.setForeground(Color.cyan);
        frame.add(salary);
        
        text= new JTextField(10);
        text.setBounds(100,30,165,25);
        frame.add(text);
        
        button = new JButton("Click");
        button.setBounds(100,75,80,25);
        button.setForeground(Color.cyan);
        button.addActionListener(new Main());
        frame.add(button);
        
        answer = new JLabel("");
        answer.setBounds(100,110,165,25);
        answer.setForeground(Color.cyan);
        frame.add(answer);
        
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int userInput = Integer.parseInt(text.getText());
		s = (userInput * pOfs) / percent;
		k = (userInput * pOfk) / percent;
		kk = (userInput * pOfkk) / percent;
		p = (userInput * pOfp) / percent;
		a = (userInput * pOfa) / percent;
		r = (userInput * pOfr) / percent;
		
		netSalary =(userInput - (s + k + kk + p + a + r));
		answer.setText("Net-Salary is : " + netSalary);
		
	}

}
