import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    public static boolean isValid(int[][] maze, int i, int j, int m, int n) {
        return (i >= 0 && j >= 0 && i < m && j < n);
    }

    public static void backtrack(int[][] maze, int i, int j,List<Integer> path,List<List<Integer>> res,int m, int n) {

        // Check boundary first
        if (!isValid(maze, i, j, m, n)) return;

        // Add current cell
        path.add(maze[i][j]);

        // Base case
        if (i == m - 1 && j == n - 1) {
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        // Move Down
        backtrack(maze, i + 1, j, path, res, m, n);

        // Move Right
        backtrack(maze, i, j + 1, path, res, m, n);

        // Backtrack
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] maze = new int[m][n];

        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int val = 1;

        // FIX: use i<m not i<n
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = val++;
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        backtrack(maze, 0, 0, path, res, m, n);

        System.out.println("\nAll Paths:");
        System.out.println(res);
    }
}