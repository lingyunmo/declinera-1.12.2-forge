package net.declinera.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;

import net.declinera.block.BlockDeclineraBaseShapeshiftor;
import net.declinera.block.BlockDeclineraBasePackage;
import net.declinera.block.BlockDeclineraBaseCompressor;
import net.declinera.ElementsDeclineraMod;

import java.util.Map;

@ElementsDeclineraMod.ModElement.Tag
public class ProcedureDeclineraBaseEnderGeneratorGengXinYouXiKe extends ElementsDeclineraMod.ModElement {
	public ProcedureDeclineraBaseEnderGeneratorGengXinYouXiKe(ElementsDeclineraMod instance) {
		super(instance, 103);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DeclineraBaseEnderGeneratorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DeclineraBaseEnderGeneratorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DeclineraBaseEnderGeneratorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DeclineraBaseEnderGeneratorGengXinYouXiKe!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) < 100)) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("Energy", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) + 0.001));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) > 0.011)) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockDeclineraBaseCompressor.block
					.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockDeclineraBasePackage.block
							.getDefaultState().getBlock())
							|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
									.getBlock() == BlockDeclineraBaseShapeshiftor.block.getDefaultState().getBlock())))) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) - 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) (x + 1), (int) y, (int) z), "Energy")) + 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockDeclineraBaseCompressor.block
					.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockDeclineraBasePackage.block
							.getDefaultState().getBlock())
							|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
									.getBlock() == BlockDeclineraBaseShapeshiftor.block.getDefaultState().getBlock())))) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) - 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) (x - 1), (int) y, (int) z), "Energy")) + 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockDeclineraBaseCompressor.block
					.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockDeclineraBasePackage.block
							.getDefaultState().getBlock())
							|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
									.getBlock() == BlockDeclineraBaseShapeshiftor.block.getDefaultState().getBlock())))) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) - 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) (z + 1)), "Energy")) + 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockDeclineraBaseCompressor.block
					.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockDeclineraBasePackage.block
							.getDefaultState().getBlock())
							|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
									.getBlock() == BlockDeclineraBaseShapeshiftor.block.getDefaultState().getBlock())))) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) - 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("Energy", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) (z - 1)), "Energy")) + 0.01));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
