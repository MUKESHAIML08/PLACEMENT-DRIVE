import java.util.*;
public class Problem07 {
    public static void main(String[] args) {
        int[] a = {10, 25, 5, 40, 15};
        int given = 15, count = 0;
        for (int x : a) if (x > given) count++;
        System.out.println("Count = " + count);
    }
}