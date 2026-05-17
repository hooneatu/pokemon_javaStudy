package pokemon;

public class Pokemon {
    private String name;
    private PokemonType type;
    private int maxHealth;
    private int health;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String name, PokemonType type, int maxHealth, int health, int attack, int defense, int speed) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public String toString() {
        return "이름 : " + name + ", " +
                "타입 : " + type + ", " +
                "체력 : " + health + ", " +
                "공격력 : " + attack + ", " +
                "방어력 : " + defense + ", " +
                "스피드 : " + speed;
    }
}
