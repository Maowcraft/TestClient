package maow.testclientendpoint.ncyclo;

import maow.ncycloapi.Receiver;
import maow.testclientendpoint.TestClientEndpoint;
import maow.testclientendpoint.util.LogUtil;
import org.apache.logging.log4j.Level;

public class InitReceiver implements Receiver {
    @Override
    public void onReceive(String data) {
        if (data.equals("testclient:init") || data.equals("testclient:initlog")) {
            if (data.equals("testclient:initlog")) {
                LogUtil.setLogEnabled(true);
                LogUtil.log(Level.INFO, "Enabled log.");
            }
            LogUtil.log(Level.INFO, "Init signal received.");
            TestClientEndpoint.init();
        }
    }
}
