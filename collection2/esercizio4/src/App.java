import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Person> persone = new ArrayList<>();
        persone.add(new Person("Sara", 25));
        persone.add(new Person("Anna", 30));
        persone.add(new Person("Clara", 20));

        // Stampa della lista iniziale
        System.out.println("Lista di persone:");
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(i + ": " + persone.get(i));
        }

        
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("\nInserisci l'indice della persona da modificare:");
        int indice = scanner.nextInt();

        // Controllo della validità dell'indice
        if (indice >= 0 && indice < persone.size()) {
            // Richiedere i nuovi dati dell'utente modificato 
            scanner.nextLine(); 
            System.out.println("Inserisci il nuovo nome:");
            String nuovoNome = scanner.nextLine();
            System.out.println("Inserisci la nuova età:");
            int nuovaEta = scanner.nextInt();

            
            Person personaSelezionata = persone.get(indice);
            personaSelezionata.setNome(nuovoNome);
            personaSelezionata.setEta(nuovaEta);

            // Stampa della lista aggiornata con l'utente modificato
            System.out.println("\nLista aggiornata:");
            for (int i = 0; i < persone.size(); i++) {
                System.out.println(i + ": " + persone.get(i));
            }
        } else {
            System.out.println("Indice non valido!");
        }

        scanner.close();
    }
}
