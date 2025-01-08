public classMediaNumeri {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        double media = (double) somma / numeri.length;
        System.out.println("La media dei numeri è: " + media);

        int sommaPari = 0, sommaDispari = 0;
        int conteggioPari = 0, conteggioDispari = 0;

        for (int numero : numeri) {
            if (numero % 2 == 0) { 
                sommaPari += numero;
                conteggioPari++;
            } else { 
                sommaDispari += numero;
                conteggioDispari++;

            }
        }
        double mediaPari = conteggioPari > 0 ? (double) sommaPari / conteggioPari : 0;
        double mediaDispari = conteggioDispari > 0 ? (double) sommaDispari / conteggioDispari : 0;

        System.out.println("La media dei numeri pari è: " + (conteggioPari > 0 ? mediaPari : "Nessun numero pari"));
        System.out.println("La media dei numeri dispari è: " + (conteggioDispari > 0 ? mediaDispari : "Nessun numero dispari"));
    }
}