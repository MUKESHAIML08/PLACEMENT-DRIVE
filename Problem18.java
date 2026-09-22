public class Problem18 {
    public static void main(String[] args) {
        int[] a = {10, -5, 20, -2, 30, -8};
        int index = 0;
        for (int x : a) if (x < 0) a[index++] = x;
        for (int x : a) if (x >= 0) a[index++] = x;
        for (int x : a) System.out.print(x + " ");
    }
}