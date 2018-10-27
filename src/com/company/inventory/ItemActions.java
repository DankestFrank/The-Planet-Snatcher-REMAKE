package com.company.inventory;

public class ItemActions{



    public static ItemTemplate createRustyRobotArm()
    {
        ItemTemplate RustyRobotArm = new ItemTemplate();
        RustyRobotArm.name = "Rusty Robot Arm";
        RustyRobotArm.strengthValue = 4;
        RustyRobotArm.promptitudeValue = -3;
        RustyRobotArm.equipable = true;
        return RustyRobotArm;
    }
    public static ItemTemplate createFlameThower()
    {
        ItemTemplate FlameThrower = new ItemTemplate();
        FlameThrower.name = "Flame Thrower";
        FlameThrower.strengthValue = 1;
        FlameThrower.intelligenceValue = 4;
        FlameThrower.equipable = true;
        return FlameThrower;
    }
    public static ItemTemplate createBottle()
    {
        ItemTemplate bottle = new ItemTemplate();
        bottle.customMessage = "Refills your hydration status";
        return bottle;
    }


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
