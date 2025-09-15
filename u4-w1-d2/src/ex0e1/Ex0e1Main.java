package ex0e1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex0e1Main {
    public static void main(String[] args) {
        // l'esercizio 0 sarà insieme all'esercizio 1

        // 1)

        Random rdmArray = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int pos = 0;
        int newVal;

        for(int i = 0; i < array.length; i++){
            array[i] = rdmArray.nextInt(1,10);
        }
        System.out.println(Arrays.toString(array));


        while(true){
            System.out.println("Specificare la posizione dell'array:");
            pos = Integer.parseInt(scanner.nextLine());
            if (pos == 0){
                break;
            } else {
                System.out.println("Inserisci il nuovo valore:");
            newVal = Integer.parseInt(scanner.nextLine());
            }

            try {
                array[pos] = newVal;
                System.out.println("Array aggiornato: " + Arrays.toString(array));

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Errore: inserire la posizione corretta");
            }
        }

        System.out.println("Array finale: " + Arrays.toString(array));
        scanner.close();
    }
}
