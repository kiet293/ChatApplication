package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 549, 323);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setBackground(SystemColor.infoText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(153, -2, 203, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(SystemColor.activeCaption);
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(69, 81, 104, 30);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(69, 141, 104, 30);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(SystemColor.textHighlightText);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setBounds(183, 81, 242, 30);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(SystemColor.textHighlightText);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setBounds(183, 141, 242, 30);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(127, 255, 212));
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("king") && username.contains("one")) {
					txtPassword.setText("");
					txtUsername.setText("");
					JOptionPane.showMessageDialog(null, "Dang nhap thanh cong", "Login Valid", JOptionPane.INFORMATION_MESSAGE);
					
					Main main = new Main();
					Main.main(null);
					
				} else if(password.contains("") && username.contains("")) {
					JOptionPane.showMessageDialog(null, "Vui long nhap username and password", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText("");
					txtUsername.setText("");
				}
			}
		});
		btnLogin.setBounds(113, 237, 118, 39);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setForeground(SystemColor.desktop);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(273, 237, 118, 39);
		contentPane.add(btnReset);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setForeground(new Color(70, 130, 180));
		btnNewButton_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			private JFrame frmRegisterSystem;

			public void actionPerformed(ActionEvent e) {
				
				
				frmRegisterSystem = new JFrame("Login");
				if(JOptionPane.showConfirmDialog(frmRegisterSystem, "Confirm if you want to login", "Notify", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Register register = new Register();
					register.main(null);
				}
			}
		});
		btnNewButton_2.setBounds(328, 181, 118, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account yet?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(96, 185, 222, 23);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 54, 405, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(56, 218, 405, 2);
		contentPane.add(separator_1);
	}
}
