package maow.testclientendpoint;

import maow.testclientendpoint.command.ChatCommand;
import maow.testclientendpoint.command.GiveItemCommand;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TestClientEndpointClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CommandRegistry.register(new ChatCommand());
        CommandRegistry.register(new GiveItemCommand());
    }
}
