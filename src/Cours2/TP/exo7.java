package Cours2.TP;

import java.sql.SQLOutput;

public class exo7 {
    public static void main(String[] args) {
        byte n=0;

        boolean iseven=(n % 2 == 0);
        boolean ispositif;


        if (n==0) {
            System.out.print("le nombre est nul");
        }
        if (n!=0) {
            if (n>0) {
                ispositif=true;
            }
            else {
                ispositif=false;
            }
            System.out.printf("le nombre est %s et %s", iseven?"pair":"impair", ispositif?"positif":"negatif");
        }

// a reduire


    }
}
