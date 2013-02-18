package com.chewielouie.textadventure.action;

import java.util.ArrayList;
import java.util.List;
import com.chewielouie.textadventure.Item;

public class UseWithSpecificItem implements Action {
    private List<Action> followUpActions = new ArrayList<Action>();
    private Item originalItem;
    private Item targetItem;
    private final String failedItemUseText = "Nothing happens.";
    private String userText = failedItemUseText;

    public UseWithSpecificItem( Item item ) {
        this.targetItem = item;
    }

    public UseWithSpecificItem( Item original, Item target ) {
        this.originalItem = original;
        this.targetItem = target;
    }

    public Item item() {
        return targetItem;
    }

    public Item itemBeingUsed() {
        return originalItem;
    }

    public String label() {
        return targetItem.name();
    }

    public void trigger() {
        if( targetItem != null && originalItem != null )
            if( targetItem.canBeUsedWith( originalItem ) )
                userText = targetItem.usedWithSuccessText();
    }

    public boolean userMustChooseFollowUpAction() {
        return false;
    }

    public List<Action> followUpActions() {
        return followUpActions;
    }

    public boolean userTextAvailable() {
        return true;
    }

    public String userText() {
        return userText;
    }

    @Override
    public boolean equals( Object o ) {
        if( !(o instanceof UseWithSpecificItem) )
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
