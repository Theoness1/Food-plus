package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.registry.FoodItems;

public class Foodplus implements ModInitializer {



	@Override
	public void onInitialize() {


		FoodItems.reg_items();

	}
}
