package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
		
		JTextArea Display = new JTextArea();
		Display.setBounds(10, 235, 681, 320);
		panel.add(Display);
		
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
		String FileName = "C:\\Users\\38247004\\git\\CS30P2\\Java_Project_Chapter_11\\src\\Mastery\\Studentsemavg";
		JButton Savetofile = new JButton("Save to file");
		Savetofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentname = stuname.getText();
				String gradelevel = stugradelevel.getText();
				String semester = semesternum.getText();
				int Grade1 = Integer.parseInt(grade1.getText());
				int Grade2 = Integer.parseInt(grade2.getText());
				int Grade3 = Integer.parseInt(grade3.getText());
				int Grade4 = Integer.parseInt(grade4.getText());
				int average = (Grade1 + Grade2 + Grade3 + Grade4)/4;
				
				String Grade1strn = grade1.getText();
				String Grade2strn = grade2.getText();
				String Grade3strn = grade3.getText();
				String Grade4strn = grade4.getText();
				String averagestrn = Integer.toString(average);
				int catchyesorno = 0;
				if (studentname.isEmpty() || gradelevel.isEmpty() || semester.isEmpty() || Grade1 == 0 || Grade2 == 0 || Grade3 == 0 || Grade4 == 0) 
				{
					Display.setText("Error! One or more of the required fields is either empty or has invalid data, please try again");
				} else 
				{
					File dataFile = new File(FileName);
					FileWriter out;
					try 
					{
					
						out = new FileWriter(dataFile, true);
						BufferedWriter WriteFile = new BufferedWriter(out);
						
						WriteFile.write("name: " + studentname);
						WriteFile.newLine();
						WriteFile.write("Grade level: " + gradelevel);
						WriteFile.newLine();
						WriteFile.write("Semester: " + semester);
						WriteFile.newLine();
						WriteFile.write("Grade 1: " + Grade1strn);
						WriteFile.newLine();
						WriteFile.write("Grade 2: " + Grade2strn);
						WriteFile.newLine();
						WriteFile.write("Grade 3: " + Grade3strn);
						WriteFile.newLine();
						WriteFile.write("Grade 4: " + Grade4strn);
						WriteFile.newLine();
						WriteFile.write("Average: " + averagestrn);
						WriteFile.newLine();
						
						
						WriteFile.close();
						out.close();
					} catch(IOException ex) 
					{
						JOptionPane.showMessageDialog(null, "File could not be created: " + ex.getMessage(), "File error", JOptionPane.ERROR_MESSAGE);
						catchyesorno = 1;
					}
					if (catchyesorno != 1) {
						Display.setText("Data saved to file!");
					}
				}
				
				
			}
		});
		Savetofile.setBounds(159, 212, 173, 23);
		panel.add(Savetofile);
		
		JButton Viewfile = new JButton("View file content");
		Viewfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText("");
				File dataFile = new File(FileName);
		        FileReader in;
		        BufferedReader readFile;
		        String studentname, gradelevel, semester, grade1, grade2, grade3, grade4, average;
		        
		        try {
		        	
		        	 in = new FileReader(dataFile);
			         readFile = new BufferedReader(in);
			         
			         Display.append("Semester average display:\n");
			            Display.append("---------------\n");
			         
					while ((studentname = readFile.readLine()) != null) {
					    gradelevel = readFile.readLine();
					    semester = readFile.readLine();
					    grade1 = readFile.readLine();
					    grade2 = readFile.readLine();
					    grade3 = readFile.readLine();
					    grade4 = readFile.readLine();
					    average = readFile.readLine();
					    
					    Display.append(studentname + "\n");
					    Display.append(gradelevel + "\n");
					    Display.append(semester + "\n");
					    Display.append(grade1 + "\n");
					    Display.append(grade2 + "\n");
					    Display.append(grade3 + "\n");
					    Display.append(grade4 + "\n");
					    Display.append(average + "\n");
					    Display.append(" \n");
					    
					}
				} catch (FileNotFoundException ex) {
		            JOptionPane.showMessageDialog(null, 
			                "File does not exist or could not be found.\n" +
			                "Please check the file path: " + dataFile.getPath(), 
			                "File Not Found", 
			                JOptionPane.ERROR_MESSAGE);
			        } catch (IOException ex) {
			            JOptionPane.showMessageDialog(null, 
			                "Problem reading file: " + ex.getMessage(), 
			                "Read Error", 
			                JOptionPane.ERROR_MESSAGE);
			        }
			}
		});
		Viewfile.setBounds(370, 212, 173, 23);
		panel.add(Viewfile);
	}
}
