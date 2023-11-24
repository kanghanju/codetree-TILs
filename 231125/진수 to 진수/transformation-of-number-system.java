import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String n = sc.next();

        int num = 0;
        for(int i=0; i<n.length(); i++){
            num = num*a + (n.charAt(i)-'0'); //a진수로 표현된 n을 십진수로 변환하는 포인트가 중요하다!!!!
        }

        int[] result = new int[20];
        int count = 0;

        while(true){
            if(num<b){
                result[count] = num;
                break;
            }

            result[count++] = num%b;
            num /= b;
        }

        for(int i=count;i>=0;i--)System.out.print(result[i]);


    }
}