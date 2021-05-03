

import javax.swing.*;
import java.awt.*;

public class App {
    static void registerUI(){
        JFrame frame = new JFrame("FKIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960,540);

        JPanel loginPanel = new JPanel();
        JTextField userId = new JTextField("ID",20);
        JTextField userPwd = new JTextField("Password",20);
        JButton loginBtn = new JButton("Log In");
        loginPanel.add(userId);
        loginPanel.add(userPwd);
        loginPanel.add(loginBtn);
       
        frame.getContentPane().add(loginPanel);
        frame.setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        request b = new request();
        order o = new order();
        report r = new report();
        approve a = new approve();//test comment
        audit d = new audit();
        register u = new register();

        registerUI();
    }
}
