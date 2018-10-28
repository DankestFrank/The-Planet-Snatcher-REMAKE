package com.company.inventory;

import com.company.Status;

public class ItemActions{

    public static ItemTemplate createRustyRobotArm()
    {
        ItemTemplate RustyRobotArm = new ItemTemplate();
        RustyRobotArm.Message = RustyRobotArm.messagePlaceholder;
        RustyRobotArm.name = "Rusty Robotic Limb";
        RustyRobotArm.strengthValue = 4;
        RustyRobotArm.promptitudeValue = -3;
        RustyRobotArm.equipable = true;
        return RustyRobotArm;
    }
    public static ItemTemplate createFlameThower()
    {
        ItemTemplate FlameThrower = new ItemTemplate();
        FlameThrower.Message = FlameThrower.messagePlaceholder;
        FlameThrower.name = "Flame Thrower";
        FlameThrower.strengthValue = 1;
        FlameThrower.scrapValue = 4;
        FlameThrower.equipable = true;
        return FlameThrower;
    }
    public static ItemTemplate createBottle()
    {
        ItemTemplate Bottle = new ItemTemplate();
        Bottle.Message = "Refills your hydration Status";
        Bottle.hydrationValue = 10- Status.char_stats.get("hydration");
        return Bottle;
    }
    public static ItemTemplate createExoskeleton() {
        ItemTemplate Exoskeleton = new ItemTemplate();
        Exoskeleton.Message = Exoskeleton.messagePlaceholder;
        Exoskeleton.name = "Polished Exoskeleton";
        Exoskeleton.strengthValue = 9;
        Exoskeleton.promptitudeValue = -2;
        Exoskeleton.equipable = false;
        return Exoskeleton;
    }
    public static ItemTemplate createShovel(){
        ItemTemplate Shovel = new ItemTemplate();
        Shovel.equipable = true;
        Shovel.Message = Shovel.messagePlaceholder;
        Shovel.name = "Shovel";
        Shovel.promptitudeValue = -1;
        Shovel.strengthValue = 2;
        return Shovel;
    }

    public static ItemTemplate createBoots(){
        ItemTemplate Boots = new ItemTemplate();
        Boots.promptitudeValue = 5;
        Boots.name = "Portable 3D Parts Printer";
        return Boots;
    }
    //public static ItemTemplate createGrimeCube


    public void activateItem(ItemTemplate itemClass){

        if(itemClass.equipable){
            itemClass.removeAttributes();
            ItemTemplate.currentEquipment = itemClass;
            itemClass.changeAttributes();
        }
        else{
            itemClass.changeAttributes();
            Status.char_items.remove(itemClass);
        }
    }
}
