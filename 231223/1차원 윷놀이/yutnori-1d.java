import java.util.*;

public class Main {
    static int n,m,k;
    static int[] move;
    static int max = 0;

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        move = new int[n];
        for(int i = 0; i < n; i++){
            move[i] = sc.nextInt();
        }

        choose(1);
        System.out.print(max);

    }

    public static void choose(int num){
        if(num == n+1){
            countScore();
            return;
        }

        for(int i = 1; i <= k; i++){
            arr.add(i);
            choose(num + 1);
            arr.remove(arr.size() - 1);
        }
    }

    public static void countScore(){
        int[] score = new int[n+1];
        int ans = 0;

        for(int i = 0; i < arr.size(); i++){
            int horse = arr.get(i);
            score[horse]+= move[i];
        }

        for(int i = 1; i < n+1; i++ ){
            if(score[i] >= m){
                ans++;
                max = Math.max(ans,max);
            }
        }
    }
}