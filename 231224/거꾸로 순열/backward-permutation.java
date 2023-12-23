import java.util.*;

public class Main {
    static int n;
    static boolean[] visited;
    static ArrayList<Integer> arr = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n];

        choose(1);
    }

    public static void choose(int num){
        if(num == n+1){
            print();
            return;
        }

        for(int i = n; i >= 1; i--){
            if(visited[i-1])continue;

            arr.add(i);
            visited[i-1] = true;
            choose(num+1);

            arr.remove(arr.size()-1);
            visited[i-1] = false;
        }
    }

    public static void print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}