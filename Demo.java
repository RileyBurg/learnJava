package com.goldspacebear.learnjava;

public class Demo {

    public static void main(String[] args) {

        Player jerry = new Player("Jerry", 8);
//        System.out.println(jerry.getHandleName());
//        System.out.println("Level: " + jerry.getLevel());
//        System.out.println("Lives: " + jerry.getLives());
//        System.out.println(jerry.getWeapon().getName());

        Weapon myAxe = new Weapon("God Axe", 15,50);
        jerry.setWeapon(myAxe);
//        System.out.println(jerry.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        jerry.pickUpLoot(redPotion);
        jerry.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        jerry.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 33));
        jerry.pickUpLoot(new Loot("Shadow Ring", LootType.RING, 500));

        jerry.showInventory();

//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
        boolean wasDeleted = jerry.dropLoot(redPotion);
        System.out.println(wasDeleted);
        jerry.showInventory();

    }
}
