package View;
import javax.swing.*;  
public class Interface {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("Interface"); //creating instance of JFrame  
        
        JLabel label1, label2;
        label1 = new JLabel("First label");
        label2 = new JLabel("Second label");

        label1.setBounds(250, 50, 100, 30);
        label2.setBounds(100, 50, 100, 30);

        frame.add(label1); 
        frame.add(label2);

        JButton button =new JButton("Ok"); //creating instance of JButton  
        button.setBounds(215,215,50, 50); //x axis, y axis, width, height  
                
        frame.add(button); //adding button in JFrame  
                
        frame.setSize(500,500); //400 width and 500 height  
        frame.setLayout(null); //using no layout managers  
        frame.setVisible(true); //making the frame visible  
    }  
}  