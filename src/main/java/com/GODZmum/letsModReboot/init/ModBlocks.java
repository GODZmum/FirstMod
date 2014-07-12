package com.GODZmum.letsModReboot.init;

import com.GODZmum.letsModReboot.block.BlockFlag;
import com.GODZmum.letsModReboot.block.BlockLetsModReboot;
import com.GODZmum.letsModReboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockLetsModReboot blockFlag = new BlockFlag();

	public static void init() {
		GameRegistry.registerBlock(blockFlag, "blockFlag");
	}
}
