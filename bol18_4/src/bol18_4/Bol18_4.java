package bol18_4;

import java.util.Scanner;

public class Bol18_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letraDNI = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int numeroDNI;

        int numcifras = 0;
        do {
            System.out.print("\nIntroduce o número do DNI: ");
            numeroDNI = sc.nextInt();

            int numaux = numeroDNI;
            while (numaux != 0) {
                numaux = numaux/10;
                numcifras++;
            }
            if (numcifras != 8) {
                System.out.println("O número do DNI ten que ter 8 cifras");
            }
        }while (numcifras != 8);

        int restoDNI = numeroDNI % 23;
        for (int i = 0; i < letraDNI.length; i++) {
            if (i == restoDNI) {
                System.out.println("Letra do DNI: "+letraDNI[i]);
            }
        }
    }
}
