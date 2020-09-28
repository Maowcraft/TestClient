package maow.testclientendpoint;

import maow.testclientendpoint.api.Command;

import java.util.HashMap;

public class CommandRegistry {
    private static final HashMap<String, Command> commands = new HashMap<>();

    public static Command get(String name) {
        return commands.get(name);
    }

    public static void register(Command command) {
        commands.put(command.getName(), command);
    }

    public static boolean has(String name) { return commands.containsKey(name); }
}
