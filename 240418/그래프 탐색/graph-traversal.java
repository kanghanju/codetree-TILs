import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static final int MAX_NUM = 1000;
    public static int n, m;

    public static List<Integer>[] graph = new ArrayList[MAX_NUM + 1];
    public static boolean[] visited = new boolean[MAX_NUM + 1];
    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 1; i <=n; i++) {//이 부분 주의 
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        visited[1] = true;
        dfs(1);

        System.out.println(answer);
    }

    private static void dfs(int vertex) {
        //주어진 정점에서 이어져있는 모든 정점을 탐색한다. graph[vertex].size()
        for(int i = 0; i < graph[vertex].size(); i++) {
            int currV = graph[vertex].get(i);
            if(!visited[currV]) {
                visited[currV] = true;
                answer++;
                dfs(currV);
            }
        }
    }
}