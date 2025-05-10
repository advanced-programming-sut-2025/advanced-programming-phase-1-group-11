package models.Items;

import enums.Tools.BackPackMaterial;
import models.Item;

import java.util.ArrayList;

public class BackPack implements Item {
    private final BackPackMaterial material;
    private final ArrayList<Item> items = new ArrayList<>();


    public BackPack(BackPackMaterial material) {
        this.material = material;
    }

    public BackPackMaterial getMaterial() {
        return material;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items.clear();
        this.items.addAll(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }




}
