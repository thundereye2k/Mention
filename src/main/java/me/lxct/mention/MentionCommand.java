package me.lxct.mention;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static me.lxct.mention.Functions.colorize;
import static me.lxct.mention.Variable.loadVariables;

public class MentionCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mention")) {
            if (args[0].equalsIgnoreCase("reload") || sender.hasPermission("mention.reload")) {
                Mention.plugin.reloadConfig();
                loadVariables();
                sender.sendMessage(colorize("&7Mention reloaded."));
            }
        }
        return true;
    }
}
