package assets.oreomod.src;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class OreoFood extends ItemFood
{
  public OreoFood (int par1, int par2, float par3, boolean par4)
  {
    super (par1, par2, par4);
    maxStackSize = 64;
  }

  @Override
  public void registerIcons (IconRegister par1IconRegister)
  {
    this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":oreoFood");
  }
}
