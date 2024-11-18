package com.hbm;

import com.hbm.init.creativetabs.CreativeTab_HBMResourcesAndParts;
import com.hbm.init.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(hbm.MODID)
public class hbm {
    public static final String MODID = "hbm";

    public hbm() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        CreativeTab_HBMResourcesAndParts.TABS.register(bus);

    }
}