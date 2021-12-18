import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {16, 6, 3, 4, 5, 8};
        Alternate(array);

    }

    public static boolean Alternate(int[] array2) {
     boolean duplicate =true;
        int j = 1;

        for (int i = 0; i < array2.length; i++) {
            if (array2[j] % 2 == 0 && array2[i]%2!=0 ) {

                j++;
                return true;

            }else if (array2[i]%2==0 && array2[j]%2!=0) {

                j++;

            }else if (array2[i]%2==0&&array2[j]%2==0){

    return false;
}

            }
return true;
        }



        }





