public class ElementoMaggiore {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        int max = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        System.out.println("Il numero maggiore è: " + max);
    }
}