package store;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setFlowerType(FlowerTypes.CHAMOMILE);
        int[] color = {127, 0, 0};
        flower.setColor(color);
        flower.setPrice(23.50);

    }
    @org.junit.jupiter.api.Test
    void getColor() {

        assertEquals(127, flower.getColor()[0]);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(23.50, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowertype() {
        assertEquals("CHAMOMILE", flower.getFlowerType().toString());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Flower(sepalLength=0.0, color=[127, 0, 0], price=23.5, flowerType=CHAMOMILE)", flower.toString());
    }
}