package net.trofimov.mptmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeItemTab {
    public static final CreativeModeTab MPT_TAB = new CreativeModeTab( "mpt_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Amber.get());
        }
    };
}
