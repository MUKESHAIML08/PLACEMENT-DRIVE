public class Problem12 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 20, 40};
        int target = 20;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == target) {
                System.out.println("Last occurrence index = " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }
}