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

        for(int j=0;j<=table2.length-1;j++){
            System.out.printf("inser[%d] : ",j);
            table2[j]=input.nextFloat();
        }


        System.out.println ("taille tableau 3 :");
        var taille3 = input.nextInt();

        float[] table3=new float[taille3];

        for(int u=0;u<=table3.length-1;u++){
            System.out.printf("inser[%d] : ",u);
            table3[u]=input.nextFloat();
        }

        System.out.println("\ntableau 1 \n");

        for(int i=0;i<=table1.length-1;i=i+1){
            System.out.println(table1[i]);
        }

        System.out.println("\ntableau 2 \n");

        for(int j=0;j<=table2.length-1;j=j+1){
            System.out.println(table2[j]);
        }

        System.out.println("\ntableau 3 \n");

        for(int u=0;u<=table3.length-1;u=u+1){

            System.out.println(table3[u]);
        }

        float sommetables = 0;
/*

        if ((table1.length>=table2.length) && (table1.length>=table3.length)) {
            for (int i=0;i<=table1.length-1;i=i+1) {
                if (table1[i]%3==0) {
                    sommetables = sommetables + table1[i] + table2[i] + table3[i];
                }
            }
        }
        else if ((table2.length>=table1.length) && (table2.length>=table3.length)) {
            for (int i=0;i<=table2.length-1;i=i+1) {
                if (table1[i]%3==0) {
                    sommetables = sommetables + table1[i] + table2[i] + table3[i];
                }
            }
        }
        else {
            for (int i=0;i<=table3.length-1;i=i+1) {
                if (table1[i]%3==0) {
                    sommetables = sommetables + table1[i] + table2[i] + table3[i];
                }
            }
        }
*/

        for (int i=0;i<=table1.length-1;i=i+1) {
            if (table1[i]%3==0) {
                sommetables = sommetables + table1[i] ;
            }
        }

        for (int i=0;i<=table2.length-1;i=i+1) {
            if (table2[i]%3==0) {
                sommetables = sommetables + table2[i];
            }
        }

        for (int i=0;i<=table3.length-1;i=i+1) {
            if (table3[i]%3==0) {
                sommetables = sommetables +table3[i];
            }
        }




        System.out.println("\nSomme des tableaux = " + sommetables);






    }
}
