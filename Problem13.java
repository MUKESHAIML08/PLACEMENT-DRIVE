public class Problem13 {
    public static void main(String[] args) {
        int[] a = {10, 20, 15, 25, 30, 20};
        int count = 0;
        for (int i = 0; i < a.length - 1; i++)
            if (a[i + 1] > a[i]) count++;
        System.out.println("Increasing adjacent pairs = " + count);
    }
}