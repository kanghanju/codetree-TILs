import java.util.*;

public class Main {
    static int n;
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n+1];

        choose(1);
    }

    public static void choose(int num){
        if(num == n+1){
            print();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i])continue;

            arr.add(i);
            visited[i] = true;
            choose(num + 1);

            arr.remove(arr.size()-1);
            visited[i] = false;
        }
    }

    public static void print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}