package ru.theone_ss.foodplus.registry;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import ru.theone_ss.foodplus.Foodplus;
import ru.theone_ss.foodplus.item.BankaItem;
import ru.theone_ss.foodplus.item.DrinkItem;
import ru.theone_ss.foodplus.item.SoupItem;
import ru.theone_ss.foodplus.item.FoodPlusItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class FoodItems {
    public static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();
    public static final Item BEEF_SALAD = add("beef_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.1f).build())));
    public static final Item PORK_SALAD = add("pork_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(11).saturationModifier(1.1f).build())));
    public static final Item CHICKEN_SALAD = add("chicken_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(10).saturationModifier(1f).build())));
    public static final Item FISH_SALAD = add("fish_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(10).saturationModifier(1f).build())));
    public static final Item SALMON_SALAD = add("salmon_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(10).saturationModifier(1f).build())));
    public static final Item MUTTON_SALAD = add("mutton_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(10).saturationModifier(1f).build())));
    public static final Item RABBIT_SALAD = add("rabbit_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(10).saturationModifier(1f).build())));
    public static final Item BEEF_SANDWICH = add("beef_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(1.1f).build())));
    public static final Item PORK_SANDWICH = add("pork_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(1.1f).build())));
    public static final Item MUTTON_SANDWICH = add("mutton_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item CHICKEN_SANDWICH = add("chicken_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item SALMON_SANDWICH = add("salmon_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item RABBIT_SANDWICH = add("rabbit_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item FISH_SANDWICH = add("fish_sandwich", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item GOLD_BEETROOT = add("gold_beetroot", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.1f).build())));
    public static final Item GOLD_POTATO = add("gold_potato", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build())));
    public static final Item TOLCHONKA = add("tolchonka", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
    public static final Item VEGETABLE_SALAD = add("vegetable_salad", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build())));
    public static final Item MEAT_PIE = add("meat_pie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build())));
    public static final Item APPLE_PIE = add("apple_pie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build())));
    public static final Item CARROT_PIE = add("carrot_pie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build())));
    public static final Item SWEET_BERRIES_PIE = add("sweet_berries_pie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build())));
    public static final Item GLOW_BERRIES_PIE = add("glow_berries_pie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*6), 0.15f).build())));
    public static final Item PUMPKIN_SOUP = add("pumpkin_soup", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
    public static final Item BANKA = add("banka", new FoodPlusItem(new Item.Settings()));
    public static final Item VARENIE = add("varenie", new BankaItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*6), 0.25f).build())));
    public static final Item GLOW_VARENIE = add("glow_varenie", new BankaItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*10), 0.25f).build())));
    public static final Item APPLE_JUICE = add("apple_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build())));
    public static final Item BEETROOT_JUICE = add("beetroot_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())));
    public static final Item CARROT_JUICE = add("carrot_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())));
    public static final Item GLOW_BERRIES_JUICE = add("glow_berries_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*6), 0.15f).build())));
    public static final Item MELON_JUICE = add("melon_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())));
    public static final Item MILK_SHAKE = add("milk_shake", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
    public static final Item SWEET_BERRIES_JUICE = add("sweet_berries_juice", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())));
    public static final Item COCOA_SHAKE = add("cocoa_shake", new DrinkItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.1f).build())));
    public static final Item BERRY_COOKIE = add("berry_cookie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
    public static final Item GLOW_BERRY_COOKIE = add("glow_berry_cookie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*6), 0.15f).build())));
    public static final Item BEETROOT_COOKIE = add("beetroot_cookie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item CARROT_COOKIE = add("carrot_cookie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())));
    public static final Item CARAMEL = add("caramel", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).snack().build())));
    public static final Item BLACK_CANDY = add("black_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item BLUE_CANDY = add("blue_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item BROWN_CANDY = add("brown_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item CYAN_CANDY = add("cyan_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item GRAY_CANDY = add("gray_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item GREEN_CANDY = add("green_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item LIGHT_BLUE_CANDY = add("light_blue_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item LIGHT_GRAY_CANDY = add("light_gray_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item LIME_CANDY = add("lime_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item MAGENTA_CANDY = add("magenta_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item ORANGE_CANDY = add("orange_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item PINK_CANDY = add("pink_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item PURPLE_CANDY = add("purple_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item RED_CANDY = add("red_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item WHITE_CANDY = add("white_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item YELLOW_CANDY = add("yellow_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item RED_SUS_CANDY = add("red_sus_candy", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build())));
    public static final Item BAKED_FLESH = add("baked_flesh", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*20), 0.40f).meat().build())));
    public static final Item AD_SOUP = add("ad_soup", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*15), 0.35f).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20*5), 0.25f).build())));
    public static final Item AWFUL_STEW = add("awful_stew", new SoupItem(new Item.Settings().maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*5), 0.45f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*20), 0.45f).build())));
    public static final Item FRIED_PUMPKIN_SEED = add("fried_pumpkin_seed", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())));
    public static final Item FRIED_MUSHROOM1 = add("fried_mushroom1", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())));
    public static final Item FRIED_MUSHROOM2 = add("fried_mushroom2", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*6), 0.20f).snack().build())));
    public static final Item CHOCOLATE = add("chocolate", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build())));

    public static final Item LICHEN = add("lichen", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*4), 0.40f).snack().build())));
    public static final Item LICHEN_BREAD = add("lichen_bread", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build())));
    public static final Item MILLED_LICHEN = add("milled_lichen", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*4), 0.40f).snack().build())));
    public static final Item SEA_SALAD = add("sea_salad", new SoupItem(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item SUNFLOWER_SEEDS = add("sunflower_seeds", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())));
    public static final Item CARROT_BREAD = add("carrot_bread", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build())));
    public static final Item POTATO_BREAD = add("potato_bread", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));
    public static final Item BEET_BREAD = add("beet_bread", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build())));

    public static final Item ROOT = add("root", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())));
    public static final Item RAW_FROG_LEG = add("raw_frog_leg", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));
    public static final Item COOKED_FROG_LEG = add("cooked_frog_leg", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item RAW_STRIDE = add("raw_stride", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*12), 0.50f).build())));
    public static final Item COOKED_STRIDE = add("cooked_stride", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*12), 0.50f).build())));
    public static final BlockItem MEDOVIK = add("medovik", new BlockItem(FoodBlocks.MEDOVIK, new Item.Settings().maxCount(1)));
    public static final Item MEDOVIK_SLICE = add("medovik_slice", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build())));
    public static final Item BEE_PILL = add("bee_pill", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 0.45f).build())));
    public static final Item HONEY_COOKIE = add("honey_cookie", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build())));
    public static final Item HONEY_GUM = add("honey_gum", new FoodPlusItem(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build())));

    private static <T extends Item> T add(String name, T item)
    {
        ITEMS.put(Foodplus.id(name), item);
        return item;
    }

    public static void init()
    {
        ITEMS.forEach((id, item) -> Registry.register(Registries.ITEM, id, item));
    }
}
