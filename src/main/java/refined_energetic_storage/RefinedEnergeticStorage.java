package refined_energetic_storage;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import refined_energetic_storage.common.RESContent;
import sausage_core.api.util.registry.IBRegistryManager;

import javax.annotation.Nonnull;

@Mod(modid = RefinedEnergeticStorage.MODID, name = RefinedEnergeticStorage.NAME, version = RefinedEnergeticStorage.VERSION, acceptedMinecraftVersions = "1.12.2")
@Mod.EventBusSubscriber
public class RefinedEnergeticStorage {

    public final static String MODID = "refined_energetic_storage";
    public final static String NAME = "Refined Energetic Storage";
    public final static String VERSION = "1.0";
    public static final IBRegistryManager IB = new IBRegistryManager(RefinedEnergeticStorage.MODID,
            new CreativeTabs(RefinedEnergeticStorage.MODID + ".main") {
                @Override
                @Nonnull
                public ItemStack getTabIconItem() {
                    return new ItemStack(Blocks.GRASS);
                }
            }
    );
    @Mod.Instance(RefinedEnergeticStorage.MODID)
    public static RefinedEnergeticStorage instance;

    @SubscribeEvent
    public static void loadModels(ModelRegistryEvent event) {
        RefinedEnergeticStorage.IB.loadAllModel();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RESContent.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RESContent.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RESContent.postInit(event);
    }

}
