package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.client.GrowableOresItemModel;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class GrowableOresBlockReedItem extends ItemBlock
{
	String name;
	
	public GrowableOresBlockReedItem(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(64);
		this.setCreativeTab(GrowableOres.Growable_Ores_Group);
		GrowableOres.getItem2Models().add(new GrowableOresItemModel(this, name));
	}
}
