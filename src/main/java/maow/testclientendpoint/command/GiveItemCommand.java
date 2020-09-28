package maow.testclientendpoint.command;

import maow.testclientendpoint.api.Command;
import maow.testclientendpoint.util.LogUtil;
import maow.testclientendpoint.util.NumberUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;

@Environment(EnvType.CLIENT)
public class GiveItemCommand implements Command {
    @Override
    public String getName() {
        return "giveitem";
    }

    @Override
    public void run(String[] args) {
        if (MinecraftClient.getInstance().player != null) {
            if (args.length > 1) {
                if (NumberUtil.isInt(args[1])) {
                    ItemStack stack = new ItemStack(Registry.ITEM.get(new Identifier(args[0])), Integer.parseInt(args[1]));
                    MinecraftClient.getInstance().player.inventory.insertStack(stack);
                } else {
                    LogUtil.log(Level.INFO, "Command Error: " + args[1] + " is not an integer.");
                }
            } else {
                LogUtil.log(Level.INFO, "Command Error: Incorrect syntax - Do: giveitem <item id> <count>");
            }
        } else {
            LogUtil.log(Level.INFO, "Command Error: Player not initialized, are you in a world?");
        }
    }
}
