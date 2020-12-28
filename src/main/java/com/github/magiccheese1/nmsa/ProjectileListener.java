package com.github.magiccheese1.nmsa;

import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileListener implements Listener {

    @EventHandler
    public void projectileHit(ProjectileHitEvent event) {
        if (event.getHitBlock() == null)
            return;
        if (!(event.getEntity() instanceof Arrow))
            return;
        event.getEntity().remove();

    }
}
