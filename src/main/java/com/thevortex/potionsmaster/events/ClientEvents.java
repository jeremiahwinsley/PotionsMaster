package com.thevortex.potionsmaster.events;

import com.thevortex.potionsmaster.reference.Reference;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = Reference.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void on(RegisterColorHandlersEvent.Item event) {
        
            
    }
}
