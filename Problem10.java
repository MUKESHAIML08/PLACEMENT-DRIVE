public class Problem10 {
    public static void main(String[] args) {
        int[] a = {9, 12, 15, 20, 7, 18};
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                System.out.println("Last even = " + a[i]);
                return;
            }
        }
        System.out.println("No even number");
    }
}