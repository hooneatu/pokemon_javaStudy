package item;

public class Item {
    String name;
    int amount;

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public void removeAmount(int amount) {
        this.amount -= amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void use() {
        if (amount > 0){
            amount--;
        }
        
        else {
            System.out.println("아이템이 부족합니다.");
        }
    }
}
