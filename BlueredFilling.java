import java.util.*;

public class Main {
    static int n = 9;
    static String[][] arr = new String[n][n];
    static boolean[][] visitedRed = new boolean[n][n];
    static boolean[][] visitedBlue = new boolean[n][n];

    
    static int[][] redDirs = {{-1,0},{1,0},{0,-1},{0,1}};

    
    static int[][] blueDirs = {{-1,-1},{-1,1},{1,-1},{1,1}};

    public static void main(String[] args) {

        
        for (int i = 0; i < n; i++)
            Arrays.fill(arr[i], ".");

       
        arr[1][2] = "R";
        arr[3][4] = "B";
        arr[3][8] = "R";
        arr[4][5] = "R";
        arr[5][6] = "R";
        arr[6][5] = "B";
        arr[7][3] = "R";
        arr[8][1] = "B";
        arr[7][8] = "B";
        arr[8][8] = "R";

        fillRed();
        fillBlue();

        printMatrix();
    }

    static void fillRed() {
        Queue<int[]> q = new LinkedList<>();

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ("R".equals(arr[i][j])) {
                    q.add(new int[]{i, j});
                    visitedRed[i][j] = true;
                }
            }
        }

       
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            for (int[] d : redDirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (inBounds(nr, nc) && !visitedRed[nr][nc] && !"B".equals(arr[nr][nc])) {
                    arr[nr][nc] = "R";  // paint
                    visitedRed[nr][nc] = true;

                }
            }
        }
    }

    static void fillBlue() {
        Queue<int[]> q = new LinkedList<>();

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ("B".equals(arr[i][j])) {
                    q.add(new int[]{i, j});
                    visitedBlue[i][j] = true;
                }
            }
        }

        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            for (int[] d : blueDirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (inBounds(nr, nc) && !visitedBlue[nr][nc]) {
                    if ("R".equals(arr[nr][nc]) && visitedRed[nr][nc]) {
                        arr[nr][nc] = "B";
                        visitedBlue[nr][nc] = true;
                    } else if (".".equals(arr[nr][nc])) {
                        arr[nr][nc] = "B";
                        visitedBlue[nr][nc] = true;
                    }
                  
                }
            }
        }
    }

    static boolean inBounds(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    static void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
