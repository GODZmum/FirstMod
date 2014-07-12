package com.GODZmum.letsModReboot.init;

import com.GODZmum.letsModReboot.item.ItemLetsModReboot;
import com.GODZmum.letsModReboot.item.ItemMapleLeaf;
import com.GODZmum.letsModReboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemLetsModReboot mapleLeaf = new ItemMapleLeaf();

	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
