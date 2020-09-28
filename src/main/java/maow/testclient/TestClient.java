package maow.testclient;

import maow.ncycloapi.Server;
import maow.testclient.util.ConsoleColors;
import maow.testclient.util.NcycloIdentifiers;

public class TestClient {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.BLUE + "- Sending init to the client." + ConsoleColors.RESET);
        if (args.length > 0) {
            if (Boolean.parseBoolean(args[0])) {
                Server.getInstance().send(NcycloIdentifiers.INIT_WITH_LOG);
            } else {
                Server.getInstance().send(NcycloIdentifiers.INIT);
            }
        } else {
            Server.getInstance().send(NcycloIdentifiers.INIT);
        }
        System.out.println(ConsoleColors.BLUE + "- Make sure to check the client to see if the init went through." + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BLUE + "- Giving user terminal powers." + ConsoleColors.RESET);
        Terminal.awaitInput();
    }
}

