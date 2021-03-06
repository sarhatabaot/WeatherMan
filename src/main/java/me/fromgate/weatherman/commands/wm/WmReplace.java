/*
 *  WeatherMan, Minecraft bukkit plugin
 *  ©2012-2018, fromgate, fromgate@gmail.com
 *  https://www.spigotmc.org/resources/weatherman.43379/
 *
 *  This file is part of WeatherMan.
 *
 *  WeatherMan is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  WeatherMan is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with WeatherMan.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package me.fromgate.weatherman.commands.wm;

import me.fromgate.weatherman.commands.Cmd;
import me.fromgate.weatherman.commands.CmdDefine;
import me.fromgate.weatherman.util.BiomeTools;
import me.fromgate.weatherman.util.ParamUtil;
import me.fromgate.weatherman.util.lang.M;
import org.bukkit.Utility;
import org.bukkit.command.CommandSender;

@CmdDefine(command = "weatherman", subCommands = "replace", permission = "weatherman.cmdbiome",
        description = M.CMD_REPLACE, shortDescription = "/wm replace source:<biome1> biome:<biome2> [fill:true] [radius:<radius> [loc:<world,x,z]|region:region]",
        allowConsole = true)
public class WmReplace extends Cmd {
    @Utility
    public boolean execute(CommandSender player, String[] args) {
        return BiomeTools.replaceBiomeCommand(player, ParamUtil.parseParams(args, 1, "param"));
    }
}
