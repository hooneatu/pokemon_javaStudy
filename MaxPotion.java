package item.potion;

import pokemon.Pokemon;

public class MaxPotion extends Potion{
        public MaxPotion(int amount) {
        // 이름: 풀 회복약, 회복량: -
        super("풀 회복약", amount, 0);
    }

    @Override
    public void healPokemon(Pokemon p) {
        // 풀 회복약은 포켓몬의 체력을 최대 체력으로 설정
        p.setHealth(p.getMaxHealth());
    }
}
