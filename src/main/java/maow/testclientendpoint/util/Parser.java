package maow.testclientendpoint.util;

public class Parser {
    public static ParsedCommand parseCommand(String commandString) {
        commandString = commandString.replaceAll("\\s+", "");
        if (commandString.startsWith("TestClientCommand")) {
            String name = commandString.substring(commandString.indexOf("name:") + 5, commandString.indexOf(","));
            String args = commandString.substring(commandString.indexOf("[") + 1, commandString.indexOf("]"));
            String[] splitArgs = args.split(",+");
            return new ParsedCommand(name, splitArgs);
        }
        return null;
    }
}
