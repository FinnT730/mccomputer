package cf.finnt730.mccomputer.events;


import cf.finnt730.mccomputer.F_TNT;
import cf.finnt730.mccomputer.Mccomputer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registers {



    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mccomputer.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mccomputer.MODID);


    public static final RegistryObject<Block> EXAMPLE_BLOCK =
            BLOCKS.register("example_block", () -> new F_TNT(Block.Properties.create(Material.ROCK)
            .harvestTool(ToolType.PICKAXE).hardnessAndResistance(10)));

    public static final RegistryObject<Item> EXAMPLE_ITEM =
            ITEMS.register("example_item", () -> new BlockItem(EXAMPLE_BLOCK.get(),  new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    public Registers() {
//        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());


    }


}
