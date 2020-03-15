import javax.swing.*;

public class GUISwing {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25 );
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20 ,165, 25);
        panel.add(userText);

        JLabel passwordLable = new JLabel("Password");
        passwordLable.setBounds(10, 50, 80, 25);
        panel.add(passwordLable);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

        frame.setVisible(true);



    }
}
