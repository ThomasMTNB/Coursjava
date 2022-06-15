package Cours1.TP;

public class Exo1 {
    public static void main(String[] args) {

        byte age=16;

        if (age<7) {
            System.out.println("too young");
        }
        else if (age>=7 && age<10) {
            System.out.println("Poussin");
        }
        else if (age>=10 && age<11) {
            System.out.println("Pupille");
        }
        else if (age>=12 && age<13) {
            System.out.println("Benjamin");
        }
        else if (age>=14 && age<15) {
            System.out.println("Minime");
        }
        else if (age>=16 && age<17) {
            System.out.println("Cadet");
        }
        else {
            System.out.println("not a kid yo");
        }
    }
}
