package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;

import battle.Battle;
import item.Item;
import item.ball.Ball;
import item.potion.Potion;
import person.Player;
import pokemon.Pokemon;

public class GameHelper implements IGameHelper /* IGameHelper를 implements 합니다. */{
    static Scanner in = new Scanner(System.in);
    static String initPokemonPath = "C:\\java 실습 (스터디)\\Assignment04\\Assignment04\\resource\\init_pokemon.json";
    static String intitItemPath = "C:\\java 실습 (스터디)\\Assignment04\\Assignment04\\resource\\init_item.json";
    static JSONArray startpokemonJSONArray = PokemonIO.readJSON(initPokemonPath);
    static JSONArray itmeJSONArray = PokemonIO.readJSON(intitItemPath);

    public Player gameSetting() {
        System.out.println("포켓몬스터 세계에 오신 것을 환영합니다!");
        System.out.print("이름을 입력해 주세요 : ");

        String playerName = in.nextLine();
        Player player = new Player(playerName);

        System.out.println(player.getName() + "님 환영합니다 !");

        selectStarting(player);
        selectStartingItems(player);

        return player;
    }
    
    public void meetPokemon(Player player, Pokemon wildPokemon) {
        System.out.println("야생의 " + wildPokemon.getName() + "이(가) 나타났다!");
        System.out.println(wildPokemon);
    
        Pokemon myPokemon = player.getPokemonList().getPokemon(0);
        System.out.println("가라! " + myPokemon.getName() + "!");
        System.out.println(myPokemon);

        while (true) {
            switch (in.nextInt()) {
                case 1:
                    // 공격 진행
                    // Battle 클래스의 conductBattle 메소드를 활용하여 전투를 진행
                    // 해당 공격 결과에 따라, 0일경우 계속 진행, 1일 경우 내 포켓몬이 쓰러짐, 2일 경우 야생 포켓몬이 쓰러짐
                   
                    if (Battle.conductBattle(myPokemon, wildPokemon)==0) {
                        break;
                    } else if (Battle.conductBattle(myPokemon, wildPokemon)==1) {
                        // 내 포켓몬이 쓰러짐
                        // 다음 포켓몬이 있는 경우 - 쓰러진 포켓몬을 제거하고 다음 포켓몬으로 교체
                        player.getPokemonList().removePokemon(myPokemon);
                        if(player.getPokemonList().size()!=0){
                            myPokemon = player.getPokemonList().getPokemon(0);
                        }
                        // 다음 포켓몬이 없는 경우 - 모든 포켓몬이 쓰러진 경우, 프로그램 종료
                        else{
                            System.exit(0);
                        }
                    } else if (Battle.conductBattle(myPokemon, wildPokemon)==2) {
                        // 야생 포켓몬이 쓰러짐
                        // 전투 종료 (return)
                        return;
                    }
                    break;
                case 2:
                    //아이템 사용. 만약 아이템 사용 결과가 포켓몬을 잡는 것이라면, 포켓몬을 잡고 return
                    //player.getInventory().useItem()
                    boolean caught = handleItemUse(player, wildPokemon);
                    if(caught==true)
                        return;
                    break;
                case 3:
                    //포켓몬 교체
                    handlePokemonSwitch(player);
                    break;
                case 4:
                    //10% 확률로 도망가기
                    if(Math.random()<0.1){
                        System.out.println("도망쳤다!");
                        return;
                    }
                    else{
                        System.out.println("도망에 실패했다!");
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }

    public void selectStarting(Player player) {
        System.out.println("시작 몬스터볼을 선택하세요:");
        System.out.println("1. 몬스터볼 5개 2. 하이퍼볼 3개 3. 마스터볼 1개");


        List<Item> items = new ArrayList<>();
        items = PokemonIO.makeItems(itmeJSONArray);

        switch (getIntInput(1, 3)) {
            case 1:
                player.getInventory().addItem(items.get(0));
                break;
            case 2:
                player.getInventory().addItem(items.get(1));
                break;
            case 3:
                player.getInventory().addItem(items.get(2));
                break;
        }

        System.out.println("포션을 선택하세요:");
        System.out.println("1. 상처약 5개 2. 좋은 상처약 3개 3. 풀 회복약 1개");
        switch (getIntInput(1, 3)) {
            case 1:
                player.getInventory().addItem(items.get(3));
                break;
            case 2:
                player.getInventory().addItem(items.get(4));
                break;
            case 3:
                player.getInventory().addItem(items.get(5));
                break;
        }
        }

    // 메뉴를 출력합니다.
    public void printMenu(){    
        System.out.println("\n-------------------------------");
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 유저 정보 출력");
        System.out.println("2. 포켓몬 확인");
        System.out.println("3. 인벤토리 확인");
        System.out.println("4. 야생 포켓몬 발견!");
        System.out.println("5. 종료");
        System.out.println("-------------------------------\n");
    }

    public void selectStartingItems(Player player) {
        //플레이어가 시작 아이템을 선택하는 메소드
        System.out.println("시작 몬스터볼을 선택하세요:");
        System.out.println("1. 몬스터볼 5개 2. 하이퍼볼 3개 3. 마스터볼 1개");


        List<Item> items = new ArrayList<>();
        items = PokemonIO.makeItems(itmeJSONArray);

        switch (getIntInput(1, 3)) {
            case 1:
                player.getInventory().addItem(items.get(0));
                break;
            case 2:
                player.getInventory().addItem(items.get(1));
                break;
            case 3:
                player.getInventory().addItem(items.get(2));
                break;
        }

        System.out.println("포션을 선택하세요:");
        System.out.println("1. 상처약 5개 2. 좋은 상처약 3개 3. 풀 회복약 1개");
        switch (getIntInput(1, 3)) {
            case 1:
                player.getInventory().addItem(items.get(3));
                break;
            case 2:
                player.getInventory().addItem(items.get(4));
                break;
            case 3:
                player.getInventory().addItem(items.get(5));
                break;
        }
    }

    private static boolean handleItemUse(Player player, Pokemon wildPokemon) {
        System.out.println("어떤 아이템을 사용하시겠습니까?");
        player.getInventory().showItems();
        in.nextLine();
        String itemName = in.nextLine();
    
        // TODO: 입력값 검증 - 빈 문자열이나 null 입력 처리
        if(itemName == null || itemName.trim().isEmpty()) return false;
        
        if (player.getInventory().hasItem(itemName)) {
            Item item = player.getInventory().getItem(itemName);
    
            if (item instanceof Ball) {
                // TODO: Ball로 다운캐스팅
                Ball ball = (Ball)item;
                if (player.getPokemonList().size() == 6) {
                    // TODO: 포켓몬이 가득 찼을 때 처리
                    System.out.println("포켓몬이 가득 차 있습니다.");
                    return false;
                } else {
                    // TODO: 볼 사용 및 포획 성공/실패 분기 처리
                    //  - useItem() 호출
                    boolean caught = player.getInventory().useItem(ball.getName());                  
                    //  - 성공 시 pokemonList에 추가 후 true 반환
                    if(caught==true){
                        player.getPokemonList().addPokemon(wildPokemon);
                        return true;
                    }
                    else return false;
                    //  - 실패 시 false 반환
                }
    
            } else if (item instanceof Potion) {
                // TODO: Potion으로 다운캐스팅
                Potion potion = (Potion)item;
                // TODO: 최대 HP 체크 후 사용 방지
                int currentHealth = player.getPokemonList().getPokemon(0).getHealth();
                if(currentHealth == player.getPokemonList().getPokemon(0).getMaxHealth()){
                    System.out.println("해당 몬스터는 이미 최대 체력입니다!");
                }
                // TODO: 사용 전 HP 저장 → useItem() 호출 → 회복량 출력
                int beforeHealth = player.getPokemonList().getPokemon(0).getHealth(); 
                potion.healPokemon(player.getPokemonList().getPokemon(0));
                player.getInventory().useItem(potion.getName());    
                System.out.printf("회복량: %d",player.getPokemonList().getPokemon(0).getHealth()-beforeHealth);
                
            } else {
                // TODO: 사용 불가 아이템 처리
                System.out.println("사용할 수 없는 아이템입니다.");
            }
    
        } else {
            // TODO: 아이템이 인벤토리에 없을 때 처리
            System.out.println("아이템이 존재하지 않습니다.");
        }
        return false;
    }
    private static void handlePokemonSwitch(Player player) {
        System.out.println("교체할 포켓몬을 선택하세요.");
        // TODO: 보유 중인 포켓몬 목록 출력
        player.getPokemonList().showPokemon();
        // TODO: 입력받은 index로 포켓몬 교체
        int index = in.nextInt();
        player.getPokemonList().swapPokemon(index);
    }


    // min ~ max의 범위에 해당하는 입력을 받습니다.
    private static int getIntInput(int min, int max) {
        int input = in.nextInt();
        while (input < min || input > max) {
            System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
            input = in.nextInt();
        }
        return input;
    }
}
