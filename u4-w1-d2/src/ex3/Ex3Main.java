package ex3;

import ex3.entities.ContoCorrente;
import ex3.entities.ContoOnline;
import ex3.exceptions.BancaException;

import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto1 = new ContoCorrente("Claudio", 1000);
        ContoOnline conto2 = new ContoOnline("Claudio", 1000, 2000);

        while(true){
            System.out.println("Specificare il conto : (1 - ContoCorrente ) / (2 - Conto Online) - (0 - Exit)");
            int conto = Integer.parseInt(scanner.nextLine());

            System.out.println("Specificare l'importo: ");
            double importo = Double.parseDouble(scanner.nextLine());

            try {
                switch(conto){
                    case 0:
                            break;
                    case 1:
                            conto1.preleva(importo);
                            System.out.println("Saldo del conto corrente: " + conto1.restituisciSaldo() + " €");
                            break;
                    case 2:
                            conto2.preleva(importo);
                            System.out.println("Saldo del conto online: " + conto2.restituisciSaldo() + " €");
                            break;
                    default:
                        System.out.println("Scelta non valida");
                }
            } catch (BancaException b){
                System.err.println("Errore: " + b.getMessage() + " ");
            }
                conto2.StampaPrelievo();
        }

    }
}
