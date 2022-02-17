public class Main {
    public static void main(String[] args) {
        int[] numb = {0, 2, 4, 5, -2, -4, 4, 7, 1, 3, 9};
        int j = 0;
        for (int num : numb) {
            for (int i = j; i < numb.length; i++) {
                if (num + numb[i] == 5) {
                    System.out.format("%s and %s\n", num, numb[i]);

                }
            }
            j++;
        }
    }
}