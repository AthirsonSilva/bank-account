package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CView extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textCpf;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CView frame = new CView();
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
	public CView() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("New button");
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "User's info: "
        				+ "\nClient's name: " + textName.getText()
        				+ "\nClient's cpf: " + textCpf.getText()
        				+ "\nClient's email: " + textEmail.getText());
			}
		});
		
		btnSubmit.setBackground(new Color(0, 255, 255));
		btnSubmit.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBounds(185, 215, 104, 35);
		contentPane.add(btnSubmit);
		
		JLabel labelName = new JLabel("Fulll name");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		labelName.setForeground(new Color(0, 0, 0));
		labelName.setBounds(59, 11, 103, 23);
		contentPane.add(labelName);
		
		textName = new JTextField();
		textName.setBounds(166, 14, 151, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCpf.setBounds(69, 45, 103, 23);
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(166, 45, 151, 20);
		contentPane.add(textCpf);
		
		JLabel labelName_1_1 = new JLabel("Email");
		labelName_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		labelName_1_1.setForeground(Color.BLACK);
		labelName_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		labelName_1_1.setBounds(59, 79, 103, 23);
		contentPane.add(labelName_1_1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(166, 82, 151, 20);
		contentPane.add(textEmail);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(new Color(255, 255, 255));
		rbMale.setBounds(166, 109, 109, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBackground(new Color(255, 255, 255));
		rbFemale.setBounds(166, 135, 109, 23);
		contentPane.add(rbFemale);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(166, 170, 151, 23);
		contentPane.add(spinner);
	}
}
