package person;

public class Player extends Person{
    private Inventory inventory;

    public Player(String name) {
        super(name);
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;

    }

    public void showInventory() {
        inventory.showItems();
    }

    public void showPlayerInfo() {
        super.showPlayerInfo();
        showInventory();
    }
}
