import java.util.*;

public class Main {
   static int n,m,k;
    static int[] move;
    static int max = 0;

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //n번의 턴
        m = sc.nextInt(); //칸의 개수
        k = sc.nextInt(); //말의 개수

        move = new int[n];
        for(int i = 0; i < n; i++){
            move[i] = sc.nextInt();
        }

        choose(1);
        System.out.print(max);

    }

    public static void choose(int num){//조합만들기
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
        int[] score = new int[k+1]; //말 당 점수를 기록
        int ans = 0;

        for(int i = 0; i < arr.size(); i++){
            int horse = arr.get(i);
            score[horse]+= move[i];
        }

        for(int i = 1; i < score.length; i++ ){
            if(score[i] >= m-1){
                ans++;
                max = Math.max(ans,max);
            }
        }
    }
}