package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerpacks = new ArrayList<FlowerPack>();

    public void addFlowerPack(FlowerPack flowers) {
        flowerpacks.add(flowers);
    }

    public double getPrice() {
        int sum = 0;
        for (int i=0; i< flowerpacks.size(); i++) {
            sum += flowerpacks.get(i).getPrice();
        }
        return sum;
    }
}
