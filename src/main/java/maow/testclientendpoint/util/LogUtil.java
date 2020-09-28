package maow.testclientendpoint.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
    private static boolean logEnabled = false;
    public static final Logger logger = LogManager.getLogger("TestClient Endpoint");

    public static void log(Level level, String string) {
        if (logEnabled) {
            logger.log(level, string);
        }
    }

    public static void setLogEnabled(boolean logEnabled) {
        LogUtil.logEnabled = logEnabled;
    }

    public static boolean isLogEnabled() {
        return logEnabled;
    }
}
