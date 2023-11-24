import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int num = 0;

        for(int i=0; i<binary.length(); i++){
            num = num*2 + binary.charAt(i)-'0';
        }

        num = num*17;

        int count = 0; 
        int[] digit = new int[20];

        while(true){
            if(num<2){
                digit[count] = num;
                break;
            }

            digit[count++] = num%2;
            num /= 2;
        }

        for(int i = count; i>=0; i--){
            System.out.print(digit[i]);
        }


    }
}