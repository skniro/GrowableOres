package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.GrowableOresServer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//@Mod.EventBusSubscriber(modid = GrowableOres.MODID,bus = Mod.EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
public class GrowableOresClient extends GrowableOresServer {

    public void preInit(FMLPreInitializationEvent event) {}

    public void init(FMLInitializationEvent event)
    {
        ItemModelMesher imm = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        for (GrowableOresItemModel o : GrowableOres.getItem2Models()) {
            imm.register(o.item, 0, new ModelResourceLocation("growable_ores:" + o.name, "inventory"));
        }
    }
   /* @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Coal_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Iron_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Diamond_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Copper_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Emerald_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Gold_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Lapis_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Nether_Quartz_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Redstone_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Blaze_Rod_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Ender_Pearl_Cane.get(), RenderType.cutout());

        //ae2
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.certus_quartz_crystal_Cane.get(), RenderType.cutout());
*/
    //}
}
