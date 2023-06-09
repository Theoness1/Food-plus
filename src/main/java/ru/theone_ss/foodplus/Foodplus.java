package ru.theone_ss.foodplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ru.theone_ss.foodplus.registry.FoodBlocks;
import ru.theone_ss.foodplus.registry.FoodItems;

public class Foodplus implements ModInitializer {

	public static final String MOD_ID = "foodplusid";

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.displayName(Text.of("Food+"))
			.entries((ctx, entries) -> FoodItems.ITEMS.forEach((id, item) -> entries.add(item.getDefaultStack())))
			.icon(FoodItems.RED_SUS_CANDY::getDefaultStack).build();

	public void onInitialize()
	{
		FoodItems.init();
		FoodBlocks.init();
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "items"), ITEM_GROUP);
	}

	public static Identifier id(String path)
	{
		return new Identifier(MOD_ID, path);
	}
}
