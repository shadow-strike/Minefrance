package net.minecraft.server;
 
import java.util.Random;
import org.bukkit.craftbukkit.event.CraftEventFactory;
 
public class BlockTapis extends Block {
 
    protected BlockTapis(int i, int j) {
        super(i, j, Material.GRASS);
        this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        this.a(true);
    }
 
    public AxisAlignedBB e(World world, int i, int j, int k) {
        int l = world.getData(i, j, k) & 7;
 
        return l >= 3 ? AxisAlignedBB.b((double) i + this.minX, (double) j + this.minY, (double) k + this.minZ, (double) i + this.maxX, (double) ((float) j + 0.5F), (double) k + this.maxZ) : null;
    }
 
    public boolean a() {
        return false;
    }
 
    public boolean b() {
        return false;
    }
 
}