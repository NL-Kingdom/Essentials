package com.earth2me.essentials.commands;

import com.earth2me.essentials.CommandSource;
import com.earth2me.essentials.Console;
import com.earth2me.essentials.User;
import com.earth2me.essentials.utils.DateUtil;
import com.earth2me.essentials.utils.FormatUtil;
import org.bukkit.BanList;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import java.util.*;
import java.util.logging.Level;

import static com.earth2me.essentials.I18n.tl;

public class Commandtempbanip extends EssentialsCommand {
    public Commandtempbanip() {
        super("tempbanip");
    }

    @Override
    public void run(final Server server, final CommandSource sender, final String commandLabel, final String[] args) throws Exception {
        sender.sendMessage("Command does not work, this is an ip less version of essentials");
    }

    @Override
    protected List<String> getTabCompleteOptions(Server server, CommandSource sender, String commandLabel, String[] args) {
        return Collections.singletonList("command does not work in this version");
    }
}
