import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = true;
            arr[y][x] = true;
        }
        
        visited[1] = true;
        int answer = dfs(arr,visited,1,n,0);

        System.out.println(answer);
    }

    private static int dfs(boolean[][] arr, boolean[] visited, int next,int n,int answer) {
        for(int i = 1; i <= n; i++) {
            if(arr[next][i] && !visited[i]) {//next노드와 이어져있지만 방문하지 않은 노드
                visited[i] = true;
                answer = dfs(arr,visited,i,n,answer + 1);
            }
        }
        
        return answer;
    }
}