package ee.zscriptcode.Tutorial;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandTutorial implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Here we need to give items to our player

            // Create a new ItemStack (type: diamond)
            ItemStack diamond = new ItemStack(Material.DIAMOND);


            // Create a new ItemStack (type: brick)
            ItemStack bricks = new ItemStack(Material.BRICK);


            //Note: It's also possible to set the amount directly by creating a new ItemStack. This option is easier and shorter to use.
            //ItemStack bricks = new ItemStack(Material.BRICK, 20);

            // Set the amount of the ItemStack
            bricks.setAmount(20);


            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(bricks, diamond);
        }

        // If the player (or console) uses our command correct, we can return true
        return false;
    }
}
