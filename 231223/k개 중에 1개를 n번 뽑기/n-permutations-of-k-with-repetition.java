import java.util.*;

public class Main {
    public static int k,n;
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);

    }

    public static void print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    public static void choose(int chooseNum){
        if(chooseNum == n+1){//종료 조건
            print();
            return;
        }

        for(int i = 1; i <= k; i++){
            arr.add(i);
            choose(chooseNum + 1);
            arr.remove(arr.size()-1);
        }
    }
}