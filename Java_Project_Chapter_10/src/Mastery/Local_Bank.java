package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Local_Bank {

	private JFrame frame;
	private JTextField Acntnum;
	private JTextField depwithd;
	private JTextField fstname;
	private JTextField lstname;
	private JTextField crntblnce;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Local_Bank window = new Local_Bank();
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
	public Local_Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select an action:");
		lblNewLabel.setBounds(20, 11, 82, 14);
		panel.add(lblNewLabel);
		
		JComboBox Action_selection = new JComboBox();
		Action_selection.setBounds(20, 24, 404, 22);
		Action_selection.setModel(new DefaultComboBoxModel(new String[] {"Select action", "deposit", "withdrawl"}));
		panel.add(Action_selection);
		
		JLabel lblNewLabel_2 = new JLabel("Account number:");
		lblNewLabel_2.setBounds(20, 46, 96, 14);
		panel.add(lblNewLabel_2);
		
		Acntnum = new JTextField();
		Acntnum.setBounds(20, 63, 404, 20);
		panel.add(Acntnum);
		Acntnum.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Amount to deposit/withdrawl:");
		lblNewLabel_3.setBounds(20, 85, 262, 14);
		panel.add(lblNewLabel_3);
		
		depwithd = new JTextField();
		depwithd.setBounds(20, 104, 404, 20);
		depwithd.setColumns(10);
		panel.add(depwithd);
		
		JLabel lblNewLabel_4 = new JLabel("First name:");
		lblNewLabel_4.setBounds(20, 128, 241, 14);
		panel.add(lblNewLabel_4);
		
		fstname = new JTextField();
		fstname.setBounds(20, 146, 404, 20);
		fstname.setColumns(10);
		panel.add(fstname);
		
		JLabel lblNewLabel_4_1 = new JLabel("Last name:");
		lblNewLabel_4_1.setBounds(20, 167, 241, 14);
		panel.add(lblNewLabel_4_1);
		
		lstname = new JTextField();
		lstname.setBounds(20, 184, 404, 20);
		lstname.setColumns(10);
		panel.add(lstname);
		
		JLabel lblNewLabel_1 = new JLabel("Current balance:");
		lblNewLabel_1.setBounds(20, 203, 96, 14);
		panel.add(lblNewLabel_1);
		
		crntblnce = new JTextField();
		crntblnce.setBounds(20, 215, 404, 20);
		crntblnce.setColumns(10);
		panel.add(crntblnce);
		
		JTextArea Transactiondisplay = new JTextArea();
		Transactiondisplay.setWrapStyleWord(true);
		Transactiondisplay.setBounds(20, 284, 404, 111);
		panel.add(Transactiondisplay);
		Transactiondisplay.setLineWrap(true);
		
		JButton process_transaction = new JButton("Process transaction");
		process_transaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String actionselect = (java.lang.String) Action_selection.getSelectedItem();
				int accountnum = Integer.parseInt(Acntnum.getText());
				int depositorwithdrawl = Integer.parseInt(depwithd.getText());
				String firstname = fstname.getText();
				String lastname = lstname.getText();
				int currentbalance = Integer.parseInt(crntblnce.getText());
				int new_balance;
				if(Action_selection.getSelectedItem().equals("deposit"))
				{
					new_balance = currentbalance + depositorwithdrawl;
				} else 
				{
					new_balance = currentbalance - depositorwithdrawl;
				}
				if(new_balance <= 0) 
				{
					Transactiondisplay.setText("Error! You cannot withdrawl more money than is currently in your account, please try again");
				} else 
				{
					Transactiondisplay.setText("A " + actionselect + " of value " + depositorwithdrawl + " was requested with account number: "
				+ accountnum + ", owned by: " + firstname + " " + lastname + ". The original account balance was: " + currentbalance + " and the new balance is: " + new_balance + 
				". Thank you for your transaction");
				}
				
			}

			private String String(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		process_transaction.setBounds(20, 246, 404, 23);
		panel.add(process_transaction);
	}
}
