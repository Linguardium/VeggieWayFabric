package com.kwpugh.veggie_way.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemCarbs extends Item
{
	public ItemCarbs(Settings properties)
	{
		super(properties);
	}

	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((new TranslatableText("item.veggie_way.carbs.line1").formatted(Formatting.GREEN)));
		tooltip.add((new TranslatableText("item.veggie_way.carbs.line2").formatted(Formatting.GREEN)));
	}
}
