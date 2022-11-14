package conversio;

import java.util.Scanner;

public class Conversio {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int opcio;

        do {
            System.out.println("OPCIONS QUE POTS TRIAR");
            System.out.println("1. Conversor d'euro a lliura.");
            System.out.println("2. Conversor de lliura a euro.");
            System.out.println("3. Sortir.");

            System.out.println("\n Tria una opció");

            opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix quants euros vols convertir: ");
                    int valor_euros = teclat.nextInt();
                    double tipus_de_canvi = 0.87d;
                    System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");

                    System.out.println("PREM RETURN per tornar al menu");
                    teclat.nextLine();
                    teclat.nextLine();

                    break;

                case 2:
                    System.out.print("Introdueix quantes lliures vols convertir ");
                    int valor_lliura = teclat.nextInt();
                    double canvi_a_euro = 1.14d;
                    System.out.println(valor_lliura + " lliura (£) actualment equivalen a " + (valor_lliura * canvi_a_euro) + " lliures euros €)");

                    System.out.println("PREM RETURN per continuar");
                    teclat.nextLine();
                    teclat.nextLine();
                    break;
                    
                case 3:
                    System.out.println("Adeu, fins un altra.");
                    break;

                default:
                    System.out.println("Opció INCORRECTA, ha de ser del 1 al 3!!");
            }

        } while (opcio != 3);

    }
}
