package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stats_oart2_GUI {

	private JFrame frame;
	private JTextField Filename;
	private JTextField Studentfield;
	Student_Data inputDialog = new Student_Data();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stats_oart2_GUI window = new Stats_oart2_GUI();
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
	public Stats_oart2_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Filename = new JTextField();
		Filename.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Filename.getText().equals("Enter file name here")) {
					Filename.setText("");
				}
				
			}
		});
		Filename.setBounds(10, 11, 296, 54);
		Filename.setForeground(new Color(128, 128, 128));
		Filename.setText("Enter file name here");
		panel.add(Filename);
		Filename.setColumns(10);
		
		Studentfield = new JTextField();
		Studentfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(Studentfield.getText().equals("Enter number of students here")) {
					Studentfield.setText("");
				}
			}
		});
		Studentfield.setBounds(10, 66, 296, 54);
		Studentfield.setText("Enter number of students here");
		Studentfield.setColumns(10);
		panel.add(Studentfield);
		
		JButton Createdata = new JButton("Create data file");
		Createdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = Filename.getText().trim();
				String numStudentsText = Studentfield.getText().trim();
				if(filename.isEmpty() || numStudentsText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter both file name and number of students", "Input Error",
							JOptionPane.WARNING_MESSAGE);
				}
				try {
					int numStu = integer.parseInt(numStudentsText);
					
					StringBuilder studentData = new StringBuilder();
					
					for(in i = 0; i < numStu; i++) {
						int result = JOptionPane.showConfirmDialog(null,inputDialog,"Enter data for student " + (i + 1),JOptionPane.OK_CANCEL_OPTION);
						if(result != JOptionPane.OK_Option) {
							break;
						}
						
						String stuName = inputDialog.getStudentName().trim();
						String score = inputDialog.getStudentGrade().trim();
						
						if(stuName.isEmpty() || score.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Please enter both the name and grade for student " + (i + 1), "Input Error",
									JOptionPane.WARNING_MESSAGE);
							
							i--;
							continue;
						}
					
					try {
						Double.parseDouble(score);
					} catch(NumberFormatException er) {
						JOptionPane.showMessageDialog(null, "Please enter a valid number for the score.", "Input error", JOptionPane.WARNING_MESSAGE);
						
					i--;
					continue;
					}
					studentData.append(stuName).append(": ").append(score).append("\n");
					
					//Write to file
					
					File dataFile = new File(fileName);
					FileWrite out = new FileWriter(dataFile, true);
					BufferedWrite writeFIle = new BefferedWriter(out);
					
					WriteFile.write(stuName);
					WriteFile.newLine();
					WriteFile.write(score);
					WriteFile.newLine();
					
					writeFile.close();
					out.close();
				}
					
				resultArea.setText("Data written to file: " + fileName + "\\n\n");
				resultArea.append("Students entered:\n");
				resultArea.append("-------------------------");
				resultArea.append(studentData.toString());
				resultArea.append("\nFile created successfully!");
				}
				catch(IOException ex) 
				{
					JOptionPane.showMessageDialog(null, "File could not be created: " + ex.getMessage(), "File error", JOptionPane.ERROR_MESSAGE);
				} catch(NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number students.", "Input error", JOptionPane.ERROR_MESSAGE);
				}
			});
		Createdata.setBounds(306, 11, 155, 54);
		panel.add(Createdata);
		
		JButton AnalyzeScores = new JButton("Analyze scores");
		AnalyzeScores.setBounds(306, 66, 155, 54);
		panel.add(AnalyzeScores);
		
		JTextArea ResultArea = new JTextArea();
		ResultArea.setBounds(54, 157, 574, 345);
		panel.add(ResultArea);
		}
}
