package webAutomation.utils;


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertyUtils {

    private static PropertyUtils instance = null;
    private final Properties properties = new Properties();

    private PropertyUtils(){
        this.loadProperties();
        this.properties.putAll(System.getProperties());
    }

    private static PropertyUtils getInstance(){
        if (PropertyUtils.instance == null) {
            PropertyUtils.instance = new PropertyUtils();
        }
        return PropertyUtils.instance;
    }

    public static String getProperty(final String key) {
        return PropertyUtils.getInstance().properties.getProperty(key);
    }

    public void loadProperties() {
        List<String> filenames = Arrays.asList("config." + Utils.getEnvironment());
        for(String filename : filenames) {
            String filePath = filename + ".properties";
            try (InputStream inputStream = ClassLoader.getSystemResourceAsStream(filePath)) {
                if (inputStream != null) {
                    this.properties.load(inputStream);    
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
