package com.rust.mail.reader;

import java.io.IOException;

import static org.testng.Assert.*;

public class MailReaderServiceTest {

    public static void main(String[] args) throws IOException {
        MailReaderService  mailReaderService = new MailReaderService();
        mailReaderService.defaultInit("/Users/rhythmdas/IdeaProjects/mail/mailreader/src/main/resources/mail.properties");
    }

}