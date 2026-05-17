package person;

public class Person {
    String name;
    PokemonList pokemonList;

    public Person(String name) {
        this.name = name;
        pokemonList = new PokemonList();
    }

    public String getName() {
        return name;
    }

    public PokemonList getPokemonList() {
        return pokemonList;
    }

    public void showPokemonList() {
        pokemonList.showPokemon();

    }

    public void showPlayerInfo() {
        System.out.println("이름: " + name);
        System.out.println("\n포켓몬 정보: ");
        showPokemonList();
        
    }
}
