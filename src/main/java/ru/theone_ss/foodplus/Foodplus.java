package ru.theone_ss.foodplus;

import net.fabricmc.api.ModInitializer;
import ru.theone_ss.foodplus.registry.FoodItems;

public class Foodplus implements ModInitializer {


	public void onInitialize() {


		FoodItems.reg_items();

	}
}
