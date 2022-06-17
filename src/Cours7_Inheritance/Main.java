package Cours7_Inheritance;

public class Main {
    public static void main(String[] args) {
        GuerrierClass chris=new GuerrierClass("Christian",400,"M16 A4");
        GuerrierClass mansour=new GuerrierClass("Mansour",900,"Lance-pierre");

        VoleurClass jean=new VoleurClass("Jean",1000,"Mains");

        MagicienClass nouha=new MagicienClass("Nouha",100,"baguette mystique");

        SorcierClass morgane=new SorcierClass("Morgane",200,"baguette morganienne","baton " +
                "morganien");

        chris.rencontrer();
        mansour.rencontrer();
        jean.rencontrer();
        nouha.rencontrer();
        morgane.rencontrer();
//
//        System.out.println(chris);
//        System.out.println(mansour);
//        System.out.println(jean);
//        System.out.println(nouha);
//        System.out.println(morgane);


    }
}
