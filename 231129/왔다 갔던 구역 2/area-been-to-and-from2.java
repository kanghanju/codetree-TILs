import java.util.*;

public class Main {
    static int[] arr = new int[2001];
    static int pos = 1000;

    public static void move(int dis,char dir){
        if(dir == 'L'){
            for(int i = 0; i < dis; i++){
                arr[pos++] += 1;
            }
        }else{
            for(int i = 0; i < dis; i++){
                arr[pos--] += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            move(dis,dir);
        }

        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 2)ans++;
        }

        System.out.print(ans);
    }
}