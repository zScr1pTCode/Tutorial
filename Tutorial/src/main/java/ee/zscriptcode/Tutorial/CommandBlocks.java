package ee.zscriptcode.Tutorial;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandBlocks implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Here we need to give items to our player

            // Create a new ItemStack (type: emerald)
            ItemStack emerald = new ItemStack(Material.EMERALD);

            // Create a new ItemStack (type: stone)
            ItemStack stone = new ItemStack(Material.STONE);


            //Note: It's also possible to set the amount directly by creating a new ItemStack. This option is easier and shorter to use.
            //ItemStack bricks = new ItemStack(Material.STONE, 16);
            //ItemStack bricks = new ItemStack(Material.EMERALD, 16);

            // Set the amount of the ItemStack

            emerald.setAmount(16);

            stone.setAmount(4);

            player.getInventory().addItem(emerald, stone);
        }
        return false;
    }
}
