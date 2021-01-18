package Model.Item.Healing;

import Model.Character.Character;
import Model.Item.ItemModel;
import Model.Item.ItemUse;

import java.util.ArrayList;

public class HealthPotionM extends ItemModel implements ItemUse{
    public HealthPotionM(){
        name = "Health Potion M";
        description = "Heal 90 HP to 1 target";
        target_count = 1;
        target_type = 1;
        text_x = 525;
        text_y = 330;
    }

    @Override
    public void useItem(ArrayList<Character> target) {
        for (Character c : target) {
            if (c.getHp() + 90 >= c.getMax_hp()) {
                c.setHp(c.getMax_hp());
            } else {
                c.setHp(c.getHp() + 90);
            }
        }
    }
}