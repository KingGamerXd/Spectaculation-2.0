package me.superischroma.spectaculation.merchant;

import me.superischroma.spectaculation.item.SItem;
import me.superischroma.spectaculation.item.SMaterial;
import me.superischroma.spectaculation.merchant.ShopGUI;
import me.superischroma.spectaculation.util.SUtil;

public class FarmMerchantGUI extends ShopGUI
{
    private static final SItem[] ITEMS = {
            MerchantItemHandler.getItem(SMaterial.WHEAT),
            MerchantItemHandler.getItem(SMaterial.CARROT_ITEM),
            MerchantItemHandler.getItem(SMaterial.POTATO_ITEM),
            MerchantItemHandler.getItem(SMaterial.MELON),
            MerchantItemHandler.getItem(SMaterial.SUGAR_CANE),
            MerchantItemHandler.getItem(SMaterial.PUMPKIN),
            MerchantItemHandler.getItem(SMaterial.COCOA_BEANS),
            MerchantItemHandler.getItem(SMaterial.RED_MUSHROOM),
            MerchantItemHandler.getItem(SMaterial.BROWN_MUSHROOM),
            MerchantItemHandler.getItem(SMaterial.SAND),
            MerchantItemHandler.getItem(SMaterial.CACTUS)
    };


    public FarmMerchantGUI(int page)
    {
        super("Farm Merchant", page, ITEMS);
    }

    public FarmMerchantGUI()
    {
        this(1);
    }
}