import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] a, int p, int q, int r) {
        int[] leftHalf = Arrays.copyOfRange(a, p - 1, q);
        int[] rightHalf = Arrays.copyOfRange(a, q, r);

        leftHalf = Arrays.copyOf(leftHalf, leftHalf.length + 1);
        rightHalf = Arrays.copyOf(rightHalf, rightHalf.length + 1);

        leftHalf[leftHalf.length - 1] = Integer.MAX_VALUE;
        rightHalf[rightHalf.length - 1] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = p - 1; k < r; k++) {
            if (leftHalf[i] <= rightHalf[j]) {
                a[k] = leftHalf[i];
                i++;
            } else {
                a[k] = rightHalf[j];
                j++;
            }
        }
    }

    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3, 2, 6};
        sort(a, 1, a.length);
        System.out.println(Arrays.toString(a));
    }
}
