import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String sen = stringSmallerThanFour();
        //System.out.println(sen);
        String str = "java";
        String str2 = subString(str);
    }

    public static String stringSmallerThanFour() {
        int min = 4;
        Scanner scanner = new Scanner(System.in);
        String newSentence = " ";
        String sen = " ";
        System.out.println("Enter sentence");
        ///  String name = "yosid";
        String name = scanner.nextLine();
        while (name.length() > min) {
            char[] text = new char[name.length()];
            char[] c = new char[text.length];
            for (int j = 0; j < name.length(); j++) {
                text[j] = name.charAt(j);
                newSentence = newSentence + text[j];
            }

            System.out.println(" New enter sentence");
            ///name = "yosser";
            name = scanner.nextLine();
        }
        return newSentence;

    }

    public static String subString(String str) {
        char b = ' ';
        //String name = "java";
        String se = " ";
        char a = ' ';


        String newString = " ";
        for (int i = 0; i < str.length(); i++) {


            for (int k =i+1; k < str.length(); k++) {
                a = str.charAt(k);

                newString = newString + a;


            }
           newString = newString + ",";

        }
        return newString;
    }
}












