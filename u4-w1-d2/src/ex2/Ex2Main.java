package ex2;

import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numKm = 0;
        int litriConsumati = 0;
        int risultato=0;

        System.out.println("Inserire il numero di kilometri percorsi:");
        numKm = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserire il numero di litri di carburante consumato:");
        litriConsumati = Integer.parseInt(scanner.nextLine());

        try{
            risultato = numKm/litriConsumati;
        } catch (ArithmeticException e){
            System.out.println("Errore: non è possibili dividere per 0");
        } finally {
            scanner.close();
        }

        System.out.println("Totali Km/litri percorso in auto: " + risultato + " Km");

    }


}
