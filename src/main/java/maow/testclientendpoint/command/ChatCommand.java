package maow.testclientendpoint.command;

import maow.testclientendpoint.api.Command;
import maow.testclientendpoint.util.LogUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import org.apache.logging.log4j.Level;

@Environment(EnvType.CLIENT)
public class ChatCommand implements Command {
    @Override
    public String getName() {
        return "chat";
    }

    @Override
    public void run(String[] args) {
        if (MinecraftClient.getInstance().player != null) {
            PlayerEntity player = MinecraftClient.getInstance().player;
            if (args.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (String string : args) {
                    sb.append(string.replaceAll("\\s+", "")).append(" ");
                }
                player.sendMessage(new LiteralText(sb.toString()), false);
            } else {
                LogUtil.log(Level.INFO, "Command Error: Incorrect syntax - Do: chat <chat message>");
            }
        } else {
            LogUtil.log(Level.INFO, "Command Error: Player not initialized, are you in a world?");
        }
    }
}
