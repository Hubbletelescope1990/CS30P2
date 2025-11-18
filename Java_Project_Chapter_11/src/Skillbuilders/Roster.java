package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
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

public class Roster {

	private JFrame frame;
	private JTextField filename;
	private JTextField studentcount;
	StuName inputDialog = new StuName();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roster window = new Roster();
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
	public Roster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("File name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 9, 222, 42);
		panel.add(lblNewLabel);
		
		filename = new JTextField();
		filename.setBounds(206, 11, 377, 42);
		panel.add(filename);
		filename.setColumns(10);
		
		JLabel lblNumberOfStudents = new JLabel("Number of students:");
		lblNumberOfStudents.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumberOfStudents.setBounds(24, 64, 222, 42);
		panel.add(lblNumberOfStudents);
		
		studentcount = new JTextField();
		studentcount.setColumns(10);
		studentcount.setBounds(206, 64, 377, 42);
		panel.add(studentcount);
		
		JTextArea Display = new JTextArea();
		Display.setBounds(24, 203, 644, 289);
		panel.add(Display);
		
		JButton makeroster = new JButton("Initialize roster");
		makeroster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int studentnumbers = Integer.parseInt(studentcount.getText().trim());
				String FileName = filename.getText().trim();
				
				if(studentnumbers <= 0 || FileName.isEmpty()) 
				{
					Display.setText("Error! Invalid value for number of students or file name, please try again.");
				} else 
				{
					try 
					{
						
					for(int i = 0; i < studentnumbers; i++) 
					{
						int result = JOptionPane.showConfirmDialog(null,inputDialog,"Enter full name for student " + (i + 1),JOptionPane.OK_CANCEL_OPTION);
						if(result != JOptionPane.OK_OPTION)
						{
							break;
						}
						
						
						String firstname = inputDialog.getfirstname().getText().trim();
						String lastname = inputDialog.getlastname().getText().trim();
						
						if(firstname.isEmpty() || lastname.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Please enter both the name and grade for student " + (i + 1), "Input Error",
									JOptionPane.WARNING_MESSAGE);
							
							i--;
							continue;
						}
					
					
						
					//Write to file
					
					File dataFile = new File(FileName);
					FileWriter out = new FileWriter(dataFile, true);
					BufferedWriter WriteFile = new BufferedWriter(out);
					
					WriteFile.write(firstname);
					WriteFile.newLine();
					WriteFile.write(lastname);
					WriteFile.newLine();
					
					WriteFile.close();
					out.close();
					}
					}
					catch(IOException ex) 
					{
						JOptionPane.showMessageDialog(null, "File could not be created: " + ex.getMessage(), "File error", JOptionPane.ERROR_MESSAGE);
					} catch(NumberFormatException er) 
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid number students.", "Input error", JOptionPane.ERROR_MESSAGE);
					}
				
					Display.setText("");
					File dataFile = new File(FileName);
			        FileReader in;
			        BufferedReader readFile;
			        String firstname, lastname;
			        
			        
			        try {
			        	
			        	 in = new FileReader(dataFile);
				         readFile = new BufferedReader(in);
				         
				         Display.append("CLASS ROSTER:\n");
				            Display.append("---------------\n");
				         
						while ((firstname = readFile.readLine()) != null) {
						    lastname = readFile.readLine();
						    
						    Display.append(firstname + " " + lastname + "\n");
						    
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
			}
		});
		
		makeroster.setFont(new Font("Tahoma", Font.PLAIN, 14));
		makeroster.setBounds(183, 117, 278, 64);
		panel.add(makeroster);
		
	}
}
