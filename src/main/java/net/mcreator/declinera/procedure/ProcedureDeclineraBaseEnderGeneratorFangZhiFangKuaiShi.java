package net.mcreator.declinera.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.declinera.ElementsDeclineraMod;

import java.util.Map;

@ElementsDeclineraMod.ModElement.Tag
public class ProcedureDeclineraBaseEnderGeneratorFangZhiFangKuaiShi extends ElementsDeclineraMod.ModElement {
	public ProcedureDeclineraBaseEnderGeneratorFangZhiFangKuaiShi(ElementsDeclineraMod instance) {
		super(instance, 93);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DeclineraBaseEnderGeneratorFangZhiFangKuaiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DeclineraBaseEnderGeneratorFangZhiFangKuaiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DeclineraBaseEnderGeneratorFangZhiFangKuaiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DeclineraBaseEnderGeneratorFangZhiFangKuaiShi!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			IBlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().setDouble("Energy", 0);
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			IBlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().setDouble("Generation", 0);
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
	}
}
