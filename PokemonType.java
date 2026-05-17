package pokemon;

public enum PokemonType {
    NORMAL,
    FIRE,
    WATER,
    GRASS,
    ELECTRIC,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DRAGON,
    DARK,
    STEEL;

    public String toString() {
        switch (this) {
            case FIRE:
                return "불";
            case WATER:
                return "물";
            case GRASS:
                return "풀";
            case ELECTRIC:
                return "전기";
            case FIGHTING:
                return "격투";
            case POISON:
                return "독";
            case GROUND:
                return "땅";
            case FLYING:
                return "비행";
            case PSYCHIC:
                return "에스퍼";
            case BUG:
                return "벌레";
            case ROCK:
                return "바위";
            case GHOST:
                return "고스트";
            case DRAGON:
                return "드래곤";
            case DARK:
                return "악";
            case STEEL:
                return "강철";
            default:
                return "노말";
        }
    }   
}
