package Switch;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
       // Create scanner obj for accept user input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
                case 'e':
                    case 'i':
                        case 'o':
                            case 'u':
                                System.out.println(ch + " is vowel");
                                break;
                                default:
                                    if((ch >='a' && ch <= 'z')){
                                        System.out.println(ch +" is consonant");
                                    }else {
                                        System.out.println(ch +" is not letter");
                                    }
        }
        sc.close();
    }
}
