package sort;

public class QuickSort {

    public void sort(int[] a, int left, int right) {
        if (left < right) {
            int mid = partition(a, left, right);
            sort(a, left, mid - 1);
            sort(a, mid + 1, right);
        }
    }

    public int partition(int[] a, int left, int right) {
        int flag = a[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (a[j] < flag) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[right];
        a[right] = t;
        return i + 1;
    }
}
