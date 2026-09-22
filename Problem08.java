public class Problem08 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0, count = 0;
        for (int x : a) sum += x;
        double average = (double) sum / a.length;
        for (int x : a) if (x < average) count++;
        System.out.println("Average = " + average);
        System.out.println("Count = " + count);
    }
}