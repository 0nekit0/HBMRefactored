package com.hbm.init.creativetabs;

import com.hbm.hbm;
import com.hbm.init.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = hbm.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTab_HBMMissilesAndSatellites {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, hbm.MODID);

    public static final List<Supplier<? extends ItemLike>> HBM_MISSILES_AND_SATELLITES_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> HBM_MISSILES_AND_SATELLITES = TABS.register("hbm_missiles_and_satellites",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hbm_missiles_and_satellites"))
                    .icon(ModItems.BILLET_PLUTONIUM.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            HBM_MISSILES_AND_SATELLITES_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        HBM_MISSILES_AND_SATELLITES_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
