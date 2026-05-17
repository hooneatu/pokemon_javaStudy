package game;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import item.Item;
import item.ball.HyperBall;
import item.ball.MasterBall;
import item.ball.MonsterBall;
import item.potion.HyperPotion;
import item.potion.MaxPotion;
import item.potion.NormalPotion;
import pokemon.Pokemon;
import pokemon.PokemonType;

public class PokemonIO {
     public static JSONArray readJSON(String path) {
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = null;
        try (Reader reader = new FileReader(path)) {
            jsonArray = (JSONArray) parser.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    public static List<Pokemon> makePokemons(JSONArray jsonArray) {
        List<Pokemon> pokemons = new ArrayList<>();

        for(Object obj : jsonArray) {
            JSONObject jobj = (JSONObject) obj;
            Pokemon pokemon = makePokemon(jobj);

            pokemons.add(pokemon);
        }

        return pokemons;
    }

    public static Pokemon makePokemon(JSONObject jsonObject) {
        
        String name = (String)jsonObject.get("name");
        int health = ((Long)jsonObject.get("health")).intValue();;
        int attack = ((Long)jsonObject.get("attack")).intValue();
        int defense = ((Long)jsonObject.get("defense")).intValue();
        int speed = ((Long)jsonObject.get("speed")).intValue();
        String typeString = (String)jsonObject.get("type");
        PokemonType type = null;

        for (PokemonType pokemonType : PokemonType.values()) {
            if (pokemonType.name().equalsIgnoreCase(typeString)) {
                type = pokemonType;
                break;
            }
        }


        return new Pokemon(name, type, health, attack, attack, defense, speed);
    }

    public static List<Item> makeItems(JSONArray jsonArray) {
        List<Item> items = new ArrayList<>();

        JSONObject jobjBall = (JSONObject) jsonArray.get(1);
        JSONObject jobjPotion = (JSONObject) jsonArray.get(0);

        JSONArray jarrBall = (JSONArray) jobjBall.get("list");
        JSONArray jarrPotion = (JSONArray) jobjPotion.get("list");

        for(Object Bobj : jarrBall) {
            JSONObject jobj = (JSONObject) Bobj;
            Item itemBall = makeBall(jobj);
            items.add(itemBall);
            
        }
        for(Object Pobj : jarrPotion) {
            JSONObject jobj = (JSONObject) Pobj;
            Item itemPotion = makePotion(jobj);
            items.add(itemPotion);
        }
        return items;
    }

    public static Item makePotion(JSONObject jsonObject) {
        String name = (String) jsonObject.get("name");
        int amount =((Long) jsonObject.get("amount")).intValue();

        if(name.equals("상처약")) {
            NormalPotion normalpotion = new NormalPotion(amount);
            return (Item) normalpotion;
        }
        else if(name.equals("좋은 상처약")) {
            HyperPotion hyperpotion = new HyperPotion(amount);
            return (Item) hyperpotion;
        }
        else {
            MaxPotion maxpotion = new MaxPotion(amount);
            return (Item) maxpotion;
        }
    }

    public static Item makeBall(JSONObject jsonObject) {
        String name = (String) jsonObject.get("name");
        int amount = ((Long) jsonObject.get("amount")).intValue();

        if(name.equals("몬스터볼")) {
            MonsterBall monsterball = new MonsterBall(amount);
            return (Item) monsterball;
        }
        else if(name.equals("하이퍼볼")) {
            HyperBall hyperball = new HyperBall(amount);
            return (Item) hyperball;
        }
        else {
            MasterBall masterball = new MasterBall(amount);
            return (Item) masterball;
        }

    }
}
