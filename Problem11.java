public class Problem11 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 20, 40};
        int target = 20;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("First occurrence index = " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }
}