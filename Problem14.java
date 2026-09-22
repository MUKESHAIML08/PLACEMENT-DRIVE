public class Problem14 {
    public static void main(String[] args) {
        int[] a = {10, 20, 15, 25, 20, 30};
        for (int i = 1; i < a.length; i++)
            if (a[i] > a[i - 1]) System.out.print(a[i] + " ");
    }
}