import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import org.json.simple.JSONArray;

import person.*;
import pokemon.Pokemon;
import game.*;

public class PokemonMaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameHelper gameHelper = new GameHelper();
     
        Player user = gameHelper.gameSetting();

        //야생 포켓몬 리스트입니다. 잠만보를 무찔러보세요!
        Queue<Pokemon> wildPokemons = new LinkedList<>();
        final String wildpokemonPath = "C:\\java 실습 (스터디)\\Assignment04\\Assignment04\\resource\\wild_pokemon.json";
        final JSONArray wpokemonJSONArray = PokemonIO.readJSON(wildpokemonPath);
        List<Pokemon> wpokemons = PokemonIO.makePokemons(wpokemonJSONArray);

        for(Pokemon inputPokemon : wpokemons) {
            wildPokemons.add(inputPokemon);
        }

        
        while (true) {

            gameHelper.printMenu();
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    user.showPlayerInfo();
                    break;
                case 2:
                    user.showPokemonList();
                    break;
                case 3:
                    user.showInventory();
                    break;
                case 4:
                if (wildPokemons.isEmpty()) {
                    System.out.println("야생의 포켓몬을 모두 만났습니다. 다음에 다시 도전하세요.");
                    System.out.println("포켓몬스터 월드를 떠나갑니다.");
                    in.close();
                    return;
                }
                    gameHelper.meetPokemon(user, wildPokemons.poll());
                    break;
                case 5:
                    System.out.println("포켓몬스터 월드를 떠나갑니다.");
                    in.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. (1~5) 숫자만 입력해 주세요.");
                    break;
            }
        }
    }
}
