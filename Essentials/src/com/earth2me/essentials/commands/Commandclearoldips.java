package com.earth2me.essentials.commands;

import com.earth2me.essentials.CommandSource;
import com.earth2me.essentials.User;
import com.earth2me.essentials.UserMap;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Commandclearoldips extends EssentialsCommand {
    public Commandclearoldips() {
        super("clearoldips");
    }

    @Override
    public void run(Server server, CommandSource sender, String commandLabel, String[] args) throws Exception {
        if(sender.isPlayer()){
            Player player = sender.getPlayer();
            if(!player.hasPermission("essentials.ipless.clearold")){
                return;
            }
        }
        clearAllIPS(sender);

    }

    private void clearAllIPS(CommandSource sender){
        final UserMap userMap = ess.getUserMap();
        ess.runTaskAsynchronously(() -> {
            int counter = 0;
            for (final UUID u : userMap.getAllUniqueUsers()) {
                final User user = ess.getUserMap().getUser(u);
                if (user == null) {
                    continue;
                }
                user.setNewLoginAddress("ip less");
                counter++;
            }
            sender.sendMessage("Number of edited accounts: " + counter);
        });
    }
}