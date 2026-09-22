public class Problem17 {
    public static void main(String[] args) {
        int[] a = {0, 10, 0, 20, 30, 0};
        int index = 0;
        for (int x : a) if (x != 0) a[index++] = x;
        while (index < a.length) a[index++] = 0;
        for (int x : a) System.out.print(x + " ");
    }
}