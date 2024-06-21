package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtRePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 393);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(165, 0, 308, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(63, 83, 134, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(63, 140, 134, 28);
		contentPane.add(lblPassword);
		
		JLabel lblRePassword = new JLabel("Re-password");
		lblRePassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRePassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRePassword.setBounds(63, 202, 134, 28);
		contentPane.add(lblRePassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(207, 88, 266, 28);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(207, 145, 266, 28);
		contentPane.add(txtPassword);
		
		txtRePassword = new JPasswordField();
		txtRePassword.setBounds(207, 207, 266, 28);
		contentPane.add(txtRePassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(78, 57, 541, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(78, 290, 541, 2);
		contentPane.add(separator_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(0, 250, 154));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegister.setBounds(135, 313, 128, 33);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(192, 192, 192));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPassword.setText(null);
				txtRePassword.setText(null);
				txtUsername.setText(null);
			}
		});
		btnReset.setBounds(321, 313, 128, 33);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(SystemColor.controlHighlight);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				Login login = new Login();
				login.main(null);
			}
		});
		btnLogin.setBounds(352, 252, 121, 28);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("You already have an account ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(98, 259, 244, 21);
		contentPane.add(lblNewLabel_1);
	}

}
