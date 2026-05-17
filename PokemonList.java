package person;

import java.util.ArrayList;

import pokemon.Pokemon;

public class PokemonList {
    static final int MAX_SIZE = 6;
    private int pokemonCount = 0;
    // 기존의 List형태의 포켓몬 목록을 ArrayList로 대체합니다.
    // ArrayList<타입> (번수명) = new ArrayList<>(크기); 크기는 동적으로 가능하지만 본 과제에서는 MAX_SIZE로 제한합니다.
    public ArrayList<Pokemon> pokemonList = new ArrayList<>(MAX_SIZE);
    // 아래 메소드에서 List를 사용하던 로직들은 전부 ArrayList를 사용한 로직으로 변경합니다.

    // pokemonList를 반환합니다.
    public /* 반환 타입 선언 */ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void addPokemon(Pokemon pokemon) {
        if(pokemonCount == 6) {
            System.out.println("지닌 포켓몬이 가득 찼다 !");
        }
        else {
            pokemonList.add(pokemon);
        }
    }

    // index를 매개변수로 받는 removePokemon을 선언합니다.
    public Pokemon removePokemon(int index) {
        // 사이즈가 동적으로 조절되는 ArrayList의 특징을 이용하여 index번째 포켓몬을 지우는 메소드를 리팩토링합니다.
        // 기존 코드는 deleteList를 사용해서 제거된 이후의 list를 떙겨서 채워졌으나
        // ArrayList의 메서드를 사용해서 지우기만 하면 동적으로 전체 사이즈를 줄이고 땡겨줍니다.

        // index범위를 체크합니다.
        if(getPokemon(index)==null){
            return null;
        }
        pokemonList.remove(index);
        return pokemonList.get(index);
        // index번째 포켓몬을 pokemonList에서 제거합니다.
    }
    
    // 동일한 포켓몬을 삭제합니다.
    // 포켓몬이 list에 없다면 null을 반환합니다.
    public Pokemon removePokemon(Pokemon pokemon) {
        // ArrayList를 사용하는 방식으로 리팩토링합니다.
        if(getPokemon(pokemon.getName())==null){
            return null;
        }
        pokemonList.remove(pokemon);
        return pokemon;
    }

    // 이름이 동일한 포켓몬을 삭제합니다.
    // 포켓몬이 list에 없다면 null을 반환 합니다.
    public Pokemon getPokemon(String name) {
       for(Pokemon p:pokemonList){
        if(p.getName().equals(name)) return p;
       }
       return null;
    }

    public Pokemon getPokemon(int index) {
        //인덱스에 해당하는 포켓몬을 반환. 인덱스가 잘못된 경우 null 반환
        if(index>=0&&index<pokemonList.size()){
            return pokemonList.get(index);
        }
        return null;
    }

    public void showPokemon(int index) {
        //인덱스에 해당하는 포켓몬을 출력. 인덱스가 잘못된 경우 "잘못된 인덱스입니다." 출력
        if(getPokemon(index)==null){
            System.out.println("잘못된 인데스입니다.");
        }
        else{
            System.out.println(pokemonList.get(index));
        }
    }

    // 가진 모든 포켓몬의 이름과 현재 체력을 출력합니다.
    // toString()을 활용합니다.
    public void showPokemon() {
        for(Pokemon p:pokemonList){
            System.out.println(p.toString());
        }
    }

    public int size() {
        return pokemonList.size();
    }


    // TODO
    public void swapPokemon(int index){
        //인덱스에 해당하는 포켓몬을 0번째 포켓몬과 교체
        Pokemon temp;
        temp = pokemonList.get(index);
        pokemonList.set(index,pokemonList.get(0));
        pokemonList.set(0,temp);
        //name, maxHealth, health, attack, defense, speed, type
    }
}
