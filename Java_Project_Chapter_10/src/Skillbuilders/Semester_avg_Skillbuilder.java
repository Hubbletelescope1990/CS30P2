package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Semester_avg_Skillbuilder {

	private JFrame frame;
	private JTextField First_Grade;
	private JTextField Second_Grade;
	private JTextField Third_Grade;
	private JTextField EnterSecondGrade;
	private JTextField EnterThirdGrade;
	private JTextField EnterFirstGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester_avg_Skillbuilder window = new Semester_avg_Skillbuilder();
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
	public Semester_avg_Skillbuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		First_Grade = new JTextField();
		First_Grade.setBounds(205, 25, 193, 20);
		panel.add(First_Grade);
		First_Grade.setColumns(10);
		
		Second_Grade = new JTextField();
		Second_Grade.setColumns(10);
		Second_Grade.setBounds(205, 76, 193, 20);
		panel.add(Second_Grade);
		
		Third_Grade = new JTextField();
		Third_Grade.setColumns(10);
		Third_Grade.setBounds(205, 122, 193, 20);
		panel.add(Third_Grade);
		
		EnterSecondGrade = new JTextField();
		EnterSecondGrade.setHorizontalAlignment(SwingConstants.RIGHT);
		EnterSecondGrade.setEditable(false);
		EnterSecondGrade.setText("Enter second grade:");
		EnterSecondGrade.setForeground(Color.BLACK);
		EnterSecondGrade.setColumns(10);
		EnterSecondGrade.setBackground(UIManager.getColor("Button.background"));
		EnterSecondGrade.setBounds(96, 76, 109, 20);
		panel.add(EnterSecondGrade);
		
		EnterThirdGrade = new JTextField();
		EnterThirdGrade.setHorizontalAlignment(SwingConstants.RIGHT);
		EnterThirdGrade.setEditable(false);
		EnterThirdGrade.setText("Enter third grade:");
		EnterThirdGrade.setForeground(Color.BLACK);
		EnterThirdGrade.setColumns(10);
		EnterThirdGrade.setBackground(new Color(240, 240, 240));
		EnterThirdGrade.setBounds(96, 122, 109, 20);
		panel.add(EnterThirdGrade);
		
		JTextArea Grade_AVG_Display = new JTextArea();
		Grade_AVG_Display.setBounds(61, 209, 293, 41);
		panel.add(Grade_AVG_Display);
		
		JButton Grade_Submit = new JButton("Calculate average");
		Grade_Submit.setBounds(61, 153, 293, 45);
		panel.add(Grade_Submit);
		
		EnterFirstGrade = new JTextField();
		EnterFirstGrade.setEditable(false);
		EnterFirstGrade.setBackground(new Color(240, 240, 240));
		EnterFirstGrade.setHorizontalAlignment(SwingConstants.RIGHT);
		EnterFirstGrade.setText("Enter first grade:");
		EnterFirstGrade.setBounds(96, 25, 109, 20);
		panel.add(EnterFirstGrade);
		EnterFirstGrade.setColumns(10);
		Grade_Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String grade_1 = First_Grade.getText(); preserved as a comment in case I need them
				//String grade_2 = Second_Grade.getText();
				//String grade_3 = Third_Grade.getText();
				int grade_1 = Integer.parseInt(First_Grade.getText());
				int grade_2 = Integer.parseInt(Second_Grade.getText());
				int grade_3 = Integer.parseInt(Third_Grade.getText());
				int grade_avg = (grade_1 + grade_2 + grade_3)/3;
				Grade_AVG_Display.setText("Your average grade for the semester is: " + grade_avg + "%.");
				
			}
		});
		
	}
}
