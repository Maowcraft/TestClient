package maow.testclientendpoint;

import maow.ncycloapi.Client;
import maow.testclientendpoint.ncyclo.CommandReceiver;
import maow.testclientendpoint.ncyclo.InitReceiver;
import maow.testclientendpoint.util.LogUtil;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;

public class TestClientEndpoint implements ModInitializer {
    private static final Client client = Client.getInstance();

    private static final InitReceiver initReceiver = new InitReceiver();
    private static final CommandReceiver commandReceiver = new CommandReceiver();

    @Override
    public void onInitialize() {
        LogUtil.log(Level.INFO, "Registering Ncyclo receiver.");
        new Thread(() -> {
            client.addReceiver(initReceiver);
            client.start();
        }, "ncyclo").start();
    }

    public static void init() {
        client.removeReceiver(initReceiver);
        client.addReceiver(commandReceiver);
    }
}
