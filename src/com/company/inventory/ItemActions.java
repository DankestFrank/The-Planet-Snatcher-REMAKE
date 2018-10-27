package com.company.inventory;

import com.company.status;

public class ItemActions{

    public static ItemTemplate createRustyRobotArm()
    {
        ItemTemplate RustyRobotArm = new ItemTemplate();
        RustyRobotArm.Message = RustyRobotArm.messagePlaceholder;
        RustyRobotArm.name = "Rusty Robot Arm";
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
        FlameThrower.intelligenceValue = 4;
        FlameThrower.equipable = true;
        return FlameThrower;
    }
    public static ItemTemplate createBottle()
    {
        ItemTemplate Bottle = new ItemTemplate();
        Bottle.Message = "Refills your hydration status";
        Bottle.hydrationValue = 10-status.char_stats.get("hydration");
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
    //public static ItemTemplate createGrimeCube


    public void activateItem(ItemTemplate itemClass){

        if(itemClass.equipable){
            itemClass.removeAttributes();
            itemClass.currentEquipment = itemClass;
            itemClass.changeAttributes();
        }
        else{
            itemClass.changeAttributes();

        }
    }
}
