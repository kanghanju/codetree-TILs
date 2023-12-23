import java.util.*;

public class Main {
    static int n,k;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);
    }

    public static void choose(int num){
        if(num == n+1){
            print();
            return;
        }

        for(int i = 1; i <= k; i++){
            if(num > 2 && i == arr.get(arr.size()-1) && i == arr.get(arr.size()-2)){
                continue;
            }
            arr.add(i);
            choose(num+1);
            arr.remove(arr.size()-1);
        }
    }

    public static void  print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }


}