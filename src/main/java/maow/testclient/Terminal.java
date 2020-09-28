package maow.testclient;

import maow.ncycloapi.Server;
import maow.testclient.util.ConsoleColors;

import java.util.Arrays;
import java.util.Scanner;

public class Terminal {
    private static final Scanner scanner = new Scanner(System.in);

    public static void awaitInput() {
        System.out.print(ConsoleColors.BLUE + "> " + ConsoleColors.RESET);
        String[] input = scanner.nextLine().split("\\s+");
        String command = input[0];
        String[] args = Arrays.copyOfRange(input, 1, input.length);
        processInput(command, args);
    }

    private static void processInput(String command, String[] args) {
        System.out.println(ConsoleColors.BLUE + "- Sending command \"" + command + "\" to the client." + ConsoleColors.RESET);
        Server.getInstance().send("TestClientCommand:{" + "name:" + command + ",args:" + Arrays.toString(args) + "}");
        awaitInput();
    }
}
