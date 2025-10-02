package Skillbuilders;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roll_skillbuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll_skillbuilder window = new Roll_skillbuilder();
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
	public Roll_skillbuilder() {
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
		
		JLabel Die_1 = new JLabel("Die_1");
		Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_1.jpg"));
		Die_1.setBounds(83, 45, 89, 88);
		panel.add(Die_1);
		
		JLabel Die_2 = new JLabel("Die_1");
		Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_1.jpg"));
		Die_2.setBounds(244, 45, 89, 88);
		panel.add(Die_2);
		Random random = new Random();
		JButton Roll_dice = new JButton("Roll dice");
		Roll_dice.setBounds(162, 181, 89, 23);
		panel.add(Roll_dice);
		Roll_dice.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				int dice_1_roll = random.nextInt(6 - 1 + 1) + 1;
				int dice_2_roll = random.nextInt(6 - 1 + 1) + 1;
				if (dice_1_roll == 1)
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_1.jpg"));
				}else if(dice_1_roll == 2)
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_2.jpg"));
				}else if(dice_1_roll == 3)
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_3.jpg"));
				}else if(dice_1_roll == 4)
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_4.jpg"));
				}else if(dice_1_roll == 5)
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_5.jpg"));
				}else
				{
					Die_1.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_6.jpg"));
				}
				if (dice_2_roll == 1)
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_1.jpg"));
				}else if(dice_2_roll == 2)
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_2.jpg"));
				}else if(dice_2_roll == 3)
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_3.jpg"));
				}else if(dice_2_roll == 4)
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_4.jpg"));
				}else if(dice_2_roll == 5)
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_5.jpg"));
				}else
				{
					Die_2.setIcon(new ImageIcon("C:\\Users\\38247004\\Pictures\\Dice_6.jpg"));
				}
			}
		});
	}

	private void setIcon(JLabel die_1) {
		// TODO Auto-generated method stub
		
	}
}
