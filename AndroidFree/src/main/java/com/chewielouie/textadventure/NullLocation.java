package com.chewielouie.textadventure;

import java.util.ArrayList;
import java.util.List;
import com.chewielouie.textadventure.action.Action;
import com.chewielouie.textadventure.item.Item;

public class NullLocation implements ModelLocation {
    public void addExit( Exit exit ) {
    }

    public boolean exitable( Exit exit ) {
        return false;
    }

    public String exitDestinationFor( Exit exit ) {
        return "";
    }

    public String id() {
        return "";
    }

    public void setId( String id ) {
    }

    public List<Exit> visibleExits() {
        return new ArrayList<Exit>();
    }

    public List<Exit> exitsIncludingInvisibleOnes() {
        return new ArrayList<Exit>();
    }

    public String description() {
        return "";
    }

    public void setLocationDescription( String description ) {
    }

    public List<Action> actions() {
        return new ArrayList<Action>();
    }

    public void addItem( Item item ) {
    }

    public void removeItem( Item item ) {
    }

    public void deserialise( String content ) {
    }

    public List<Item> items() {
        return new ArrayList<Item>();
    }
}

