package net.fabricmc.example.registry;

import net.fabricmc.example.mod_food.banka_item;
import net.fabricmc.example.mod_food.drink_item;
import net.fabricmc.example.mod_food.soup_item;
import net.fabricmc.example.mod_items.fplus_items;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FoodItems {

    public static final Item HALF_BREAD1 = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(3f).build()));
    public static final Item HALF_BREAD2 = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(3f).build()));
    public static final Item BEEF_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.1f).build()));
    public static final Item PORK_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(9).saturationModifier(1.1f).build()));
    public static final Item MUTTON_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1f).build()));
    public static final Item CHICKEN_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1f).build()));
    public static final Item SALMON_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1f).build()));
    public static final Item RABBIT_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1f).build()));
    public static final Item FISH_SANDWICH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(1f).build()));
    public static final Item FRIED_CARROT = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).snack().build()));
    public static final Item AD_SOUP = new soup_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*15), 0.35f).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20*5), 0.30f).build()));
    public static final Item CARAMEL = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0f).snack().build()));
    public static final Item CARAMEL_APPLE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item BLACK_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item BLUE_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item BROWN_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item CYAN_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item GRAY_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item GREEN_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item LIGHT_BLUE_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item LIGHT_GRAY_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item LIME_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item MAGENTA_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item ORANGE_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item PINK_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item PURPLE_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item RED_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item WHITE_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item YELLOW_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item BANKA = new fplus_items(new Item.Settings().group(ItemGroup.MISC));
    public static final Item VARENIE = new banka_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 0.15f).build()));
    public static final Item GLOW_VARENIE = new banka_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*10), 0.25f).build()));
    public static final Item BAKED_APPLE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item BAKED_FLESH = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*21), 0.55f).build()));
    public static final Item GOLD_BEETROOT = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1f).build()));
    public static final Item GOLD_POTATO = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build()));
    public static final Item PUMKIN_SOUP = new soup_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()));
    public static final Item APPLE_PIE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()));
    public static final Item CARROT_PIE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()));
    public static final Item MEAT_PIE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build()));
    public static final Item SWEET_BERRIES_PIE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build()));
    public static final Item GLOW_BERRIES_PIE = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*6), 0.20f).build()));
    public static final Item RED_SUS_CANDY = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build()));
    public static final Item ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item BLACK_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item BLUE_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item BROWN_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item CYAN_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item GRAY_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item GREEN_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item LIGHT_BLUE_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item LIGHT_GRAY_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item LIME_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item MAGENTA_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item ORANGE_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item PINK_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item PURPLE_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item RED_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item WHITE_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item YELLOW_ICE_CREAM = new fplus_items(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()));
    public static final Item APPLE_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build()));
    public static final Item BEETROOT_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build()));
    public static final Item CARROT_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build()));
    public static final Item GLOW_BERRIES_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item MELON_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build()));
    public static final Item MILK_SHAKE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item SWEET_BERRIES_JUICE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));
    public static final Item COCOA_SHAKE = new drink_item(new Item.Settings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build()));


    public static void reg_items() {

        Registry.register(Registry.ITEM, new Identifier("modid", "half_bread1"), HALF_BREAD1);
        Registry.register(Registry.ITEM, new Identifier("modid", "half_bread2"), HALF_BREAD2);
        Registry.register(Registry.ITEM, new Identifier("modid", "beef_sandwich"), BEEF_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "pork_sandwich"), PORK_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "mutton_sandwich"), MUTTON_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "chicken_sandwich"), CHICKEN_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "salmon_sandwich"), SALMON_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "rabbit_sandwich"), RABBIT_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "fish_sandwich"), FISH_SANDWICH);
        Registry.register(Registry.ITEM, new Identifier("modid", "fried_carrot"), FRIED_CARROT);
        Registry.register(Registry.ITEM, new Identifier("modid", "ad_soup"), AD_SOUP);
        Registry.register(Registry.ITEM, new Identifier("modid", "caramel"), CARAMEL);
        Registry.register(Registry.ITEM, new Identifier("modid", "caramel_apple"), CARAMEL_APPLE);
        Registry.register(Registry.ITEM, new Identifier("modid", "black_candy"), BLACK_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "blue_candy"), BLUE_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "brown_candy"), BROWN_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "cyan_candy"), CYAN_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "gray_candy"), GRAY_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "green_candy"), GREEN_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "light_blue_candy"), LIGHT_BLUE_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "light_gray_candy"), LIGHT_GRAY_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "lime_candy"), LIME_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "magenta_candy"), MAGENTA_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "orange_candy"), ORANGE_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "pink_candy"), PINK_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "purple_candy"), PURPLE_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "red_candy"), RED_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "white_candy"), WHITE_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "yellow_candy"), YELLOW_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "banka"), BANKA);
        Registry.register(Registry.ITEM, new Identifier("modid", "varenie"), VARENIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "glow_varenie"), GLOW_VARENIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "baked_apple"), BAKED_APPLE);
        Registry.register(Registry.ITEM, new Identifier("modid", "baked_flesh"), BAKED_FLESH);
        Registry.register(Registry.ITEM, new Identifier("modid", "gold_beetroot"), GOLD_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier("modid", "gold_potato"), GOLD_POTATO);
        Registry.register(Registry.ITEM, new Identifier("modid", "pumkin_soup"), PUMKIN_SOUP);
        Registry.register(Registry.ITEM, new Identifier("modid", "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "carrot_pie"), CARROT_PIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "meat_pie"), MEAT_PIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "sweet_berries_pie"), SWEET_BERRIES_PIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "glow_berries_pie"), GLOW_BERRIES_PIE);
        Registry.register(Registry.ITEM, new Identifier("modid", "red_sus_candy"), RED_SUS_CANDY);
        Registry.register(Registry.ITEM, new Identifier("modid", "ice_cream"), ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "black_ice_cream"), BLACK_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "blue_ice_cream"), BLUE_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "brown_ice_cream"), BROWN_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "cyan_ice_cream"), CYAN_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "gray_ice_cream"), GRAY_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "green_ice_cream"), GREEN_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "light_blue_ice_cream"), LIGHT_BLUE_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "light_gray_ice_cream"), LIGHT_GRAY_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "lime_ice_cream"), LIME_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "magenta_ice_cream"), MAGENTA_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "orange_ice_cream"), ORANGE_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "pink_ice_cream"), PINK_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "purple_ice_cream"), PURPLE_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "red_ice_cream"), RED_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "white_ice_cream"), WHITE_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "yellow_ice_cream"), YELLOW_ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier("modid", "apple_juice"), APPLE_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "beetroot_juice"), BEETROOT_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "carrot_juice"), CARROT_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "glow_berries_juice"), GLOW_BERRIES_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "melon_juice"), MELON_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "milk_shake"), MILK_SHAKE);
        Registry.register(Registry.ITEM, new Identifier("modid", "sweet_berries_juice"), SWEET_BERRIES_JUICE);
        Registry.register(Registry.ITEM, new Identifier("modid", "cocoa_shake"), COCOA_SHAKE);
    }
}
