package battle;

import pokemon.Pokemon;

public class Battle {
        public static int conductBattle(Pokemon myPokemon, Pokemon wildPokemon) {
        //전투를 진행하는 메소드
        //내 포켓몬과 야생 포켓몬이 공격을 한번씩 번갈아가며 진행
        //공격 결과에 따라 0, 1, 2 중 하나를 반환
        //해당 결과는 GameHelper에서 사용
        Pokemon firstAttacker;
        Pokemon firstDefender;
        //속도에 따라 선공을 결정
        if(myPokemon.getSpeed()>wildPokemon.getSpeed()){
            firstAttacker = myPokemon;
            firstDefender = wildPokemon;
        }
        else{
            firstAttacker = wildPokemon;
            firstDefender = myPokemon;
        }

        //선공 포켓몬이 한 번 공격
        int result = attack(firstAttacker, firstDefender, myPokemon);
        // 만약 전투가 끝났다면 결과 반환 (1-내 포켓몬이 쓰러짐, 2-야생 포켓몬이 쓰러짐)
        if(result!=0) return result;
        //후공 포켓몬이 한 번 공격
        result = attack(firstDefender,firstAttacker,myPokemon);
        return result;
        //0 또는 1 또는 2 반환
    }

    private static int attack(Pokemon attacker, Pokemon defender, Pokemon myPokemon) {
        //공격 메소드는 attacker가 defender를 공격하는 메소드
        //공격 결과에 따라 0, 1, 2 중 하나를 반환
        //0-전투 계속, 1-내 포켓몬이 쓰러짐, 2-야생 포켓몬이 쓰러짐


        //타입 및 공격력, 방어력을 고려한 데미지 계산
        double multiplier = TypeEffectiveness.getEffectiveness(attacker.getType(), defender.getType());
        int damage = (int)(attacker.getAttack()-defender.getDefense()*multiplier);
        defender.setHealth(defender.getHealth()-Math.max(1, damage));
        //방어 포켓몬이 쓰러졌을 경우
        if(defender.getHealth()<=0){
            if(defender == myPokemon) return 1;
            else return 2;
        }
        // 1-내 포켓몬이 쓰러짐, 2-야생 포켓몬이 쓰러짐


        System.out.println(defender.getName() + "의 남은 체력: " + defender.getHealth());
        return 0;
        // 0-전투 계속
    }
}
