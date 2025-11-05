package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Stats_part1_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stats_part1_GUI window = new Stats_part1_GUI();
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
	public Stats_part1_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Title = new JLabel("Student test scores");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Title.setForeground(new Color(0, 128, 192));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(22, 11, 377, 35);
		panel.add(Title);
		
		JTextArea ResultArea = new JTextArea();
		ResultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		ResultArea.setRows(15);
		ResultArea.setColumns(40);
		ResultArea.setEditable(false);
		ResultArea.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		ResultArea.setWrapStyleWord(true);
		ResultArea.setLineWrap(true);
		ResultArea.setBackground(new Color(240, 240, 240));
		ResultArea.setBounds(10, 57, 414, 287);
		panel.add(ResultArea);
		
		JButton AnalyzeButton = new JButton("Analyze scores");
		AnalyzeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//clear previous results
				ResultArea.setText("");
				
				File dataFile = new File("..\\Java_Project_Chapter_11\\src\\Skillbuilders\\test.txt");
				FileReader in;
				
				BufferedReader readFile;
				
				String stuName, score;
				double scoreValue;
				
				double lowScore = 100;
				double highScore = 0;
				double avgScore;
				double totalScore = 0;
				int numScore = 0;
				
				NumberFormat percent = NumberFormat.getPercentInstance();
				
				StringBuilder output = new StringBuilder();
				
				try {
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
					output.append("Student scores: \n");
					output.append("----------------\n");
					
					while((stuName = readFile.readLine()) != null) {
						score = readFile.readLine();
						numScore += 1;
						scoreValue = Double.parseDouble(score);
						
						output.append(stuName + " " + percent.format(scoreValue/100) + "\n");
						totalScore += scoreValue;
						
						if(scoreValue < lowScore) {
							lowScore = scoreValue;
						}
						if(scoreValue > highScore) {
							highScore = scoreValue;
						}
					}//end of while loop
					
					avgScore = totalScore / numScore;
					
					output.append("\n Statistics\n");
					output.append("--------------\n");
					
					output.append("Low score: " + percent.format(lowScore/100) + "\n");
					output.append("High score: " + percent.format(highScore/100) + "\n");
					output.append("Average score: " + percent.format(avgScore/100) + "\n");
					output.append("Total students: " + numScore + "\n");
					
					ResultArea.setText(output.toString());
					
					readFile.close();
					in.close();
					
				} catch(FileNotFoundException ex) {
					System.out.println("Fire could not be found.");
					System.out.println("filenotFoundException: " + ex.getMessage());
				} catch(IOException ex) {
					System.out.println("Error: " + ex.getMessage());
				System.err.print("IOException: " + ex.getMessage());
				}
			}
		});
		AnalyzeButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		AnalyzeButton.setBounds(96, 355, 221, 49);
		panel.add(AnalyzeButton);
	}
}
