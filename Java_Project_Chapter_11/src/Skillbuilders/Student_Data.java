package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Student_Data {

	private JFrame frame;
	private JTextField StudentName;
	private JTextField StudentGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Data window = new Student_Data();
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
	public Student_Data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{242, 0};
		gbl_panel.rowHeights = new int[]{20, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		StudentName = new JTextField();
		StudentName.setText("Enter student name:");
		GridBagConstraints gbc_studentName = new GridBagConstraints();
		gbc_studentName.anchor = GridBagConstraints.NORTH;
		gbc_studentName.fill = GridBagConstraints.HORIZONTAL;
		gbc_studentName.insets = new Insets(0, 0, 5, 0);
		gbc_studentName.gridx = 0;
		gbc_studentName.gridy = 0;
		panel.add(StudentName, gbc_studentName);
		StudentName.setColumns(10);
		
		StudentGrade = new JTextField();
		StudentGrade.setText("Enter student score:");
		GridBagConstraints gbc_studentGrade = new GridBagConstraints();
		gbc_studentGrade.anchor = GridBagConstraints.NORTH;
		gbc_studentGrade.fill = GridBagConstraints.HORIZONTAL;
		gbc_studentGrade.gridx = 0;
		gbc_studentGrade.gridy = 1;
		panel.add(StudentGrade, gbc_studentGrade);
		StudentGrade.setColumns(10);
	}

	public JTextField getStudentName() {
		return StudentName;
	}
	public JTextField getStudentGrade() {
		return StudentGrade;
	}
}
