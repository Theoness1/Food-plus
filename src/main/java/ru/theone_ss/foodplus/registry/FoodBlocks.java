package ru.theone_ss.foodplus.registry;

import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import ru.theone_ss.foodplus.block.MedovikBlock;

public class FoodBlocks
{
    public static final Block MEDOVIK = new MedovikBlock(AbstractBlock.Settings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));

    public static void init()
    {
        Registry.register(Registries.BLOCK, new Identifier("foodplusid", "medovik"), MEDOVIK);
    }
}
