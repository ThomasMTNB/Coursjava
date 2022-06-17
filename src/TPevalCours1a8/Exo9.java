package TPevalCours1a8;

public class Exo9 {
    public static void main(String[] args) {


            System.out.println(hasDoubles("terrific"));
            System.out.println(hasDoubles("chats"));
            System.out.println(hasDoubles("chats !!"));

        }

        public static boolean hasDoubles(String str) {

            char letter;
            boolean result = false;
            for (int i = 1; i < str.length(); i++) {
                letter = str.charAt(i);
                if (letter == str.charAt(i - 1)) {
                    result = true;
                }
            }
            return result;
        }
    }

