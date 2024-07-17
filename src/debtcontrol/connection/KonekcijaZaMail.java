/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debtcontrol.connection;

import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author podrska
 */
public class KonekcijaZaMail {
    
//    private static  KonekcijaZaMail instance;
//    private final Session session;
//    
//   
//    private KonekcijaZaMail(){
        
        Session session;
   

   public void postavljanjaServerProperties (){
//       
//       Properties properties = System.getProperties();
//       
//       properties.put("mail.smtp.host", "smtp.gmail.com");
//       properties.put("mail.smtp.port", "587");
//        properties.put("mail.smtp.auth", true);
//         properties.put("mail.smtp.starttls.enable", "true");
//   //       properties.put(prop, prop);
//   //       newSession = Session.getDefaultInstance(properties, null);
//   
   
   
   
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
   
        session = Session.getInstance(props, new Authenticator(){
       
       protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication("smehmedoviccc@gmail.com", "tmaw lfrn skrr ujcy ");

        }});
       
   }
        
   
          
   
   
   public void posaljiMail(String mailPrimaoca, String poruka) throws AddressException, MessagingException{
       
       mailPrimaoca = "smehmedoviccc@gmail.com";
       String predmetMaila = "Test mail";
       String testBody = "Test body of email";
       
       
       
       
       Message message = new MimeMessage(session);
       
       message.setFrom(new InternetAddress("smehmedoviccc@gmail.com"));
       message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailPrimaoca));
       message.setSubject(predmetMaila);
       message.setText(poruka);
       
       
       Transport.send(message);
       
      // JOptionPane.showMessageDialog(null, "Email je poslat ");
       
       
       
       
       
       
       
   }
       
       
        
    
    
    
    
    
}
