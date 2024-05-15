package net.m_duck.rabbithole.items;

import net.m_duck.rabbithole.RabbitHole;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RhCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RabbitHole.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RH_TAB = CREATIVE_MODE_TAB.register("rabbit_hole",
            () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.goldKey.get()))
                    .title(Component.translatable("creativetab.rabbit_hole"))
                    .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.goldKey.get());
                            pOutput.accept(ModItems.rastibulka.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
