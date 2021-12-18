public class Exe3 {
    public static void main(String[] args) {

        int num = 18;

        Factorization(num);

    }

    public static int[] Factorization(int num) {

        int c[] = new int[3];

        int k = 0;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                num = num / i;

                if (num % 2 == 0) {

                    int temp = num / i;

                    c[k] = temp;
                    k++;
                    num = 18;

                } else {

                    for (int j = 3; j < num; j++) {

                        if (num % j == 0) {

                            num = num / j;

                        }else {  if (num % 2 != 0) {
                                int temp = num;

                                c[k] = temp;
                                k++;
                                num = 18;

                                break;

                            }
                        }


                    }


                }

            }

        }
        c[k] = num;

        return c;
    }
}