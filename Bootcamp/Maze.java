import java.util.*;

public class Maze {
    static final int SIZE = 15;
    static char[][] maze = new char[SIZE][SIZE];
    static Random rand = new Random();
    static int[][] dirs = {{-1,0}, {0,1}, {1,0}, {0,-1}};

    public static void main(String[] args) {
        generateMaze();
        System.out.println("Generated Maze:");
        printMaze();
        System.out.println("\nSolving Maze:");
        solveMaze(0,0, SIZE-1, SIZE-1);
    }

    static void generateMaze() {
        for (int i = 0; i < SIZE; i++) Arrays.fill(maze[i], '#');
        dfs(0, 0);
        maze[0][0] = 'S';
        maze[SIZE-1][SIZE-1] = 'E';
    }

    static void dfs(int r, int c) {
        maze[r][c] = ' ';
        List<int[]> directions = Arrays.asList(dirs);
        Collections.shuffle(directions);
        for (int[] d : directions) {
            int nr = r + d[0]*2, nc = c + d[1]*2;
            if (inBounds(nr, nc) && maze[nr][nc] == '#') {
                maze[r + d[0]][c + d[1]] = ' ';
                dfs(nr, nc);
            }
        }
    }

    static void solveMaze(int sr, int sc, int er, int ec) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[SIZE][SIZE];
        int[][] parent = new int[SIZE*SIZE][2];
        q.add(new int[]{sr, sc});
        visited[sr][sc] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            if (r == er && c == ec) {
                markPath(parent, sr, sc, er, ec);
                printMaze();
                return;
            }
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (inBounds(nr, nc) && !visited[nr][nc] && (maze[nr][nc] == ' ' || maze[nr][nc] == 'E')) {
                    visited[nr][nc] = true;
                    parent[nr*SIZE + nc] = new int[]{r, c};
                    q.add(new int[]{nr, nc});
                }
            }
        }
        System.out.println("No path found!");
    }

    static void markPath(int[][] parent, int sr, int sc, int er, int ec) {
        int r = er, c = ec;
        while (!(r == sr && c == sc)) {
            if (maze[r][c] != 'E') maze[r][c] = '.';
            int[] p = parent[r*SIZE + c];
            r = p[0];
            c = p[1];
        }
    }

    static boolean inBounds(int r, int c) {
        return r >= 0 && c >= 0 && r < SIZE && c < SIZE;
    }

    static void printMaze() {
        for (char[] row : maze) {
            for (char cell : row) System.out.print(cell);
            System.out.println();
        }
        System.out.println();
    }
}