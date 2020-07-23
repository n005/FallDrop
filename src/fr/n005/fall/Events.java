package fr.n005.fall;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;


public class Events implements Listener {
	@EventHandler
	public void Fall(EntityDamageEvent e) { /
		if (!(e.getEntity() instanceof Player)) {
			return;
		}
		 Player player = (Player) e.getEntity(); 
		 World world = player.getWorld();
		 
		 if (e.getCause() == DamageCause.FALL) {
	     
			 List<ItemStack> items = new ArrayList<ItemStack>();
			 for(int i = 0; i < 36; i++) {
                 items.add(player.getInventory().getItem(i));
                 player.getInventory().clear(i);
             }
             for(ItemStack item : items) {
            	 if (item != null) {
            		 world.dropItem(player.getLocation(), item).setPickupDelay(20);
            	 }
             }
             items.clear();
             return;
         
		}
   }
}
