package battle;

import pokemon.PokemonType;
import java.util.Map;
import java.util.EnumMap;

public class TypeEffectiveness {
    private static final Map<PokemonType, Map<PokemonType, Double>> effectivenessMap = new EnumMap<>(PokemonType.class);

    // setupEffectivenestt()를 실행하는 클래스 초기화 블록을 선언합니다.
    static{
        setupEffectiveness();
    }

    private static void setupEffectiveness(){
        Map<PokemonType, Map<PokemonType, Double>> effectivenessMap = new EnumMap<>(PokemonType.class);

        // NORMAL
        Map<PokemonType, Double> normalMap = new EnumMap<>(PokemonType.class);
        normalMap.put(PokemonType.NORMAL, 1.0);
        normalMap.put(PokemonType.FIRE, 1.0);
        normalMap.put(PokemonType.WATER, 1.0);
        normalMap.put(PokemonType.ELECTRIC, 1.0);
        normalMap.put(PokemonType.GRASS, 1.0);
        normalMap.put(PokemonType.ICE, 1.0);
        normalMap.put(PokemonType.FIGHTING, 1.0);
        normalMap.put(PokemonType.POISON, 1.0);
        normalMap.put(PokemonType.GROUND, 1.0);
        normalMap.put(PokemonType.FLYING, 1.0);
        normalMap.put(PokemonType.PSYCHIC, 1.0);
        normalMap.put(PokemonType.BUG, 1.0);
        normalMap.put(PokemonType.ROCK, 0.5);
        normalMap.put(PokemonType.GHOST, 0.0);
        normalMap.put(PokemonType.DRAGON, 1.0);
        normalMap.put(PokemonType.DARK, 1.0);
        normalMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.NORMAL, normalMap);

        // FIRE
        Map<PokemonType, Double> fireMap = new EnumMap<>(PokemonType.class);
        fireMap.put(PokemonType.NORMAL, 1.0);
        fireMap.put(PokemonType.FIRE, 0.5);
        fireMap.put(PokemonType.WATER, 0.5);
        fireMap.put(PokemonType.ELECTRIC, 1.0);
        fireMap.put(PokemonType.GRASS, 2.0);
        fireMap.put(PokemonType.ICE, 2.0);
        fireMap.put(PokemonType.FIGHTING, 1.0);
        fireMap.put(PokemonType.POISON, 1.0);
        fireMap.put(PokemonType.GROUND, 1.0);
        fireMap.put(PokemonType.FLYING, 1.0);
        fireMap.put(PokemonType.PSYCHIC, 1.0);
        fireMap.put(PokemonType.BUG, 2.0);
        fireMap.put(PokemonType.ROCK, 0.5);
        fireMap.put(PokemonType.GHOST, 1.0);
        fireMap.put(PokemonType.DRAGON, 0.5);
        fireMap.put(PokemonType.DARK, 1.0);
        fireMap.put(PokemonType.STEEL, 2.0);
        effectivenessMap.put(PokemonType.FIRE, fireMap);

        // WATER
        Map<PokemonType, Double> waterMap = new EnumMap<>(PokemonType.class);
        waterMap.put(PokemonType.NORMAL, 1.0);
        waterMap.put(PokemonType.FIRE, 2.0);
        waterMap.put(PokemonType.WATER, 0.5);
        waterMap.put(PokemonType.ELECTRIC, 1.0);
        waterMap.put(PokemonType.GRASS, 0.5);
        waterMap.put(PokemonType.ICE, 1.0);
        waterMap.put(PokemonType.FIGHTING, 1.0);
        waterMap.put(PokemonType.POISON, 1.0);
        waterMap.put(PokemonType.GROUND, 2.0);
        waterMap.put(PokemonType.FLYING, 1.0);
        waterMap.put(PokemonType.PSYCHIC, 1.0);
        waterMap.put(PokemonType.BUG, 1.0);
        waterMap.put(PokemonType.ROCK, 2.0);
        waterMap.put(PokemonType.GHOST, 1.0);
        waterMap.put(PokemonType.DRAGON, 0.5);
        waterMap.put(PokemonType.DARK, 1.0);
        waterMap.put(PokemonType.STEEL, 1.0);
        effectivenessMap.put(PokemonType.WATER, waterMap);

        // ELECTRIC
        Map<PokemonType, Double> electricMap = new EnumMap<>(PokemonType.class);
        electricMap.put(PokemonType.NORMAL, 1.0);
        electricMap.put(PokemonType.FIRE, 1.0);
        electricMap.put(PokemonType.WATER, 2.0);
        electricMap.put(PokemonType.ELECTRIC, 0.5);
        electricMap.put(PokemonType.GRASS, 0.5);
        electricMap.put(PokemonType.ICE, 1.0);
        electricMap.put(PokemonType.FIGHTING, 1.0);
        electricMap.put(PokemonType.POISON, 1.0);
        electricMap.put(PokemonType.GROUND, 0.0);
        electricMap.put(PokemonType.FLYING, 2.0);
        electricMap.put(PokemonType.PSYCHIC, 1.0);
        electricMap.put(PokemonType.BUG, 1.0);
        electricMap.put(PokemonType.ROCK, 1.0);
        electricMap.put(PokemonType.GHOST, 1.0);
        electricMap.put(PokemonType.DRAGON, 0.5);
        electricMap.put(PokemonType.DARK, 1.0);
        electricMap.put(PokemonType.STEEL, 1.0);
        effectivenessMap.put(PokemonType.ELECTRIC, electricMap);

        // GRASS
        Map<PokemonType, Double> grassMap = new EnumMap<>(PokemonType.class);
        grassMap.put(PokemonType.NORMAL, 1.0);
        grassMap.put(PokemonType.FIRE, 0.5);
        grassMap.put(PokemonType.WATER, 2.0);
        grassMap.put(PokemonType.ELECTRIC, 1.0);
        grassMap.put(PokemonType.GRASS, 0.5);
        grassMap.put(PokemonType.ICE, 1.0);
        grassMap.put(PokemonType.FIGHTING, 1.0);
        grassMap.put(PokemonType.POISON, 0.5);
        grassMap.put(PokemonType.GROUND, 2.0);
        grassMap.put(PokemonType.FLYING, 0.5);
        grassMap.put(PokemonType.PSYCHIC, 1.0);
        grassMap.put(PokemonType.BUG, 0.5);
        grassMap.put(PokemonType.ROCK, 2.0);
        grassMap.put(PokemonType.GHOST, 1.0);
        grassMap.put(PokemonType.DRAGON, 0.5);
        grassMap.put(PokemonType.DARK, 1.0);
        grassMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.GRASS, grassMap);

        // ICE
        Map<PokemonType, Double> iceMap = new EnumMap<>(PokemonType.class);
        iceMap.put(PokemonType.NORMAL, 1.0);
        iceMap.put(PokemonType.FIRE, 0.5);
        iceMap.put(PokemonType.WATER, 0.5);
        iceMap.put(PokemonType.ELECTRIC, 1.0);
        iceMap.put(PokemonType.GRASS, 2.0);
        iceMap.put(PokemonType.ICE, 0.5);
        iceMap.put(PokemonType.FIGHTING, 1.0);
        iceMap.put(PokemonType.POISON, 1.0);
        iceMap.put(PokemonType.GROUND, 2.0);
        iceMap.put(PokemonType.FLYING, 2.0);
        iceMap.put(PokemonType.PSYCHIC, 1.0);
        iceMap.put(PokemonType.BUG, 1.0);
        iceMap.put(PokemonType.ROCK, 1.0);
        iceMap.put(PokemonType.GHOST, 1.0);
        iceMap.put(PokemonType.DRAGON, 2.0);
        iceMap.put(PokemonType.DARK, 1.0);
        iceMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.ICE, iceMap);

        // FIGHTING
        Map<PokemonType, Double> fightingMap = new EnumMap<>(PokemonType.class);
        fightingMap.put(PokemonType.NORMAL, 2.0);
        fightingMap.put(PokemonType.FIRE, 1.0);
        fightingMap.put(PokemonType.WATER, 1.0);
        fightingMap.put(PokemonType.ELECTRIC, 1.0);
        fightingMap.put(PokemonType.GRASS, 1.0);
        fightingMap.put(PokemonType.ICE, 2.0);
        fightingMap.put(PokemonType.FIGHTING, 1.0);
        fightingMap.put(PokemonType.POISON, 0.5);
        fightingMap.put(PokemonType.GROUND, 1.0);
        fightingMap.put(PokemonType.FLYING, 0.5);
        fightingMap.put(PokemonType.PSYCHIC, 0.5);
        fightingMap.put(PokemonType.BUG, 0.5);
        fightingMap.put(PokemonType.ROCK, 2.0);
        fightingMap.put(PokemonType.GHOST, 0.0);
        fightingMap.put(PokemonType.DRAGON, 1.0);
        fightingMap.put(PokemonType.DARK, 2.0);
        fightingMap.put(PokemonType.STEEL, 2.0);
        effectivenessMap.put(PokemonType.FIGHTING, fightingMap);

        // POISON
        Map<PokemonType, Double> poisonMap = new EnumMap<>(PokemonType.class);
        poisonMap.put(PokemonType.NORMAL, 1.0);
        poisonMap.put(PokemonType.FIRE, 1.0);
        poisonMap.put(PokemonType.WATER, 1.0);
        poisonMap.put(PokemonType.ELECTRIC, 1.0);
        poisonMap.put(PokemonType.GRASS, 2.0);
        poisonMap.put(PokemonType.ICE, 1.0);
        poisonMap.put(PokemonType.FIGHTING, 1.0);
        poisonMap.put(PokemonType.POISON, 0.5);
        poisonMap.put(PokemonType.GROUND, 0.5);
        poisonMap.put(PokemonType.FLYING, 1.0);
        poisonMap.put(PokemonType.PSYCHIC, 1.0);
        poisonMap.put(PokemonType.BUG, 1.0);
        poisonMap.put(PokemonType.ROCK, 0.5);
        poisonMap.put(PokemonType.GHOST, 0.5);
        poisonMap.put(PokemonType.DRAGON, 1.0);
        poisonMap.put(PokemonType.DARK, 1.0);
        poisonMap.put(PokemonType.STEEL, 0.0);
        effectivenessMap.put(PokemonType.POISON, poisonMap);

        // GROUND
        Map<PokemonType, Double> groundMap = new EnumMap<>(PokemonType.class);
        groundMap.put(PokemonType.NORMAL, 1.0);
        groundMap.put(PokemonType.FIRE, 2.0);
        groundMap.put(PokemonType.WATER, 1.0);
        groundMap.put(PokemonType.ELECTRIC, 2.0);
        groundMap.put(PokemonType.GRASS, 0.5);
        groundMap.put(PokemonType.ICE, 1.0);
        groundMap.put(PokemonType.FIGHTING, 1.0);
        groundMap.put(PokemonType.POISON, 2.0);
        groundMap.put(PokemonType.GROUND, 1.0);
        groundMap.put(PokemonType.FLYING, 0.0);
        groundMap.put(PokemonType.PSYCHIC, 1.0);
        groundMap.put(PokemonType.BUG, 0.5);
        groundMap.put(PokemonType.ROCK, 2.0);
        groundMap.put(PokemonType.GHOST, 1.0);
        groundMap.put(PokemonType.DRAGON, 1.0);
        groundMap.put(PokemonType.DARK, 1.0);
        groundMap.put(PokemonType.STEEL, 2.0);
        effectivenessMap.put(PokemonType.GROUND, groundMap);

        // FLYING
        Map<PokemonType, Double> flyingMap = new EnumMap<>(PokemonType.class);
        flyingMap.put(PokemonType.NORMAL, 1.0);
        flyingMap.put(PokemonType.FIRE, 1.0);
        flyingMap.put(PokemonType.WATER, 1.0);
        flyingMap.put(PokemonType.ELECTRIC, 0.5);
        flyingMap.put(PokemonType.GRASS, 2.0);
        flyingMap.put(PokemonType.ICE, 1.0);
        flyingMap.put(PokemonType.FIGHTING, 2.0);
        flyingMap.put(PokemonType.POISON, 1.0);
        flyingMap.put(PokemonType.GROUND, 1.0);
        flyingMap.put(PokemonType.FLYING, 1.0);
        flyingMap.put(PokemonType.PSYCHIC, 1.0);
        flyingMap.put(PokemonType.BUG, 2.0);
        flyingMap.put(PokemonType.ROCK, 0.5);
        flyingMap.put(PokemonType.GHOST, 1.0);
        flyingMap.put(PokemonType.DRAGON, 1.0);
        flyingMap.put(PokemonType.DARK, 1.0);
        flyingMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.FLYING, flyingMap);

        // PSYCHIC
        Map<PokemonType, Double> psychicMap = new EnumMap<>(PokemonType.class);
        psychicMap.put(PokemonType.NORMAL, 1.0);
        psychicMap.put(PokemonType.FIRE, 1.0);
        psychicMap.put(PokemonType.WATER, 1.0);
        psychicMap.put(PokemonType.ELECTRIC, 1.0);
        psychicMap.put(PokemonType.GRASS, 1.0);
        psychicMap.put(PokemonType.ICE, 1.0);
        psychicMap.put(PokemonType.FIGHTING, 2.0);
        psychicMap.put(PokemonType.POISON, 2.0);
        psychicMap.put(PokemonType.GROUND, 1.0);
        psychicMap.put(PokemonType.FLYING, 1.0);
        psychicMap.put(PokemonType.PSYCHIC, 0.5);
        psychicMap.put(PokemonType.BUG, 1.0);
        psychicMap.put(PokemonType.ROCK, 1.0);
        psychicMap.put(PokemonType.GHOST, 1.0);
        psychicMap.put(PokemonType.DRAGON, 1.0);
        psychicMap.put(PokemonType.DARK, 0.0);
        psychicMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.PSYCHIC, psychicMap);

        // BUG
        Map<PokemonType, Double> bugMap = new EnumMap<>(PokemonType.class);
        bugMap.put(PokemonType.NORMAL, 1.0);
        bugMap.put(PokemonType.FIRE, 0.5);
        bugMap.put(PokemonType.WATER, 1.0);
        bugMap.put(PokemonType.ELECTRIC, 1.0);
        bugMap.put(PokemonType.GRASS, 2.0);
        bugMap.put(PokemonType.ICE, 1.0);
        bugMap.put(PokemonType.FIGHTING, 0.5);
        bugMap.put(PokemonType.POISON, 0.5);
        bugMap.put(PokemonType.GROUND, 1.0);
        bugMap.put(PokemonType.FLYING, 0.5);
        bugMap.put(PokemonType.PSYCHIC, 2.0);
        bugMap.put(PokemonType.BUG, 1.0);
        bugMap.put(PokemonType.ROCK, 1.0);
        bugMap.put(PokemonType.GHOST, 0.5);
        bugMap.put(PokemonType.DRAGON, 1.0);
        bugMap.put(PokemonType.DARK, 2.0);
        bugMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.BUG, bugMap);

        // ROCK
        Map<PokemonType, Double> rockMap = new EnumMap<>(PokemonType.class);
        rockMap.put(PokemonType.NORMAL, 1.0);
        rockMap.put(PokemonType.FIRE, 2.0);
        rockMap.put(PokemonType.WATER, 1.0);
        rockMap.put(PokemonType.ELECTRIC, 1.0);
        rockMap.put(PokemonType.GRASS, 1.0);
        rockMap.put(PokemonType.ICE, 2.0);
        rockMap.put(PokemonType.FIGHTING, 0.5);
        rockMap.put(PokemonType.POISON, 1.0);
        rockMap.put(PokemonType.GROUND, 0.5);
        rockMap.put(PokemonType.FLYING, 2.0);
        rockMap.put(PokemonType.PSYCHIC, 1.0);
        rockMap.put(PokemonType.BUG, 2.0);
        rockMap.put(PokemonType.ROCK, 1.0);
        rockMap.put(PokemonType.GHOST, 1.0);
        rockMap.put(PokemonType.DRAGON, 1.0);
        rockMap.put(PokemonType.DARK, 1.0);
        rockMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.ROCK, rockMap);

        // GHOST
        Map<PokemonType, Double> ghostMap = new EnumMap<>(PokemonType.class);
        ghostMap.put(PokemonType.NORMAL, 0.0);
        ghostMap.put(PokemonType.FIRE, 1.0);
        ghostMap.put(PokemonType.WATER, 1.0);
        ghostMap.put(PokemonType.ELECTRIC, 1.0);
        ghostMap.put(PokemonType.GRASS, 1.0);
        ghostMap.put(PokemonType.ICE, 1.0);
        ghostMap.put(PokemonType.FIGHTING, 1.0);
        ghostMap.put(PokemonType.POISON, 1.0);
        ghostMap.put(PokemonType.GROUND, 1.0);
        ghostMap.put(PokemonType.FLYING, 1.0);
        ghostMap.put(PokemonType.PSYCHIC, 2.0);
        ghostMap.put(PokemonType.BUG, 1.0);
        ghostMap.put(PokemonType.ROCK, 1.0);
        ghostMap.put(PokemonType.GHOST, 2.0);
        ghostMap.put(PokemonType.DRAGON, 1.0);
        ghostMap.put(PokemonType.DARK, 0.5);
        ghostMap.put(PokemonType.STEEL, 1.0);
        effectivenessMap.put(PokemonType.GHOST, ghostMap);

        // DRAGON
        Map<PokemonType, Double> dragonMap = new EnumMap<>(PokemonType.class);
        dragonMap.put(PokemonType.NORMAL, 1.0);
        dragonMap.put(PokemonType.FIRE, 1.0);
        dragonMap.put(PokemonType.WATER, 1.0);
        dragonMap.put(PokemonType.ELECTRIC, 1.0);
        dragonMap.put(PokemonType.GRASS, 1.0);
        dragonMap.put(PokemonType.ICE, 1.0);
        dragonMap.put(PokemonType.FIGHTING, 1.0);
        dragonMap.put(PokemonType.POISON, 1.0);
        dragonMap.put(PokemonType.GROUND, 1.0);
        dragonMap.put(PokemonType.FLYING, 1.0);
        dragonMap.put(PokemonType.PSYCHIC, 1.0);
        dragonMap.put(PokemonType.BUG, 1.0);
        dragonMap.put(PokemonType.ROCK, 1.0);
        dragonMap.put(PokemonType.GHOST, 1.0);
        dragonMap.put(PokemonType.DRAGON, 2.0);
        dragonMap.put(PokemonType.DARK, 1.0);
        dragonMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.DRAGON, dragonMap);

        // DARK
        Map<PokemonType, Double> darkMap = new EnumMap<>(PokemonType.class);
        darkMap.put(PokemonType.NORMAL, 1.0);
        darkMap.put(PokemonType.FIRE, 1.0);
        darkMap.put(PokemonType.WATER, 1.0);
        darkMap.put(PokemonType.ELECTRIC, 1.0);
        darkMap.put(PokemonType.GRASS, 1.0);
        darkMap.put(PokemonType.ICE, 1.0);
        darkMap.put(PokemonType.FIGHTING, 0.5);
        darkMap.put(PokemonType.POISON, 1.0);
        darkMap.put(PokemonType.GROUND, 1.0);
        darkMap.put(PokemonType.FLYING, 1.0);
        darkMap.put(PokemonType.PSYCHIC, 2.0);
        darkMap.put(PokemonType.BUG, 1.0);
        darkMap.put(PokemonType.ROCK, 1.0);
        darkMap.put(PokemonType.GHOST, 2.0);
        darkMap.put(PokemonType.DRAGON, 1.0);
        darkMap.put(PokemonType.DARK, 0.5);
        darkMap.put(PokemonType.STEEL, 1.0);
        effectivenessMap.put(PokemonType.DARK, darkMap);

        // STEEL
        Map<PokemonType, Double> steelMap = new EnumMap<>(PokemonType.class);
        steelMap.put(PokemonType.NORMAL, 1.0);
        steelMap.put(PokemonType.FIRE, 0.5);
        steelMap.put(PokemonType.WATER, 0.5);
        steelMap.put(PokemonType.ELECTRIC, 0.5);
        steelMap.put(PokemonType.GRASS, 1.0);
        steelMap.put(PokemonType.ICE, 2.0);
        steelMap.put(PokemonType.FIGHTING, 1.0);
        steelMap.put(PokemonType.POISON, 1.0);
        steelMap.put(PokemonType.GROUND, 1.0);
        steelMap.put(PokemonType.FLYING, 1.0);
        steelMap.put(PokemonType.PSYCHIC, 1.0);
        steelMap.put(PokemonType.BUG, 1.0);
        steelMap.put(PokemonType.ROCK, 2.0);
        steelMap.put(PokemonType.GHOST, 1.0);
        steelMap.put(PokemonType.DRAGON, 1.0);
        steelMap.put(PokemonType.DARK, 1.0);
        steelMap.put(PokemonType.STEEL, 0.5);
        effectivenessMap.put(PokemonType.STEEL, steelMap);
    }

    public static double getEffectiveness(PokemonType attackType, PokemonType defenseType){
        return effectivenessMap.get(attackType).get(defenseType);
    }
}