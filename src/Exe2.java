public class Exe2 {

    public static void main(String[] args) {


        int[] array1 = {15, 80, 18, 47};
        int[] array2 = {80, 60, 34, 42};

      int location=  brothers(array1, array2);

    }


    public static int brothers(int[] array1, int[] array2) {


        int sum = 0;
        int bigBRO = 0;
        int i;
        int indexOfBigBrother = 0;

        for (i = 0; i < array1.length; i++) {
            int countbrother = 0;
            int j = 0;
            int rem;
            int num;
            num = array1[i] / 10;

            rem = array1[i] % 10;

            sum = rem + num;
            int check1 = sum;

            for (int k = 0; k < array2.length; k = k + 1) {

                num = array2[j] / 10;

                rem = array2[j] % 10;


                sum = rem + num;
                int check2 = sum;

                if (check1 == check2) {

                    countbrother++;/// מונה אחים של I

                    j++;
                } else j++;
            }

            int bro1 = countbrother;

            if (bro1 > bigBRO) {///בדיקה איזה אח הכי גדול
                bigBRO = bro1;
                indexOfBigBrother = i;/////מיקום של האח הכי גדול
            }
        }

        return indexOfBigBrother;
    }
}