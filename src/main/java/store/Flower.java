package store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {
    private double sepalLength;
    private int[] color;
    private double price;
    private FlowerTypes flowerType;


    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

}
