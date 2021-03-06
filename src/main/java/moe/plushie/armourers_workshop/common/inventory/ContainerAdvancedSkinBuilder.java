package moe.plushie.armourers_workshop.common.inventory;

import moe.plushie.armourers_workshop.common.inventory.slot.SlotSkin;
import moe.plushie.armourers_workshop.common.skin.type.SkinTypeRegistry;
import moe.plushie.armourers_workshop.common.tileentities.TileEntityAdvancedSkinBuilder;
import net.minecraft.entity.player.InventoryPlayer;

public class ContainerAdvancedSkinBuilder extends ModTileContainer<TileEntityAdvancedSkinBuilder> {

    public ContainerAdvancedSkinBuilder(InventoryPlayer invPlayer, TileEntityAdvancedSkinBuilder tileEntity) {
        super(invPlayer, tileEntity);
        addPlayerSlots(8, 40);
        for (int i = 0; i < tileEntity.getSizeInventory(); i++) {
            addSlotToContainer(new SlotSkin(SkinTypeRegistry.skinPart, tileEntity, i, 8 + 20 * i, 20));
        }
    }
}
