package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static Properties prop;
    static FileInputStream input;
    static String fileLocation="src/test/Resources/TestData/";
    static String filename="testconfig.properties";

    public String getProperty(String key)
    {
        prop=new Properties();
        try {
            input=new FileInputStream(fileLocation+filename);

                prop.load(input);
                input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);


    }
}
