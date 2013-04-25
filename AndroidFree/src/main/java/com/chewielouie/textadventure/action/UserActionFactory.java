package com.chewielouie.textadventure.action;

import com.chewielouie.textadventure.item.Item;
import com.chewielouie.textadventure.ModelLocation;
import com.chewielouie.textadventure.TextAdventureModel;
import com.chewielouie.textadventure.UserInventory;

public class UserActionFactory implements ActionFactory {
    public Action createShowInventoryAction( UserInventory inventory,
                                             TextAdventureModel model ) {
        return new ShowInventory( inventory, model, this );
    }

    public Action createInventoryItemAction( Item item,
                                             UserInventory inventory,
                                             ModelLocation location ) {
        return new InventoryItem( item, inventory, location );
    }
}
