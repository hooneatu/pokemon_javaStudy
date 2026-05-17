package item.ball;

import item.Item;
import pokemon.Pokemon;

public class Ball extends Item{
    private int catchRank;

    public Ball(String name, int amount, int catchRank) {
        super(name, amount);
        this.catchRank = catchRank;
    }

    public int getCatchRank() {
        return catchRank;
    }

    public void setCatchRank(int catchRank) {
        this.catchRank = catchRank;
    }


    public boolean catchPokemon(Pokemon p){
        double CatchPossible = (catchRank*0.2) - (0.05*p.getSpeed());
        double randomPossible = Math.random();
        
        if(randomPossible > CatchPossible) {
            System.out.println("흔들리는 중...");
            System.out.println("3...");
            System.out.println("2...");
            System.out.print("앗...! ");
            return false;
        }

        else {
            System.out.println("흔들리는 중...");
            System.out.println("3...");
            System.out.println("2...");
            System.out.println("1...");
            System.out.println(p.getName() + "을(를) 잡았다 !");
            return true;
        }
 
    }
}
