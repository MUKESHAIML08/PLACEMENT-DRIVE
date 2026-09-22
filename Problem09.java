public class Problem09 {
    public static void main(String[] args) {
        int[] a = {9, 7, 12, 15, 20};
        for (int x : a) {
            if (x % 2 == 0) {
                System.out.println("First even = " + x);
                return;
            }
        }
        System.out.println("No even number");
    }
}