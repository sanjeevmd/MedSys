/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Sanjeev MD
 */
public class SendMail {

    public static void sendMail(String recepient, String content, String subject) throws MessagingException {
        if (recepient == null || recepient.isEmpty()) {
            return;
        }
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        String myacc = "codewalkersneu@gmail.com";
        String mypass = "c0dewalkers!1";

        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myacc, mypass);
            }
        });

        Message message = preparemessage(session, myacc, recepient, content, subject);
        Transport.send(message);
    }

    private static Message preparemessage(Session session, String myAccountmail, String recepient, String content, String subject) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subject);
            message.setText(content);
            return message;
        } catch (Exception e) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
