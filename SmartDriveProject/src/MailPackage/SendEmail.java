/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MailPackage;
import java.security.Security;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author Ankur
 */
public class SendEmail {
   public void send(String toPerson, String senderName)
   {   
        final String username = "ankursmartdrive@gmail.com";
        final String password = "smart@drive";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                }
          });

        try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("ankursmartdrive@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(toPerson));
                message.setSubject("Vehicle Maintenance");
                message.setText("Hello,"
                        + "\n\n I am "+senderName+". My vehicle has broken down and need maintenance. Please do the needful.\n\nThank you.");

                Transport.send(message);

                //System.out.println("Done");

        } catch (MessagingException e) {
            System.out.println("Exception caught!");
                //throw new RuntimeException(e);
        }


   }
}
   
