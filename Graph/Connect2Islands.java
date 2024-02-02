package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Connect2Islands {
	  static int[] dx = {1, -1, 0, 0};
	    static int[] dy = {0, 0, -1, 1};

	    public static void dfs(List<List<Integer>> grid, boolean[][] vis, int x, int y, List<int[]> S) {
	        if (x < 0 || y < 0 || x >= grid.size() || y >= grid.get(0).size() || grid.get(x).get(y) == 0 || vis[x][y]) {
	            return;
	        }

	        vis[x][y] = true;
	        S.add(new int[]{x, y});

	        for (int i = 0; i < 4; i++) {
	            int xx = x + dx[i];
	            int yy = y + dy[i];

	            dfs(grid, vis, xx, yy, S);
	        }
	    }

	    public static int shortestBridge(List<List<Integer>> grid) {
	        List<int[]> p = new ArrayList<>();
	        List<int[]> q = new ArrayList<>();

	        int m = grid.size();
	        int n = grid.get(0).size();
	        boolean[][] vis = new boolean[m][n];
	        int marked = 0;

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (grid.get(i).get(j) == 1 && !vis[i][j]) {
	                    if (marked == 0) {
	                        dfs(grid, vis, i, j, p);
	                        marked++;
	                    } else {
	                        dfs(grid, vis, i, j, q);
	                    }
	                }
	            }
	        }

	        int ans = Integer.MAX_VALUE;

	        for (int[] pointP : p) {
	            for (int[] pointQ : q) {
	                int res = Math.abs(pointP[0] - pointQ[0]) + Math.abs(pointP[1] - pointQ[1]);
	                ans = Math.min(ans, res);
	            }
	        }

	        return ans - 1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();

	        List<List<Integer>> ans = new ArrayList<>();

	        for (int i = 0; i < m; i++) {
	            List<Integer> v = new ArrayList<>();
	            for (int j = 0; j < n; j++) {
	                int d = scanner.nextInt();
	                v.add(d);
	            }
	            ans.add(v);
	        }

	        System.out.println(shortestBridge(ans));
	    }
}
