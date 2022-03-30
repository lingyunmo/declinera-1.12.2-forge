package net.declinera.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

import net.declinera.item.ItemDeclineraPrimaryCorePart;
import net.declinera.item.ItemDeclineraPrimaryCore;
import net.declinera.block.BlockCompressCobblestone9x64;
import net.declinera.ElementsDeclineraMod;

import java.util.Map;

@ElementsDeclineraMod.ModElement.Tag
public class ProcedureDeclineraBaseCompressorGengXinYouXiKe extends ElementsDeclineraMod.ModElement {
	public ProcedureDeclineraBaseCompressorGengXinYouXiKe(ElementsDeclineraMod instance) {
		super(instance, 93);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DeclineraBaseCompressorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DeclineraBaseCompressorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DeclineraBaseCompressorGengXinYouXiKe!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DeclineraBaseCompressorGengXinYouXiKe!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(ItemDeclineraPrimaryCorePart.block, (int) (1))
				.getItem())) {
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
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) + 25));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (9), (int) (1));
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(ItemDeclineraPrimaryCore.block, (int) (1))
				.getItem())) {
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
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) + 100));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (9), (int) (1));
			}
		}
		if ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1))
								.getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1)).getItem())
																				&& (((new Object() {
																					public double getValue(BlockPos pos, String tag) {
																						TileEntity tileEntity = world.getTileEntity(pos);
																						if (tileEntity != null)
																							return tileEntity.getTileData().getDouble(tag);
																						return -1;
																					}
																				}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) >= 10)
																						&& ((((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof TileEntityLockableLoot)
																									return ((TileEntityLockableLoot) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (10))).getItem() == new ItemStack(
																										BlockCompressCobblestone9x64.block, (int) (1))
																												.getItem())
																								&& ((new Object() {
																									public int getAmount(BlockPos pos, int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof TileEntityLockableLoot) {
																											ItemStack stack = ((TileEntityLockableLoot) inv)
																													.getStackInSlot(sltid);
																											if (stack != null)
																												return stack.getCount();
																										}
																										return 0;
																									}
																								}.getAmount(new BlockPos((int) x, (int) y, (int) z),
																										(int) (10))) < 64))
																								|| ((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof TileEntityLockableLoot)
																											return ((TileEntityLockableLoot) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (10))).getItem() == new ItemStack(
																												Blocks.AIR, (int) (1))
																														.getItem()))))))))))))) {
			if ((((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (5))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (6))) == 64) && (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (7))) == 64) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (8))) == 64)))))))))) {
				if ((((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "Process")) >= 0) && ((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "Process")) < 100))) {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("Process", ((new Object() {
								public double getValue(BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(new BlockPos((int) x, (int) y, (int) z), "Process")) + 1));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "Process")) >= 100)) {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("Process", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (6), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (64));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (64));
					}
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
							}.getValue(new BlockPos((int) x, (int) y, (int) z), "Energy")) - 10));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(BlockCompressCobblestone9x64.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot) {
										ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (10))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (10), _setstack);
						}
					}
				}
			}
		}
	}
}
