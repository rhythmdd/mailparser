package com.rust.mail.reader;

import javax.mail.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MailReaderService {

    private static boolean isInitialized = false;
    private Properties properties;


    //throws FileNotFoundException if path is incorrect
    public void initFromPath(String path) throws IOException {
        this.properties = new Properties();
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
    }

    public void init(Properties properties) {
        this.properties = properties;
    }

    public String read(String username, String password) throws MessagingException, IOException {
        String host = "imap.gmail.com";
        Session session = Session.getInstance(properties);
        Store store = session.getStore("imap");
        store.connect(host, username, password);

        Folder inbox = store.getFolder("Inbox");
        inbox.open(Folder.READ_ONLY);
        Message[] messages = inbox.getMessages();
        for (Message message : messages) {
            System.out.println(message.getContent());
        }
        return null;
    }


}
