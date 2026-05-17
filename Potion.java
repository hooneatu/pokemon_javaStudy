package item.potion;

import item.Item;
import pokemon.Pokemon;

public class Potion extends Item{
    private int healAmount;

    public Potion(String name, int amount, int healAmount) {
        super(name, amount);
        this.healAmount = healAmount;
    }
    
    public int  getHealAmount() {
            return healAmount;
    }

        public void setHealAmount(int healAmount) {
            this.healAmount = healAmount;
    }

    public void healPokemon(Pokemon p){
        int newHealth = p.getHealth() +  this.healAmount;
        if(newHealth > p.getMaxHealth()){
            newHealth = p.getMaxHealth();
        }
        p.setHealth(newHealth);

    }
}
