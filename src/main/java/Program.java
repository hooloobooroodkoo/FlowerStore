import store.Flower;
public class Program {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i=0; i<flowers.length; i++) {
            flowers[i] = new Flower();
            flowers[i].setColor(color);
        }

        for (int i=0; i < flowers.length; i++) {
            System.out.println(flowers[i]);
        }
    }
}
