package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MyFile_part2of2GUI_edition {

	private JFrame frame;
	private static final String FILE_PATH = "C:\\Users\\38247004\\git\\CS30P2\\Java_Project_Chapter_11\\src\\Skillbuilders\\zzz.txt";
	private File textFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFile_part2of2GUI_edition window = new MyFile_part2of2GUI_edition();
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
	public MyFile_part2of2GUI_edition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textFile = new File(FILE_PATH);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel disp = new JLabel("");
		disp.setHorizontalAlignment(SwingConstants.CENTER);
		disp.setBounds(49, 40, 326, 52);
		panel.add(disp);
		
		JButton keepfile = new JButton("Keep file");
		keepfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFile.exists()) {
					disp.setText("The file already exists. ");
				} else {
					try {
						if(textFile.createNewFile()) {
							disp.setText("File created!");
						} else {
							disp.setText("File could NOT be created.");
						}
					} catch(IOException ex) {
					disp.setText("Error: " + ex.getMessage());
					System.err.print("IOException: " + ex.getMessage());
					}
				}
				
			}
		});
		keepfile.setBounds(28, 119, 163, 62);
		panel.add(keepfile);
		
		JButton deletefile = new JButton("Delete file");
		deletefile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFile.delete()) {
					disp.setText("File Deleted.");
				} else {
					disp.setText("Error! File could not be deleted.");
				}
				
			}
		});
		deletefile.setBounds(226, 119, 163, 62);
		panel.add(deletefile);
	}
}
