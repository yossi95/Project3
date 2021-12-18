import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String first = scanner.nextLine();
      //  String str = "t   te tea";

        String sen=checkStr2(first);
        System.out.println(sen);

    }

    public static String checkStr2(String str) {
        String newSentence = " ";
        int appearSecondMost = 0;
        char note = ' ';
int appearMost=0;
        char temp = ' ';
        int count = 0;
        int counter = 0;
        char cha = ' ';

        char[] text = new char[str.length()];
        char[] c = new char[text.length];

        for (int i = 0; i < str.length(); i++) {

            text[i] = str.charAt(i);


        }

        for (int k = 0; k < str.length(); k++) {
            temp = str.charAt(k);

            count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (temp == str.charAt(j)) {

                    count++;

                }
            }
            if (appearMost <= count&&temp!=' ') {
               cha = temp;
                appearMost = count;


            } else {
                if (count > appearSecondMost&&temp!=' ') {

                   note = temp;
                    appearSecondMost = count;

                }


            }

        }
        for (int k = 0; k < str.length(); k++) {
            if (text[k]==note) {
                text[k] = cha;
                newSentence=newSentence+text[k];


            } else {
                if (text[k] == cha)
                    text[k] = note;
                newSentence=newSentence+text[k];

            }


        }


        return newSentence;
    }
}





