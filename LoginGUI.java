import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginGUI implements ActionListener
{
    public JFrame frame;
    public JPanel panel;
    public JLabel userL;
    public JLabel passL;
    public JTextField username;
    public JPasswordField password;
    public JButton login; 
    
    public void loginFrame()
    {
        frame = new JFrame("Login");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        userL = new JLabel("User: ");
        userL.setBounds(10, 10, 60, 25);
        panel.add(userL);
        
        username = new JTextField();
        username.setBounds(100, 10, 150, 25);
        panel.add(username);
        
        passL = new JLabel("Password: ");
        passL.setBounds(10, 50, 80, 25);
        panel.add(passL);
        
        password = new JPasswordField();
        password.setBounds(100, 50, 150, 25);
        panel.add(password);
        
        login = new JButton("Login");
        login.setBounds(200, 100, 80, 30);
        login.addActionListener(new LoginGUI());
        panel.add(login);
        
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent action)
    {
        if (action.getSource() == login)
        {
            System.out.println("Checking...");
        }
    }
    public static void main(String args[])
    {
        LoginGUI obj = new LoginGUI();
        obj.loginFrame();
    }
}