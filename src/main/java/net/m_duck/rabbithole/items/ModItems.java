package net.m_duck.rabbithole.items;

import net.m_duck.rabbithole.RabbitHole;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //Список предметов для регистрации фордж
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RabbitHole.MOD_ID);

    public static final RegistryObject<Item> goldKey = ITEMS.register("goldkey", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> rastibulka = ITEMS.register("rastibulka", () -> new Item(new Item.Properties()));

    //метод регистрации предметов
    public static void registers(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
