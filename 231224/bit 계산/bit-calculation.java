import java.util.*;

public class Main {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            String str = sc.next();
            order(str);
        }
    }

    public static void order(String str){
        if(str.equals("add")){
            int addNum = sc.nextInt();
            if(((num>>addNum)&1)==0){
                num^=(1<<addNum);
            }
        }else if(str.equals("delete")){
            int deleteNum = sc.nextInt();
            if(((num>>deleteNum)&1) == 1){
                num=num^(1<<deleteNum);
            }
        }else if(str.equals("print")){
            int printNum = sc.nextInt();
            System.out.println((num>>printNum)&1);
            
        }else if(str.equals("toggle")){
            int toggleNum = sc.nextInt();
            num^=(1<<toggleNum);
        }else{
            num=0;
        }
    }
}