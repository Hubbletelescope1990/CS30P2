package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StudentSemesterAverageGUI {

	private JFrame frame;
	private JTextField stuname;
	private JTextField stugradelevel;
	private JTextField semesternum;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverageGUI window = new StudentSemesterAverageGUI();
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
	public StudentSemesterAverageGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 202, 40);
		panel.add(lblNewLabel);
		
		JLabel lblGradeLevel = new JLabel("Grade level:");
		lblGradeLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGradeLevel.setBounds(10, 39, 202, 40);
		panel.add(lblGradeLevel);
		
		JLabel lblSemesterNumber = new JLabel("Semester number:");
		lblSemesterNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemesterNumber.setBounds(10, 66, 202, 40);
		panel.add(lblSemesterNumber);
		
		JLabel lblGrade = new JLabel("Grade 1:");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade.setBounds(10, 93, 202, 40);
		panel.add(lblGrade);
		
		JLabel lblGrade_1 = new JLabel("Grade 2:");
		lblGrade_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_1.setBounds(10, 123, 202, 40);
		panel.add(lblGrade_1);
		
		JLabel lblGrade_2 = new JLabel("Grade 3:");
		lblGrade_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_2.setBounds(10, 150, 202, 40);
		panel.add(lblGrade_2);
		
		JLabel lblGrade_3 = new JLabel("Grade 4:");
		lblGrade_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade_3.setBounds(10, 174, 202, 40);
		panel.add(lblGrade_3);
		
		JLabel lblAverage = new JLabel("Average:");
		lblAverage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAverage.setBounds(10, 201, 202, 40);
		panel.add(lblAverage);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 235, 681, 320);
		panel.add(textArea);
		
		stuname = new JTextField();
		stuname.setBounds(222, 23, 456, 20);
		panel.add(stuname);
		stuname.setColumns(10);
		
		stugradelevel = new JTextField();
		stugradelevel.setColumns(10);
		stugradelevel.setBounds(222, 51, 456, 20);
		panel.add(stugradelevel);
		
		semesternum = new JTextField();
		semesternum.setColumns(10);
		semesternum.setBounds(222, 78, 456, 20);
		panel.add(semesternum);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(222, 105, 456, 20);
		panel.add(grade1);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(222, 135, 456, 20);
		panel.add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(222, 162, 456, 20);
		panel.add(grade3);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		grade4.setBounds(222, 186, 456, 20);
		panel.add(grade4);
		
		JButton Savetofile = new JButton("Save to file");
		Savetofile.setBounds(159, 212, 173, 23);
		panel.add(Savetofile);
		
		JButton Viewfile = new JButton("View file content");
		Viewfile.setBounds(370, 212, 173, 23);
		panel.add(Viewfile);
	}
}
