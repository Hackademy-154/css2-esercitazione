public class PosizionePari {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        System.out.println("Elementi in posizione pari:");

        
        for (int i = 0; i < numeri.length; i++) {
            if (i % 2 == 0) { // Posizione pari
                System.out.println("Indice " + i + ": " + numeri[i]);
            }
        }
    }
        
    }

