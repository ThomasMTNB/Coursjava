package Cours2.TP;

public class Exo4 {
    public static void main(String[] args) {
        int A = 51;
        int B = 876;
        int C = 235;
        int Atemp = A;
        int Btemp = B;
        int Ctemp = C;
        C = B;
        A = Ctemp;
        B = Atemp;
        System.out.println("a="+A+" "+"b="+B+" "+"c="+C);

    }
}
/*
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer a: ");
        a = t.nextInt();

        System.out.print("Entrer b: ");
        b = t.nextInt();

        System.out.print("Entrer C: ");
        c = t.nextInt();

        System.out.println("Les valeurs entrees sont: a=" +a+ ", b="+b+ " ,c="+c);

        System.out.println("Les valeurs permutees sont: a=" +c+ ", b="+a+ " ,c="+b);
     */
