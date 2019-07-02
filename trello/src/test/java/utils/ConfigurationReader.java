package utils;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    /* Making it Private because it's not visible outside of the class */
    private static Properties configFile;

    /*
     * Static blocks are executed before constructors also, codes inside static
     * block is executed only once!
     */
    static {

        try {
            /*
             * We suspect that this block of statement can throw exception so we handled it
             * by placing these statements inside try and handled the exception in catch
             * block
             */
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);

            configFile = new Properties();
            configFile.load(input);

            input.close();
        } catch (Exception e) {
            /*
             * This is a generic Exception handler which means it can handle all the
             * exceptions. This will execute if the exception is not handled by previous
             * catch blocks.
             */
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
}
