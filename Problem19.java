public class Problem19 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) a[i] = a[i - 1];
        a[0] = last;
        for (int x : a) System.out.print(x + " ");
    }
}