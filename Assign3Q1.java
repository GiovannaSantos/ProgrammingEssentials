public class Assign3Q1 {
    public static void main(String args[]) {

                char someChar = 'a';
                System.out.println("Char is: " + someChar);
        
                switch (someChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(someChar + " is a vowel.");
                        break;
                    default:
                        System.out.println(someChar + " is a consonant.");
                }
            }
        }
