package tmnt150.Motd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCmd implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            if (strings.length==1){
                Player player = (Player) commandSender;
                player.setDisplayName(strings[0]);
                player.setCustomName(strings[0]);
                player.sendMessage(ChatColor.AQUA+"成功設置匿名為"+ChatColor.RED+strings[0]);
            }else {
                commandSender.sendMessage(ChatColor.RED+"格式為/nick 名稱");
            }
        }else {
            commandSender.sendMessage("請在遊戲中執行");
        }
        return true;
    }
}
