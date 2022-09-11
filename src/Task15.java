import java.util.ArrayList;
import java.util.Arrays;

public class Task15 {
    public static ArrayList<ArrayList<Integer>> PascalsTriangleArrayList(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        if (n == 0)
            return triangle;
        if (n < 0)
            throw new IllegalArgumentException();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        int k = 2;
        for (int i = 1; i < n; ++i) {
            ArrayList<Integer> level = new ArrayList<>();
            level.add(1);
            for (int j = 1; j < k - 1; ++j) {
                level.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            level.add(1);
            triangle.add(level);
            ++k;
        }
        return triangle;
    }

    public static int[][] PascalsTriangleArray(int n) {
        if (n < 0)
            throw new IllegalArgumentException();

        int[][] triangle = new int[n][];

        if (n == 0)
            return triangle;

        triangle[0] = new int[]{1};
        int k = 2;

        for (int i = 1; i < n; ++i) {
            int[] level = new int[k];
            level[0] = 1;
            for (int j = 1; j < k - 1; ++j) {
                level[j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            level[k - 1] = 1;
            ++k;
            triangle[i] = level;
        }

        return triangle;
    }
}
