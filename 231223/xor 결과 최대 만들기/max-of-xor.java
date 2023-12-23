import java.util.*;

public class Main {
    static int n,m;
    static int[] num;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        findMaxXor(0,0,0);
        System.out.print(max);

    }

    public static void findMaxXor(int currIdx,int cnt, int currVal){
        if(cnt == m){//m개보다 더 뽑아버리면
            max = Math.max(max,currVal);
            return;
        }

        if(currIdx == n){
            return;
        }

        findMaxXor(currIdx+1,cnt,currVal); //currIdx index에 있는 숫자를 선택안함
        findMaxXor(currIdx+1,cnt+1,currVal^num[currIdx]);//currIdx index에 있는 숫자를 선택함

    }

}