package Tp1;

import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println ("taille tableau 1 :");
        var taille1 = input.nextInt();

        float[] table1=new float[taille1];

        for(int i=0;i<=table1.length-1;i++){
            System.out.printf("inser[%d] : ",i);
            table1[i]=input.nextFloat();
        }

        System.out.println ("taille tableau 2 :");
        var taille2 = input.nextInt();

        float[] table2=new float[taille2];

        for(int i=0;i<=table1.length-1;i++){
            System.out.printf("inser[%d] : ",i);
            table1[i]=input.nextFloat();
        }

        System.out.println ("taille tableau 3 :");
        var taille3 = input.nextInt();

        float[] table3=new float[taille3];

        for(int i=0;i<=table1.length-1;i++){
            System.out.printf("inser[%d] : ",i);
            table1[i]=input.nextFloat();
        }





        for(int i=0;i<=table1.length-1;i=i+1){
            System.out.println(table1[i]);
        }

        for(int i=0;i<=table2.length-1;i=i+1){
            System.out.println(table2[i]);
        }

        for(int i=0;i<=table3.length-1;i=i+1){
            System.out.println(table3[i]);
        }



    }
}
