package refined_energetic_storage.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import refined_energetic_storage.RefinedEnergeticStorage;
import refined_energetic_storage.block.BlockLoader;
import refined_energetic_storage.tile.TileController;
import refined_energetic_storage.tile.TileTestDevice;
import sausage_core.api.util.common.SausageUtils;

public class RESContent {

    public static void preInit(FMLPreInitializationEvent event) {
        BlockLoader.init();
        RefinedEnergeticStorage.IB.registerAll();
    }

    public static void init(FMLInitializationEvent event) {
        SausageUtils.registerTileEntities(RefinedEnergeticStorage.MODID, TileController.class, TileTestDevice.class);
    }

    public static void postInit(FMLPostInitializationEvent event) {

    }

}
