}

    }

        }

            p.sendMessage(ChatColor.AQUA + "Welcome dawg, here is a fancy shmancy teleport bow that you can play with. ");

            p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
            p.getInventory().addItem(bowUtils.createTeleportBow());
            Player p = e.getPlayer();

        if(plugin.getConfig().getBoolean("give-on-join")){

    public void onPlayerJoin(PlayerJoinEvent e){
    @EventHandler

    }


        }

            }

                p.playSound((Location) p, Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1.0f, 1.0f);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("teleported-message")));
                e.getEntity().remove();

                p.teleport(location);

                Location location = e.getEntity().getLocation();

            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-name")))) {

            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

        if (e.getEntity().getShooter() instanceof Player p) {
        //check to see if it was shot by the teleport bow

    public void onArrowLand(ProjectileHitEvent e) {
    @EventHandler


    }
        this.bowUtils = new BowUtils(plugin);
        this.plugin = plugin;
    public TeleportBowListener(TeleportBow plugin) {

    private final BowUtils bowUtils;
    private final TeleportBow plugin;

public class TeleportBowListener implements Listener {

import org.bukkit.inventory.ItemStack;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Sound;
import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.ChatColor;
import me.srivatsanayyasamy.teleportbow.utility.BowUtils;
import me.srivatsanayyasamy.teleportbow.TeleportBow;

package me.srivatsanayyasamy.teleportbow.listeners;