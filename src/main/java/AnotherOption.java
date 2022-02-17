import java.util.Arrays;

public class AnotherOption {
    public static void main(String[] args) {
        int[] numb = {0, 2, 4, 5, -2, -4, 4, 7, 1, 3, 9};

        int j = 1;
        for (int num : numb) {
            int[] x2 = Arrays.copyOfRange(numb, j, numb.length);
            for (int nums : x2) {
                if (num + nums == 5) {
                    System.out.format("%s and %s\n", num, nums);
                }
            }
            j++;
        }
    }
}
