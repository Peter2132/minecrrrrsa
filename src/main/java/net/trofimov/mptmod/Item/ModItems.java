package net.trofimov.mptmod.Item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.trofimov.mptmod.MptMod;
import net.trofimov.mptmod.armor.ModArmors;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);
    public static RegistryObject<Item> Amber = ITEMS.register ("amber",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static RegistryObject<Item> Amber_raw = ITEMS.register ("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static RegistryObject<Item> Amber_HELMET = ITEMS.register ("amber_helmet",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> Amber_LEGGING = ITEMS.register ("amber_legging",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> Amber_CHESTPLATE = ITEMS.register ("amber_chestplate",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> Amber_BOOTS = ITEMS.register ("amber_boots",
            () -> new ArmorItem(ModArmors.AMBER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static RegistryObject<Item> Amber_SWORD = ITEMS.register ("amber_sword",
            () -> new SwordItem(ModTiers.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> Amber_AXE = ITEMS.register ("amber_axe",
            () -> new AxeItem(ModTiers.AMBER, 4, 0f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static RegistryObject<Item> Amber_PICKAXE = ITEMS.register ("amber_pickaxe",
            () -> new PickaxeItem(ModTiers.AMBER, 1, 1f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));
    public static RegistryObject<Item> Amber_HOE = ITEMS.register ("amber_hoe",
            () -> new HoeItem(ModTiers.AMBER, 0, 0f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));

    public static RegistryObject<Item> Amber_SHOVEL = ITEMS.register ("amber_shovel",
            () -> new ShovelItem(ModTiers.AMBER, 0, 1f,
                    new Item.Properties().tab(ModCreativeItemTab.MPT_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
