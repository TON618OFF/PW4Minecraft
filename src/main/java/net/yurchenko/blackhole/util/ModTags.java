package net.yurchenko.blackhole.util;

import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yurchenko.blackhole.BlackHole;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AMBER_TOOL = tag("needs_amber_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(BlackHole.MOD_ID));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(BlackHole.MOD_ID));
        }
    }
}
