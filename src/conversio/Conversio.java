/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix en €: ");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    }
}
