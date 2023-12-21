package me.superischroma.spectaculation.merchant;

import me.superischroma.spectaculation.item.SItem;
import me.superischroma.spectaculation.item.SMaterial;
import me.superischroma.spectaculation.util.SUtil;

import java.util.HashMap;

public class MerchantItemHandler {
    public final static HashMap<SMaterial, SItem> ITEMS = new HashMap<>();

    public static void init(){
        initFarmMerchant();
    }

    private static void initFarmMerchant(){
        SUtil.toShopItem(SMaterial.WHEAT, 3, 10L, 6L);
        SUtil.toShopItem(SMaterial.CARROT_ITEM, 3, 10L, 3L);
        SUtil.toShopItem(SMaterial.POTATO_ITEM, 3, 10L, 3L);
        SUtil.toShopItem(SMaterial.MELON, 10, 4L, 2L);
        SUtil.toShopItem(SMaterial.SUGAR_CANE, 3, 10L, 4L);
        SUtil.toShopItem(SMaterial.PUMPKIN, 1, 25L, 10L);
        SUtil.toShopItem(SMaterial.COCOA_BEANS, 1, 5L, 3L);
        SUtil.toShopItem(SMaterial.RED_MUSHROOM, 1, 12L, 10L);
        SUtil.toShopItem(SMaterial.BROWN_MUSHROOM, 1, 12L, 10L);
        SUtil.toShopItem(SMaterial.SAND, 2, 4L, 2L);
        SUtil.toShopItem(SMaterial.CACTUS, 1, 10L, 3L);
    }
    public static SItem getItem(SMaterial material){
        if (ITEMS.containsKey(material)) return ITEMS.get(material);
        return null;
    }
}