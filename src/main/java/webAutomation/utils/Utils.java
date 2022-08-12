package webAutomation.utils;

/**
 * The type Utils.
 */
public class Utils {

    private static String environment;
    public static String browser;


    /**
     * The constant ENV_QA.
     */
    public static final String ENV_QA = "qa";


    /**
     * For LOCAL run
     */
    public static final String CHROME_BROWSER = "chrome";
    public static final String FIREFOX_BROWSER = "firefox";
    public static final String IE11_BROWSER = "IE11";
    public static final String EDGE_BROWSER = "edge";
    public static final String OPERA_BROWSER = "opera";


    /**
     * Instantiates a new Utils.
     */
    Utils() {

    }

    /**
     * Sets environment.
     *
     * @param env the env
     */
    public static void setEnvironment(String env) {
        switch( env ) {
            case ENV_QA : environment = ENV_QA;
                          break;
            default: throw new IllegalArgumentException();
        }
    }

    /**
     * Gets environment.
     *
     * @return the environment
     */
    public static String getEnvironment() {
        return environment;
    }

    public static void setBrowser(String browser) {
        switch(browser){
            case FIREFOX_BROWSER:
                Utils.browser = FIREFOX_BROWSER;
                break;
            case IE11_BROWSER:
                Utils.browser = IE11_BROWSER;
                break;
            case EDGE_BROWSER:
                Utils.browser = EDGE_BROWSER;
                break;
            default:
                case CHROME_BROWSER:
                    Utils.browser = CHROME_BROWSER;
                    break;
        }
    }


}
