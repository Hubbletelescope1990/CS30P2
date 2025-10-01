package Skillbuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo314 {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo314 window = new Demo314();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo314() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 680, 488);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(FN.getText().equals("First name"))
				FN.setText("");
			}
		});
		FN.setForeground(new Color(211, 211, 211));
		FN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FN.setText("First name");
		FN.setBounds(68, 27, 235, 79);
		panel.add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(LN.getText().equals("Last name"))
				LN.setText("");
			}
		});
		LN.setForeground(new Color(211, 211, 211));
		LN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LN.setText("Last name");
		LN.setColumns(10);
		LN.setBounds(348, 27, 235, 79);
		panel.add(LN);
		
		JComboBox Grade = new JComboBox();
		Grade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Grade.setModel(new DefaultComboBoxModel(new String[] {"Select grade", "12", "11", "10"}));
		Grade.setBounds(167, 136, 109, 45);
		panel.add(Grade);
		
		JComboBox School = new JComboBox();
		School.setForeground(new Color(0, 0, 0));
		School.setModel(new DefaultComboBoxModel(new String[] {"Select school", "Crescent Heights", "LB Pearson", "James Fowler", "Western"}));
		School.setFont(new Font("Tahoma", Font.PLAIN, 14));
		School.setBounds(370, 136, 131, 45);
		panel.add(School);
		

		

		
		JTextArea Disp = new JTextArea();
		Disp.setLineWrap(true);
		Disp.setWrapStyleWord(true);
		Disp.setFont(new Font("Monospaced", Font.PLAIN, 13));
		Disp.setBackground(new Color(240, 240, 240));
		Disp.setForeground(new Color(0, 0, 0));
		Disp.setBounds(129, 289, 429, 155);
		panel.add(Disp);
		
		JButton Submit = new JButton("SUBMIT");
		Submit.setBounds(209, 192, 245, 86);
		panel.add(Submit);	
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
					String fn = FN.getText();
					String ln = LN.getText();
					String grade = "";
					String school = "";
					if(Grade.getSelectedItem().equals("12"))
						grade = "12";
					else if(Grade.getSelectedItem().equals("11"))
						grade = "11";
					else
						grade= "10";
					if(School.getSelectedItem().equals("Crescent Heights"))
						school = "Crescent Heights";
					else if(School.getSelectedItem().equals("LB Pearson"))
						school = "LB Pearson";
					else if(School.getSelectedItem().equals("James Fowler"))
						school = "James Fowler";
					else
						school = "Western";
				Disp.setText(fn + " " + ln + " is in grade " + grade + 
						" in " + school + " high school.");
			}
		});
		
	}

}
