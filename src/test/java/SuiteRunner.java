import org.junit.runner.JUnitCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import suite.QATestRunner;
import webAutomation.utils.Utils;

import java.io.IOException;

public class SuiteRunner {

    private static final Logger logger = LoggerFactory.getLogger(SuiteRunner.class);

    public static void main(String[] args) throws IOException {

        try {
            // Set browser
            Utils.setBrowser(args[1]);

            switch (args[0]){
                case Utils.ENV_QA:
                    Utils.setEnvironment(args[0]);
                    logger.info("WEB AUTOMATION HAS BEEN STARTED IN " + args[0]);
                    JUnitCore.runClasses(QATestRunner.class);
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
