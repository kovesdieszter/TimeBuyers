package com.codecool.timebuyers.utils;

import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class SendEmail {
    private static String userEmail;

    public SendEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public static void sendMail(String emailAddress) {
        String email = "cctimebuyers@gmail.com"; // sender email
        String password = "CCtimebuyers5"; // sender password

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication(){

                return new PasswordAuthentication(email, password);
            }
        });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
            message.setSubject("Offer from Time Buyers!");
//            message.setText(emailData);
            message.setContent(
                    emailAddress,
                    "text/html");


            Transport.send(message);

        }catch(Exception e){
            System.out.println("SendEmail File Error" + e);
        }
    }
}
