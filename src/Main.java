import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> triangleList = Task15.PascalsTriangleArrayList(10);
        for (int i = 0; i < triangleList.size(); ++i) {
            for (int j = 0; j < triangleList.get(i).size(); ++j) {
                System.out.print(triangleList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] triangle = Task15.PascalsTriangleArray(10);
        for (int i = 0; i < triangle.length; ++i) {
            for (int j = 0; j < triangle[i].length; ++j) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
