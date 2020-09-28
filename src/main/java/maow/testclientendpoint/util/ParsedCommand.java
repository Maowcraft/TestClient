package maow.testclientendpoint.util;

import java.util.Arrays;

public class ParsedCommand {
    private final String name;
    private final String[] args;

    public ParsedCommand(String name, String[] args) {
        this.name = name;
        this.args = args;
    }

    public String getName() {
        return name;
    }
    public String[] getArgs() {
        return args;
    }

    @Override public String toString() {
        return name + " " + Arrays.toString(args);
    }
}
