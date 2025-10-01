package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metric_Conversion_Skillbuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metric_Conversion_Skillbuilder window = new Metric_Conversion_Skillbuilder();
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
	public Metric_Conversion_Skillbuilder() {
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
		
		JLabel Label = new JLabel("Select conversion type:");
		Label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Label.setBounds(22, 68, 305, 50);
		panel.add(Label);
		JTextArea display = new JTextArea();
		display.setFont(new Font("Tahoma", Font.PLAIN, 22));
		display.setBackground(new Color(240, 240, 240));
		display.setBounds(22, 190, 339, 40);
		panel.add(display);
		
		JComboBox Conversion_selection = new JComboBox();
		Conversion_selection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Conversion_selection.getSelectedItem().equals("inches to centimeters"))
				{
					display.setText("1 inch = 2.54 centimeters.");
				} else if(Conversion_selection.getSelectedItem().equals("feet to meters"))
				{
					display.setText("1 foot = 0.3048 meters.");
				} else if(Conversion_selection.getSelectedItem().equals("gallons to liters"))
				{
					display.setText("1 gallon = 4.5361 liters.");
				}else if(Conversion_selection.getSelectedItem().equals("pounds to kilograms"))
				{
					display.setText("1 pound = 0.4536 kilograms.");
				} else
				{
					display.setText(" ");
				}
				
			}
		});
		Conversion_selection.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Conversion_selection.setModel(new DefaultComboBoxModel(new String[] {"Select conversion type", "inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"}));
		Conversion_selection.setToolTipText("Select conversion type");
		Conversion_selection.setBounds(22, 106, 345, 40);
		panel.add(Conversion_selection);
		
		
	}
}
