package aula19;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random random= new Random();
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        for (int i=0;i< vetA.length;i++){
            vetA[i] = random.nextInt(100);
            vetB[i] = vetA[i];
        }
        System.out.println("Vetor A");
        for (int i=0;i< vetA.length;i++){
            System.out.printf("["+i+"]: "+vetA[i]+" ");
        }
        System.out.println("\nVetor B");
        for (int i=0;i< vetB.length;i++){
            System.out.printf("["+i+"]: "+vetB[i]+" ");
        }
    }
}
