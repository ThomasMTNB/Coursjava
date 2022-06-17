package TPevalCours1a8;

public class Exo7 {
    public static void main(String[] args) {

        String ourString = "This is a string";
        char[] charArray = ourString.toCharArray();

        char[] s = minMaj(charArray);
        System.out.println(s);

    }

    public static char[] minMaj(char[] table){   // this is method


        for (int i = 0; i < table.length; i++) {
            if (i%2==0){
                table[i] = String.valueOf(table[i]).toUpperCase().charAt(0);  // valueof >>> convert to string
            } else {                                                           // upercase = uppercase si c'est string
                table[i] = String.valueOf(table[i]).toLowerCase().charAt(0); // charat0 = 1er letre du string
            }
        }
        return table;
    }
}
