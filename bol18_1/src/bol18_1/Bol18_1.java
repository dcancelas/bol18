package bol18_1;

public class Bol18_1 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*50+1);
        }

        int i = numeros.length-1;
        while (i != -1) {
            System.out.print(numeros[i]+" ");
            i--;
        }
    }
}
