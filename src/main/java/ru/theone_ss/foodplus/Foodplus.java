package ru.theone_ss.foodplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ru.theone_ss.foodplus.registry.FoodBlocks;
import ru.theone_ss.foodplus.registry.FoodItems;

public class Foodplus implements ModInitializer {

	public static ItemGroup FOODPLUS;
	public static final String MOD_ID = "foodplusid";

	public void onInitialize()
	{
		registerItemGroup();
		FoodItems.init();
		FoodBlocks.init();
	}
	public static void registerItemGroup()
	{
		FOODPLUS = FabricItemGroup.builder(new Identifier(Foodplus.MOD_ID, "foodplusid"))
				.displayName(Text.translatable("Food+"))
				.icon(() -> FoodItems.RED_SUS_CANDY.asItem().getDefaultStack()).build();
	}
	public static Identifier id(String path)
	{
		return new Identifier(MOD_ID, path);
	}
}
