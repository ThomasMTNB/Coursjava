package Cours6.TP;

public class PatientClass {


    private String nom;
    private String prenom;
    private float taille;
    private float poid;
    private int age;


    public PatientClass(String nom, String prenom, float taille, float poid, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.taille=taille;
        this.poid=poid;
        this.age=age;
    }



    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public float gettaille(){
        return taille;
    }
    public float getpoid(){
        return poid;
    }
    public float getage(){
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void settaille(float taille){
        this.taille=taille;
    }
    public void setPoid(float poid){
        this.poid=poid;
    }
    public void setage(int age){
        this.age=age;
    }




    public float IMC() {
        return poid / (taille*taille);
    }

    String patientinfo() {
        return nom + "\n" + prenom + "\n" + poid + "\n" + taille + "\n" + age + "\n";
    }


}


/*

public class Patient {

    private String nom;
    private String prenom;
    private byte age;
    private float poids;
    private float taille;

    public Patient(String nom,String prenom,byte age,float poids,float taille){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.poids=poids;
        this.taille=taille;
    }

    public Patient(){
        nom="Doe";
        prenom="Jane";
        age=30;
        poids=50;
        taille=1.60f;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public byte getAge() {return age;}
    public void setAge(byte age) {this.age = age;}

    public float getPoids() {return poids;}
    public void setPoids(float poids) {this.poids = poids;}

    public float getTaille() {return taille;}
    public void setTaille(float taille) {this.taille = taille;}

    public double indiceMasseCorporelle() {return (poids/Math.pow(taille,2));}

    public void fichePatient(){
        System.out.println("Fiche patient : ");
        System.out.println("Nom :"+this.getNom());
        System.out.println("Prenom : "+this.getPrenom());
        System.out.println("Age : "+this.getAge());
        System.out.println("Poids : "+this.getPoids());
        System.out.println("Taille : "+this.getTaille());
        System.out.printf("IMC : %.2f\n\n",this.indiceMasseCorporelle());}

    public void interpretation(){
        if(this.getAge()<18 || this.getAge()>65){
            System.out.println("L'IMC n'est pas interpretable au vu de votre age.");
        }else{
            this.fichePatient();
        }
    }
}}
 */