package net.yurchenko.blackhole.item;

import net.minecraft.world.item.*;
import net.yurchenko.blackhole.BlackHole;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlackHole.MOD_ID);


    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BlackHole)));

    public static final RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BlackHole)));

    public static final RegistryObject<Item> AMBER_SWORD = ITEMS.register("amber_sword",
            () -> new SwordItem(ModToolTiers.AMBER, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMBER, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new AxeItem(ModToolTiers.AMBER, 6, -3.1f, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_SHOVEL = ITEMS.register("amber_shovel",
            () -> new ShovelItem(ModToolTiers.AMBER, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_HOE = ITEMS.register("amber_hoe",
            () -> new HoeItem(ModToolTiers.AMBER, -2, -1, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ModArmorMaterials.AMBER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
