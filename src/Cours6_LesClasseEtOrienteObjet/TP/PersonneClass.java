package Cours6_LesClasseEtOrienteObjet.TP;

public class PersonneClass {

        /*

        Exo1

        String firstname;
        String lastname;
        String country;
        boolean married;
        byte kid;



        String nomComplet() {
            return firstname + "\n" + lastname;
        }

        String information() {
        return country + "\n" + married + "\n" + kid;
        }
*/

        private String firstname;
        private String lastname;
        private String country;
        private boolean married;
        private byte kid;

// Constructeur

       public PersonneClass(String firstname, String lastname, String country, boolean married, byte kid) {
               this.firstname=firstname;
               this.lastname=lastname;
               this.country=country;
               this.married=married;
               this.kid=kid;
       }

       public PersonneClass() {
           firstname="firstname";
           lastname="lastname";
           country="country";
           married=false;
           kid=0;
       }





 // getteur
        public String getfirstname(){
                return firstname;
        }

        public String getlastname(){
                return lastname;
        }

        public String getcountry(){
                return country;
        }

        public boolean getmarried(){
                return married;
        }

        public byte getkid(){
                return kid;
        }

// setteur
        public void setfirstname(String firstname){
           this.firstname=firstname;
        }

        public void setlastname(String lastname){
                this.lastname=lastname;
        }

        public void setcountry(String country){
                this.country=country;
        }

        public void setmarried(boolean married){
                this.married=married;
        }

        public void setkid(byte kid){
                this.kid=kid;
        }






        String nomComplet() {
                return firstname + "\n" + lastname;
        }

        String information() {
                return country + "\n" + married + "\n" + kid;
        }

    }


    /*
    public class Human {

    /*
    * TP 1 POO:

    Ecrire une classe Personne qui est décrit par les données suivantes:
    firstName
    lastName
    pays
    married(booléen)
    nombreEnfants
    On doit avoir une méthode qui retourne un string nomComplet
    Dans le main, vous devez à partir du clavier demander à l'utilisateur de
    fournir toutes ces données et enfin les afficher dans main.
    * */



    /*
    private String firstName;
    private String lastName;
    private String country;
    private boolean married;
    private int numberOfKids;
    public Human(String firstName, String lastName, String country, boolean married, int numberOfKids) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = married;
        this.numberOfKids = numberOfKids;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }


    public String fullDescription() {

        String tempStr = String.format("You are %s %s, living in %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married ? "married" : "not married",
                numberOfKids);

        return tempStr;

    }

}
     */