package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.TravelersBackpack;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TravelersBackpack.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs
{
    public static CreativeModeTab TRAVELERS_BACKPACK;

    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event)
    {
        TRAVELERS_BACKPACK = event.registerCreativeModeTab(new ResourceLocation(TravelersBackpack.MODID, ""), builder -> builder
                .icon(() -> new ItemStack(ModItems.STANDARD_TRAVELERS_BACKPACK.get()))
                        .title(Component.translatable("itemGroup.travelersbackpack")).build());
    }

    public static void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == TRAVELERS_BACKPACK)
        {
            event.accept(ModItems.BACKPACK_TANK);
            event.accept(ModItems.HOSE_NOZZLE);
            event.accept(ModItems.HOSE);

            //Standard
            event.accept(ModBlocks.STANDARD_TRAVELERS_BACKPACK);

            //Blocks
            event.accept(ModBlocks.NETHERITE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.DIAMOND_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.GOLD_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.EMERALD_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.IRON_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.LAPIS_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.REDSTONE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.COAL_TRAVELERS_BACKPACK);

            event.accept(ModBlocks.QUARTZ_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.BOOKSHELF_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.END_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.NETHER_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SANDSTONE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SNOW_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SPONGE_TRAVELERS_BACKPACK);

            event.accept(ModBlocks.CAKE_TRAVELERS_BACKPACK);

            event.accept(ModBlocks.CACTUS_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.HAY_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.MELON_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.PUMPKIN_TRAVELERS_BACKPACK);

            event.accept(ModBlocks.CREEPER_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.DRAGON_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.ENDERMAN_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.BLAZE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.GHAST_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.MAGMA_CUBE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SKELETON_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SPIDER_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.WITHER_TRAVELERS_BACKPACK);

            //Friendly Mobs
            event.accept(ModBlocks.BAT_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.BEE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.WOLF_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.FOX_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.OCELOT_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.HORSE_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.COW_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.PIG_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SHEEP_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.CHICKEN_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.SQUID_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.VILLAGER_TRAVELERS_BACKPACK);
            event.accept(ModBlocks.IRON_GOLEM_TRAVELERS_BACKPACK);

            event.accept(ModItems.WHITE_SLEEPING_BAG);
            event.accept(ModItems.ORANGE_SLEEPING_BAG);
            event.accept(ModItems.MAGENTA_SLEEPING_BAG);
            event.accept(ModItems.LIGHT_BLUE_SLEEPING_BAG);
            event.accept(ModItems.YELLOW_SLEEPING_BAG);
            event.accept(ModItems.LIME_SLEEPING_BAG);
            event.accept(ModItems.PINK_SLEEPING_BAG);
            event.accept(ModItems.GRAY_SLEEPING_BAG);
            event.accept(ModItems.LIGHT_GRAY_SLEEPING_BAG);
            event.accept(ModItems.CYAN_SLEEPING_BAG);
            event.accept(ModItems.PURPLE_SLEEPING_BAG);
            event.accept(ModItems.BLUE_SLEEPING_BAG);
            event.accept(ModItems.BROWN_SLEEPING_BAG);
            event.accept(ModItems.GREEN_SLEEPING_BAG);
            event.accept(ModItems.RED_SLEEPING_BAG);
            event.accept(ModItems.BLACK_SLEEPING_BAG);
        }
    }
}