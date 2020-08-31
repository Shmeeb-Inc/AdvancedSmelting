package me.jet315.smelting.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class SmeltingInventoryOpenEvent extends Event implements Cancellable {

    /**
     * Called when starts the Smelting Process
     */

    private static final HandlerList handlers = new HandlerList();

    private final Player player;


    private boolean isCancelled = false;

    public SmeltingInventoryOpenEvent(Player player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * @param b If this is canceled, the plugin will refund items IF the SmeltingType is INVENTORY, else it will not
     */
    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }


}
