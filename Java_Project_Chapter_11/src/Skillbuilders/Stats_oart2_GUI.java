package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stats_oart2_GUI {

	private JFrame frame;
	private JTextField Filename;
	private JTextField Studentfield;
	StudentData inputDialog = new StudentData();

	
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
		
	

		
		JTextArea ResultArea = new JTextArea();
		ResultArea.setBounds(54, 157, 574, 345);
		panel.add(ResultArea);
		
		JButton Createdata = new JButton("Create data file");
		Createdata.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String filename = Filename.getText().trim();
				String numStudentsText = Studentfield.getText().trim();
				if(filename.isEmpty() || numStudentsText.isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "Please enter both file name and number of students", "Input Error",
							JOptionPane.WARNING_MESSAGE);
				}
				try {
					int numStu = Integer.parseInt(numStudentsText);
					
					StringBuilder studentData = new StringBuilder();
					
					for(int i = 0; i < numStu; i++) 
					{
						int result = JOptionPane.showConfirmDialog(null,inputDialog,"Enter data for student " + (i + 1),JOptionPane.OK_CANCEL_OPTION);
						if(result != JOptionPane.OK_OPTION)
						{
							break;
						}
						
						String stuName = inputDialog.getname().getText().trim();
						String score = inputDialog.getscore().getText().trim();
						
						if(stuName.isEmpty() || score.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Please enter both the name and grade for student " + (i + 1), "Input Error",
									JOptionPane.WARNING_MESSAGE);
							
							i--;
							continue;
						}
					
					try {
						Double.parseDouble(score);
					} 
					catch(NumberFormatException er) {
						JOptionPane.showMessageDialog(null, "Please enter a valid number for the score.", "Input error", JOptionPane.WARNING_MESSAGE);
						
					i--;
					continue;
					}
					studentData.append(stuName).append(": ").append(score).append("\n");
					
					//Write to file
					
					File dataFile = new File(filename);
					FileWriter out = new FileWriter(dataFile, true);
					BufferedWriter WriteFile = new BufferedWriter(out);
					
					WriteFile.write(stuName);
					WriteFile.newLine();
					WriteFile.write(score);
					WriteFile.newLine();
					
					WriteFile.close();
					out.close();
				}
					
				ResultArea.setText("Data written to file: " + filename + "\\n\n");
				ResultArea.append("Students entered:" + numStudentsText + "\n");
				ResultArea.append("-------------------------\n");
				ResultArea.append(studentData.toString());
				ResultArea.append("\nFile created successfully!");
				}
				catch(IOException ex) 
				{
					JOptionPane.showMessageDialog(null, "File could not be created: " + ex.getMessage(), "File error", JOptionPane.ERROR_MESSAGE);
				} catch(NumberFormatException er) 
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid number students.", "Input error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			});
		Createdata.setBounds(306, 11, 155, 54);
		panel.add(Createdata);
		
		JButton AnalyzeScores = new JButton("Analyze scores");
		AnalyzeScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String fileName = Filename.getText().trim();	
				
				if (fileName.isEmpty()) {
		            JOptionPane.showMessageDialog(null, 
		                "Please enter a file name first.", 
		                "Input Error", 
		                JOptionPane.WARNING_MESSAGE);
		            return;
		        }
				
				
				// Clear previous results
		        ResultArea.setText("");
		        
		        File dataFile = new File(fileName);
		        FileReader in;
		        BufferedReader readFile;
		        String stuName, score;
		        double scoreValue;
		        double lowScore = 100;
		        double highScore = 0;
		        double avgScore;
		        double totalScore = 0;
		        int numScores = 0;

		        NumberFormat percent = NumberFormat.getPercentInstance();
		        
		        StringBuilder output = new StringBuilder();
				
				 try {
			            in = new FileReader(dataFile);
			            readFile = new BufferedReader(in);
			            
			            output.append("STUDENT SCORES:\n");
			            output.append("---------------\n");
			            
			            while ((stuName = readFile.readLine()) != null) {
			                score = readFile.readLine();
			                
			                numScores += 1;
			                scoreValue = Double.parseDouble(score);
			                output.append(stuName + " " + percent.format(scoreValue/100) + "\n");
			                totalScore += scoreValue;
			                
			                if (scoreValue < lowScore) {
			                    lowScore = scoreValue;
			                }
			                if (scoreValue > highScore) {
			                    highScore = scoreValue;
			                }
			            }
			            
			            avgScore = totalScore / numScores;
			            
			            output.append("\nSTATISTICS:\n");
			            output.append("-----------\n");
			            output.append("Low score: " + percent.format(lowScore/100) + "\n");
			            output.append("High score: " + percent.format(highScore/100) + "\n");
			            output.append("Average score: " + percent.format(avgScore/100) + "\n");
			            output.append("Total students: " + numScores + "\n");
			            
			            ResultArea.setText(output.toString());
			            
			            readFile.close();
			            in.close();
			            
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
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, 
			                "Error parsing score data: " + ex.getMessage(), 
			                "Data Format Error", 
			                JOptionPane.ERROR_MESSAGE);
			        }
				
			
			}
		});
		AnalyzeScores.setBounds(306, 66, 155, 54);
		panel.add(AnalyzeScores);
		
	
	
	}	

}