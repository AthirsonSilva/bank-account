package View;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ClientView extends JFrame {

	private JLabel labelName;
	private JTextField textName;
	private JLabel labelCpf;
	private JTextField textCpf;
	private JLabel labelEmail;
	private JTextField textEmail;
	private JButton buttonSave;
	
	
	public ClientView() {
		this.setTitle("Python is better"); // Window title
		this.setSize(800, 600); // Window sizing
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Choosing the default window closing operation 
		this.setResizable(false); // True or false for the possibility of resizing the window
		this.setLayout(null); // Sets the LayoutManager

		Container container = getContentPane();
		
		labelName = new JLabel();
		labelName.setText("Full name");
		labelName.setBounds(300, 25, 100, 30);
		container.add(labelName);
		
		textName = new JTextField();
		textName.setBounds(300, 50, 200, 30);
		container.add(textName);
		
		labelCpf = new JLabel();
		labelCpf.setText("CPF");
		labelCpf.setBounds(300, 75, 100, 30);
		container.add(labelCpf);
		
		textCpf = new JTextField();
		textCpf .setBounds(300, 100, 200, 30);
		container.add(textCpf);
		
		labelEmail= new JLabel();
		labelEmail.setText("Email");
		labelEmail.setBounds(300, 125, 100, 30);
		container.add(labelEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(300, 150, 200, 30);
		container.add(textEmail);
		 	
		JButton button =new JButton("Submit"); //creating instance of JButton  
        button.setBounds(300, 190, 100, 50); //x axis, y axis, width, height 
        
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "User's info: "
        				+ "\nClient's name: " + textName.getText()
        				+ "\nClient's cpf: " + textCpf.getText()
        				+ "\nClient's email: " + textEmail.getText());
			}
        	
        });
        
        container.add(button); //adding button in JFrame  
		
		
		this.setVisible(true); // Shows or hides this Window depending on the value of parameter
	}
}
