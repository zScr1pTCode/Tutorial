package ee.zscriptcode.Tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class FlyCommandListener implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String firstArg, String[] args) {

        sender.sendMessage("Wooah! Command works! But it isn't give u a fly, because of testing..");

        return true;

        // *CommandSender sender - is the player who executed the command. We can cast this to a player type later on.

        // *Command command - is the actual command that is being sent (e.g the fly in /fly)

        // *String firstArg - is the first argument of our command (the player in /fly player)

        // *String[] args - are the rest of the arguments after /fly player in an array format.

    }
}
