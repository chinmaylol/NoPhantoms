package org.chinmay.nophantoms;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class SpawnerEggSpawnEvent implements Listener {
    private final NoPhantoms noPhantoms;
    public SpawnerEggSpawnEvent(NoPhantoms noPhantoms) {
        this.noPhantoms = noPhantoms;
    }
    @EventHandler
    public void onNaturalSpawn(CreatureSpawnEvent e) {
        if (e.getEntity().getType().equals(EntityType.PHANTOM) && e.getSpawnReason().equals(CreatureSpawnEvent.SpawnReason.SPAWNER_EGG)) {
            if (noPhantoms.getConfig().getBoolean("disable-spawneregg-spawn")) {
                e.setCancelled(true);
            }
        }
    }
}
