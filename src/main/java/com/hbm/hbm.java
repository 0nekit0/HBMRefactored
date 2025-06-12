package com.hbm;

import com.hbm.init.creativetabs.*;
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
        CreativeTab_HBMMachineItemsAndFuel.TABS.register(bus);
        CreativeTab_HBMTemplates.TABS.register(bus);
        CreativeTab_HBMOresAndBlocks.TABS.register(bus);
        CreativeTab_HBMMachines.TABS.register(bus);
        CreativeTab_HBMBombs.TABS.register(bus);
        CreativeTab_HBMMissilesAndSatellites.TABS.register(bus);
        CreativeTab_HBMWeaponAndTurrets.TABS.register(bus);
        CreativeTab_HBMConsumablesAndGear.TABS.register(bus);
    }
}