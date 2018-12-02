package com.rust.mail.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MailReaderService {

    private static boolean isInitialized = false;
    private Properties properties;

    public void defaultInit( String path) throws IOException {
        this.properties = new Properties();
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println("smtp port = " + properties.get("mail.smtp.port"));
    }

    public void init(Properties properties) {

    }


}
