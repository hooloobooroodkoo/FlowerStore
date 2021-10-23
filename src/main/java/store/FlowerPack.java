package store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;
    private double price;

    public void setPrice() {
        this.price = flower.getPrice() * amount;
    }

    public FlowerTypes getFlowerType() {
        return flower.getFlowerType();
    }


}
