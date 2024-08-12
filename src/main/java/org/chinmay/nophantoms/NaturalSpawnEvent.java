package org.chinmay.nophantoms;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class NaturalSpawnEvent implements Listener {
    private final NoPhantoms noPhantoms;
    public NaturalSpawnEvent(NoPhantoms noPhantoms) {
        this.noPhantoms = noPhantoms;
    }
    @EventHandler
    public void onNaturalSpawn(CreatureSpawnEvent e) {
        if (e.getEntity().getType().equals(EntityType.PHANTOM) && e.getSpawnReason().equals(CreatureSpawnEvent.SpawnReason.NATURAL)) {
            if (noPhantoms.getConfig().getBoolean("disable-natural-spawn")) {
                e.setCancelled(true);
            }
        }
    }

}
