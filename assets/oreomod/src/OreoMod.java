package assets.oreomod.src;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=ModInfo.MODID, name=ModInfo.MODNAME, version=ModInfo.MODVERSION)

public class OreoMod {

  public static Item oreoFood = new OreoFood(2022, 1, 0.4F, false).setUnlocalocalizedName("oreoFood");

  @Mod.Instance(ModInfo.MODID)
  public static OreoMod oreoMod;

  @EventHandler
  public void init(FMLInitializationEvent event)
  {
    LanguageRegistry.addName(oreoFood, "Oreo Item");
    GameRegistry.addRecipe(new ItemStack(OreoMod.oreoFood, 1), new Object[]
      {
        "XXX", "X#X", "XXX", Character.valueOf('X'), Block.cobblestone
      }
                           );
    //    GameRegistry.addShapelessRecipe(new ItemStack(OreoMod.oreoFood, 16), new Object[] {Item.});
  }
}
