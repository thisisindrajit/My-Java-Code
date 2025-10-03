package org.java_playground.lld.problems.vending_machine.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private static final Inventory INSTANCE = new Inventory();
    private Map<Integer, List<ItemCountPair>> items = new HashMap<>();

    private Inventory() {
    }

    public static Inventory getInstance() {
        return INSTANCE;
    }

    public void addItem(Item item, int count) {
        int level = item.getLevel();

        if(!items.containsKey(level)) {
            items.put(level, new ArrayList<>());
        }

        List<ItemCountPair> itemsList = items.get(level);
        itemsList.add(new ItemCountPair(item, count));

        items.put(level, itemsList);
    }

    public void removeItem(Item item) {
        int level = item.getLevel();

        if(!items.containsKey(level)) {
            return;
        }

        List<ItemCountPair> itemsList = items.get(level);

        itemsList.removeIf(icp -> icp.getItem() == item);

        items.put(level, itemsList);
    }

    public int getCountOfItem(Item item) {
        int level = item.getLevel();

        if(!items.containsKey(level)) {
            return 0;
        }

        List<ItemCountPair> itemsList = items.get(level);

        for(ItemCountPair icp: itemsList) {
            if(icp.getItem() == item) {
                return icp.getCount();
            }
        }

        return 0;
    }

    public void dispenseItem(Item item) {
        int level = item.getLevel();

        if(!items.containsKey(level)) {
            return;
        }

        List<ItemCountPair> itemsList = items.get(level);

        for(ItemCountPair icp: itemsList) {
            if(icp.getItem() == item) {
                icp.setCount(icp.getCount() - 1);
            }
        }
    }

    public void showInventory() {
        if (items == null || items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Map.Entry<Integer, List<ItemCountPair>> entry : items.entrySet()) {
            int level = entry.getKey();
            List<ItemCountPair> itemList = entry.getValue();
            System.out.println("Level " + level + ":");
            for (ItemCountPair icp : itemList) {
                System.out.println("  " + icp.getItem().getName() + " - Count: " + icp.getCount());
            }
        }
    }
}
