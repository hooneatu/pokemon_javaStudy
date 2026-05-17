package game;

import person.Player;
import pokemon.Pokemon;

// gameSetting(), printMenu(), meetPokemon() 세가지 추상메소드를 포함하는 IGameHelper interface를 선언합니다.
interface IGameHelper{
    public abstract Player gameSetting(); 
    public abstract void printMenu();
    public abstract void meetPokemon(Player Player, Pokemon wildPokemon);
}