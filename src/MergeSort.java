public class MergeSort {
    public static void merge(int[] a, int p, int q, int r) {
        int[] leftHalf = new int[q - p];
        int[] rightHalf = new int[r - q];
        
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = a[p + i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = a[q + i];
        }
        
        int i = 0, j = 0;
        for (int k = p; k < r; k++) {
            if (i < leftHalf.length && (j >= rightHalf.length || leftHalf[i] <= rightHalf[j])) {
                a[k] = leftHalf[i];
                i++;
            } else {
                a[k] = rightHalf[j];
                j++;
            }
        }
    }
    
    public static void sort(int[] a, int p, int r) {
        if (p < r - 1) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q, r);
            merge(a, p, q, r);
        }
    }
    
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3, 2, 6};
        sort(a, 0, a.length);
        
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}