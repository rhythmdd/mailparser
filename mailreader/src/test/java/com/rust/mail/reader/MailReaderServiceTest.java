package com.rust.mail.reader;

import javax.mail.MessagingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MailReaderServiceTest {

    public static void main(String[] args) throws IOException, MessagingException {
        MailReaderService  mailReaderService = new MailReaderService();
        mailReaderService.initFromPath("/Users/rhythmdas/IdeaProjects/mail/mailreader/src/main/resources/mail.properties");

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter username:");
        String username = read.readLine();
        System.out.println("password for " + username  + " : ");
        String password = read.readLine();

        mailReaderService.read(username, password);
    }

}