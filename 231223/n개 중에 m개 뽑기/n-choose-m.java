import java.util.*;

public class Main {
    static int n,m;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        choose(1,0);
    }

    public static void choose(int num,int count){
        if(num == m+1){
            print();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(i <= count)continue;
            arr.add(i);
            choose(num + 1,i);
            arr.remove(arr.size() - 1);
        }
    }

    public static void print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}