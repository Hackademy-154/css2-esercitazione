public class ArraySomma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];
        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
            somma += numeri[i];
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}