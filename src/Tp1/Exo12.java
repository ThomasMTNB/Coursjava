package Tp1;

import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nombre ?");
        int n = input.nextInt()+1;

        for (int i=n;i<(n+10);i=i+1){
            System.out.println(i);
        }

    }
}

