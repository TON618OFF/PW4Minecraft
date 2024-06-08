package net.yurchenko.blackhole.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.yurchenko.blackhole.BlackHole;
import java.util.List;

import net.yurchenko.blackhole.util.ModTags;;

public class ModToolTiers {
    public static final Tier AMBER = TierSortingRegistry.registerTier(
            new ForgeTier(2,250,6f,2f,14,
                    ModTags.Blocks.NEEDS_AMBER_TOOL, () -> Ingredient.of(ModItems.AMBER.get())),
            new ResourceLocation(BlackHole.MOD_ID, "amber"), List.of(Tiers.IRON), List.of()
    );
}
