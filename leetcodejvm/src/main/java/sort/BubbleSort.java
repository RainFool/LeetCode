package sort;

public class BubbleSort {


    public int[] sort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[i] > a[j]) {
                    int t;
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }
}
