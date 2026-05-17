package person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import item.*;
import item.ball.Ball;
import item.potion.Potion;
import pokemon.Pokemon;

public class Inventory {
    // 멤버 변수 선언
    // 아이템 이름을 key, Item 객체를 value로 관리하는 인벤토리 맵
    // Map<(key 타입), (value 타입)> (변수명) = new HashMap<><();
    private Map<String,Item> map;
    // 아래 메소드들에서 Map에 내장된 메소드들을 활용해서 작성합니다.
    // Map의 어떤 메소드가 있는지는 직접 찾아보시는게 도움이 될 겁니다.

    // 생성자 선언
    public Inventory() {
        map = new HashMap<>();
    }

// Map을 사용하여 addItme을 리팩토링 합니다.
    public void addItem(Item item) {
        
        // inventory가 비어있던 경우
        if(!map.containsKey(item.getName())){
            map.put(item.getName(),item);
        }
        // inventory가 비어있지 않은 경우
        // 이미 있는 아이템인 경우 개수만 더합니다.
         else {
            map.get(item.getName()).addAmount(item.getAmount());
        }
    }

    public boolean useItem(String itemName) {
        // 아이템 사용
        // 아이템이 없으면 존재하지 않는다는 메세지를 출력하고 false 리턴
        if(hasItem(itemName)==false){
            System.out.println("인벤토리에 존재하지 않는 아이템입니다!");
            return false;
        }
        getItem(itemName).use();
        if(getItem(itemName).getAmount()==0){
            map.remove(itemName);
        }
        return true;
        // 아이템이 있으면 use 메소드를 호출하고, 아이템 수량이 0이 되면 아이템을 삭제하고 true 리턴
    }

    // target 포켓몬에게 아이템을 사용합니다.
    public boolean useItem(String itemName, Pokemon target) {
        // TODO: 인벤토리에 해당 아이템이 존재하는지 확인
        if (hasItem(itemName)) {
            // TODO: 아이템이 Ball 인스턴스인지 확인
            if (getItem(itemName) instanceof Ball) {
                // TODO: 아이템 사용 처리 (수량 감소)
                getItem(itemName).removeAmount(1);
                // TODO: Ball로 다운캐스팅 (형변환)
                Ball ball = (Ball)map.get(itemName);
                // TODO: 수량이 0이 되면 인벤토리에서 제거
                if(ball.getAmount()==0) map.remove(itemName);
                // TODO: 포획 시도 결과 반환
                return ball.catchPokemon(target);
            }
            // TODO: 아이템이 Potion 인스턴스인지 확인
            else if (getItem(itemName) instanceof Potion) {
                // TODO: 아이템 사용 처리 (수량 감소)
                getItem(itemName).removeAmount(1);
                // TODO: Potion으로 다운캐스팅 (형변환)
                Potion potion = (Potion)map.get(itemName);
                // TODO: 수량이 0이 되면 인벤토리에서 제거
                if(potion.getAmount()==0) map.remove(itemName);
                // TODO: 포켓몬 HP 회복
                potion.healPokemon(target);
                return false;
            }
        }
        // TODO: 아이템이 없을 경우 메시지 출력
        else {
            System.out.println("인벤토리에 존재하지 않는 아이템입니다!");
        }
    
        return false;
    }
       
    public void showItems() {
        System.out.println("\n인벤토리:");
    
        /**
         * [개념 설명]
         * 0. Map에 있는 데이터들을 꺼내서 쓰는 방법
         * 1. Map.Entry: Map의 'Key'와 'Value'를 한 쌍으로 묶어둔 객체 (영수증 한 장)
         * 2. entrySet(): Map에 저장된 모든 Entry(쌍)를 꺼내서 Set(주머니)에 담아주는 메서드
         * 3. getValue(): Entry 객체에서 실제 데이터인 'Value'를 추출하는 메서드
         *
         * [참고 예시: 학생 성적 출력]
         * Set<Map.Entry<String, Integer>> scores = studentMap.entrySet();
         * for (Map.Entry<String, Integer> entry : scores) {
         * System.out.println(entry.getKey() + "의 점수: " + entry.getValue());
         * }
         *
         * [TODO]
         * 1. items.entrySet()을 사용하여 모든 아이템 쌍을 Set 변수에 담으세요.
         * 2. for-each 문으로 Set을 순회하며 각 Entry에서 Item 객체를 꺼내세요.
         * 3. 꺼낸 Item 객체의 getName()과 getAmount()를 활용해 정보를 출력하세요.
         */
        Set<Map.Entry<String, Item>> items = map.entrySet();
        for(Map.Entry<String, Item> entry : items){
            System.out.println(entry.getValue().getName()+" "+entry.getValue().getAmount());
        }
    }

    public boolean hasItem(String itemName) {
        // 아이템이 있는지 확인
        if(map.containsKey(itemName)){
            return true;
        }
        return false;
        // Map의 containsKey 메서도를 활용합니다.
    }

    public Item getItem(String itemName) {
        // 아이템 리턴
        if(hasItem(itemName)==true){
            return map.get(itemName);
        }
        return null;
    }
}
