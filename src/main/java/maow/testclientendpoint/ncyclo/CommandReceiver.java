package maow.testclientendpoint.ncyclo;

import maow.ncycloapi.Receiver;
import maow.testclientendpoint.api.Command;
import maow.testclientendpoint.CommandRegistry;
import maow.testclientendpoint.util.LogUtil;
import maow.testclientendpoint.util.ParsedCommand;
import maow.testclientendpoint.util.Parser;
import org.apache.logging.log4j.Level;

public class CommandReceiver implements Receiver {
    @Override
    public void onReceive(String data) {
        ParsedCommand parsedCommand = Parser.parseCommand(data);
        if (parsedCommand != null) {
            LogUtil.log(Level.INFO, "Received a command: " + parsedCommand.toString());
            String commandName = parsedCommand.getName();
            if (CommandRegistry.has(commandName)) {
                Command command = CommandRegistry.get(commandName);
                command.run(parsedCommand.getArgs());
            }
        }
    }
}
