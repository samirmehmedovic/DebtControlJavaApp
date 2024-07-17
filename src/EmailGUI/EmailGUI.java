/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmailGUI;

/**
 *
 * @author podrska
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.*;
//import javax.activation.
import javax.mail.internet.*;
import javax.swing.*;

public class EmailGUI extends JFrame {
    private JTextField recipientField;
    private JTextArea messageArea;
    private JButton sendButton;

    public EmailGUI() {
        setTitle("Send Email");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel recipientLabel = new JLabel("Recipient:");
        recipientLabel.setBounds(10, 10, 80, 25);
        add(recipientLabel);

        recipientField = new JTextField();
        recipientField.setBounds(100, 10, 280, 25);
        add(recipientField);

        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setBounds(10, 50, 80, 25);
        add(messageLabel);

        messageArea = new JTextArea();
        messageArea.setBounds(100, 50, 280, 150);
        add(messageArea);

        sendButton = new JButton("Send");
        sendButton.setBounds(150, 220, 100, 25);
        add(sendButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendEmail(recipientField.getText().trim(), messageArea.getText());
            }
        });
    }

    private void sendEmail(String recipient, String messageText) {
        // Set up the mail server properties
  //      Properties p = System.getProperties();
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Create the session
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("smehmedoviccc@gmail.com", "tmaw lfrn skrr ujcy ");
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("smehmedoviccc@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject("Test Email from GUI");
            message.setText(messageText);

            // Send the email
            Transport.send(message);

            JOptionPane.showMessageDialog(this, "Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to send email.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmailGUI().setVisible(true);
            }
        });
    }
}
