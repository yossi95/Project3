public class Exe4 {
    public static void main(String[] args) {

        int[] arr = {15, 14, 17};
        boolean value = fullArr(arr);

        int[] arr2 = {4, 3, 2, 1};
        boolean isFull = newFullArr(arr2);
    }


    public static boolean fullArr(int[] arr2) {
        boolean full = false;
        for (int i = 0; i < arr2.length; i++) {

            for (int j = i + 1; j < arr2.length; j++) {

                if (arr2[i] > arr2[j]) {

                    int temp = arr2[j];
                    int temp2 = arr2[i];
                    arr2[i] = temp;
                    arr2[j] = temp2;
                }
            }
        }
        int k = 1;
        for (int i = 0; i < arr2.length; i++) {

            if (k < arr2.length)
                if (arr2[k] - arr2[i] != 1) {

                    return false;
                }

            k++;

        }


        return true;
    }

    public static boolean newFullArr(int[] arr2) {
        boolean full = true;
        int[] c = new int[4];

        int[] temp = new int[c.length];
        int k = 0;
        int j = 1;
        int subtraction = 0;
        for (int i = 0; i <arr2.length; i++) {

            if (k < arr2.length) {

                subtraction = arr2[i] - arr2[j];

                if (subtraction == 1) {

                    c[k] = arr2[i];
                    k++;
                    j++;

                }
                } else {
                    full = false;
                    break;
                }
                }


            return full;
        }
    }
