/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathmessages;

import Listeners.PlayerDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bogar
 */
public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        new PlayerDeathListener(this);
    }
    
}
