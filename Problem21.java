public class Problem21 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int half = a.length / 2;
        for (int i = 0, j = half - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int x : a) System.out.print(x + " ");
    }
}