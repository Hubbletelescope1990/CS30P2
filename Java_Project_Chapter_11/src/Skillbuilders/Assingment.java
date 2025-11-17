package Skillbuilders;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class Assingment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assingment window = new Assingment();
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
	public Assingment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea FileDisp = new JTextArea();
		frame.getContentPane().add(FileDisp, BorderLayout.CENTER);
		
		File assingment_file = new File("C:\\Users\\38247004\\Desktop\\Assignment instructions.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(assingment_file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                FileDisp.append(line + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
	}
	
	
	

}
