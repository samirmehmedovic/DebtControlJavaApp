/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.repositoryImpl;

import debtcontrol.repository.PoslatiMailInterface;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.internet.AddressException;

/**
 *
 * @author podrska
 */
public class PoslatiMailInterfaceImpl implements PoslatiMailInterface {

    Session sesion;

    @Override
    public void poslatiMail(String primaoc, String poruka) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("smehmedoviccc@gmail.com", "tmaw lfrn skrr ujcy ");

            }
        });

   //     primaoc = "smehmedoviccc@gmail.com";
        String predmetMaila = "Test mail";
        String testBody = "Test body of email";

        try {

            Message message = new MimeMessage(session);

            try {
                message.setFrom(new InternetAddress("smehmedoviccc@gmail.com"));
            } catch (MessagingException ex) {
                Logger.getLogger(PoslatiMailInterfaceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(primaoc));
            message.setSubject(predmetMaila);
            message.setText(poruka);

            Transport.send(message);
        } catch (Exception ex) {
            System.out.println("Greska u slanju poruke" + ex.getMessage());
        }

    }

    @Override
    public void postavljanjeServerPostavki() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("smehmedoviccc@gmail.com", "tmaw lfrn skrr ujcy ");

            }
        });

    }

}
