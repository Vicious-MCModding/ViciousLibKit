package com.vicious.viciouslibkit;

import com.vicious.viciouslibkit.util.nms.NMSHelper;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

/**
 * This provides support for shit bukkit doesn't provide. Fuck you Bukkit.
 * God I hate this API ;)
 */
public class VLKHooks {
    /**
     * Burntime Hooks. Vanilla doesn't cache burntime information so we will.
     * Trust me, whoever coded the vanilla mc furnace tile is an absolute idiot.
     */
    public static Map<Object,Integer> burntimes = (Map<Object, Integer>) NMSHelper.TileEntityFurnace$createFuelTimeMap.invoke(NMSHelper.TileEntityFurnace);
    public static int getBurnTime(ItemStack stack){
        //Look how disgusting this code is lmao.
        return burntimes.getOrDefault(NMSHelper.ItemStack$getItem.invoke(NMSHelper.CraftItemStack$handle.get(stack)),0);
    }
}

