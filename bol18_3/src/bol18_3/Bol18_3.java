package bol18_3;

import java.util.Scanner;

public class Bol18_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[30];
        int[] notas = new int[30];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Introduce o nome do alumno "+(i+1)+"/30: ");
            nomes[i] = sc.next();
            System.out.print("Introduce a súa nota: ");
            notas[i] = sc.nextInt();
            System.out.println("");
        }

        /*String[] nomes = {"Eutimio","Patxi","Maricruz","Quique","Atilio","Camilo","Paulo","Pepe","Bethania","Maia","Luisita","Leocadio","Anna","Aitor","Èric","Julen","Isidoro","Marta","Casimiro","Enric","Adela","Maialen","Calixto","Mireia","Agnès","Iria","Claudia","Ernesto","Arsenio","Maximiliano"};
        int[] notas = {8,5,4,3,6,7,8,9,10,6,7,8,8,9,9,5,5,5,6,7,5,9,8,7,6,6,7,7,4,10};*/

        int option = 0;
        while (option != 8) {
            System.out.println(
                    "\n\n┌────────────────────── Que quere facer a continuación? ──────────────────────┐"+
                    "\n│  1. Número de alumnos aprobados      │  5. Nome dos alumnos aprobados       │"+
                    "\n│  2. Número de alumnos suspensos      │  6. Notas por orde crecente          │"+
                    "\n│  3. Nota media da clase              │  7. Nota dun alumno determinado      │"+
                    "\n│  4. Visualizar nota máis alta        │  8. Saír                             │"+
                    "\n└──────────────────────────────────────┴──────────────────────────────────────┘");
            option = sc.nextInt();
            switch (option) {
                //Visualiza o número de alumnos aprobados
                case 1:
                    int numAprob = 0;
                    for (int nota : notas) {
                        if (nota >= 5) {
                            numAprob++;
                        }
                    }
                    System.out.println("Alumnos aprobados: "+numAprob);

                    //Establece un tempo de espera de 3 segundos
                    try { Thread.sleep(3 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Visualiza o número de alumnos suspensos
                case 2:
                    int numSusp = 0;
                    for (int nota : notas) {
                        if (nota < 5) {
                            numSusp++;
                        }
                    }
                    System.out.println("Alumnos suspensos: "+numSusp);

                    try { Thread.sleep(3 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Calcula a nota media da clase
                case 3:
                    int sumaNotas = 0;
                    for (int nota : notas) {
                        sumaNotas = (nota + sumaNotas);

                    }
                    System.out.println("\nNota media da clase: "+(sumaNotas/notas.length));

                    try { Thread.sleep(3 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Visualiza a nota máis alta
                case 4:
                    int[] auxNotas = new int[30];
                    String[] auxNomes = new String[30];
                    System.arraycopy(notas, 0, auxNotas, 0, notas.length);
                    System.arraycopy(nomes, 0, auxNomes, 0, nomes.length);

                    int auxnota;
                    for (int i = 0; i < notas.length; i++) {
                        for (int j = i+1; j < notas.length; j++) {
                            if (notas[i] > notas[j]) {
                                auxnota = notas[i];
                                notas[i] = notas[j];
                                notas[j] = auxnota;
                            }
                        }
                    }
                    System.out.println("\nNota máis alta: "+notas[notas.length-1]);

                    System.arraycopy(auxNotas, 0, notas, 0, auxNotas.length);
                    System.arraycopy(auxNomes, 0, nomes, 0, auxNomes.length);

                    try { Thread.sleep(3 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Lista co nome dos alumnos aprobados
                case 5:
                    System.out.print("Alumnos aprobados: ");
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] >= 5) {
                            System.out.print(nomes[i]+", ");
                        }
                    }

                    try { Thread.sleep(4 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Lista de notas por orde crecente
                case 6:
                    auxNotas = new int[30];
                    auxNomes = new String[30];
                    System.arraycopy(notas, 0, auxNotas, 0, notas.length);
                    System.arraycopy(nomes, 0, auxNomes, 0, nomes.length);

                    String auxnome;
                    for (int i = 0; i < notas.length; i++) {
                        for (int j = i+1; j < notas.length; j++) {
                            if (notas[i] > notas[j]) {
                                auxnota = notas[i];
                                notas[i] = notas[j];
                                notas[j] = auxnota;
                                auxnome = nomes[i];
                                nomes[i] = nomes[j];
                                nomes[j] = auxnome;
                            }
                        }
                    }
                    System.out.println("Notas por orde crecente: ");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print(nomes[i]+": "+notas[i]+", ");
                    }

                    System.arraycopy(auxNotas, 0, notas, 0, auxNotas.length);
                    System.arraycopy(auxNomes, 0, nomes, 0, auxNomes.length);

                    try { Thread.sleep(4 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Visualiza a nota dun alumno determinado
                case 7:
                    System.out.print("\nIntroduce o nome do alumno: ");
                    String nomeAlumno = sc.next();
                    int numNota = 0;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i].equals(nomeAlumno)) {
                            numNota = i;
                        }
                    }
                    if (numNota == 0) System.out.print("O nome introducido non é correcto");
                    else System.out.print("A súa nota é: "+notas[numNota]);

                    try { Thread.sleep(3 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                //Permite saír do programa
                case 8:
                    break;
                default:
                    System.out.println("O número introducido non é correcto");

                    try { Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }
        }
    }
}
