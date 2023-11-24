import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] day = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] result = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        int m2Day = 0;
        for(int i=m2-1; i>0;i--){
            m2Day += day[i];
        }
        m2Day += d2;

        int m1Day = 0;
        for(int i=m1-1;i>0; i--){
            m1Day += day[i];
        }
        m1Day += d1;


        int diff = m2Day-m1Day;

        if(diff<0){
            System.out.print(result[7-Math.abs(diff%7)]);
        }else{
            System.out.print(result[diff%7]);
        }

        

    }
}