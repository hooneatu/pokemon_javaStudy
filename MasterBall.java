package item.ball;

import pokemon.Pokemon;

public class MasterBall extends Ball {
    public MasterBall(int amount) {
        // 이름: 마스터볼, 포획률: -
        super("마스터볼", amount, 0);
    }

    @Override
    public boolean catchPokemon(Pokemon p) {
        //마스터볼은 무조건 포켓몬을 잡는다.
        System.out.println("흔들리는 중...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println(p.getName() + "을(를) 잡았다 !");
        return true;
    }
}
    