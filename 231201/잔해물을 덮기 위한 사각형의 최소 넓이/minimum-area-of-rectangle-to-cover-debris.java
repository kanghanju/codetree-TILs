import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2001][2001];
        
        for(int i = 0; i < 2; i++){
            int x1 = sc.nextInt()+1000;
            int y1 = sc.nextInt()+1000;
            int x2 = sc.nextInt()+1000;
            int y2 = sc.nextInt()+1000;

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    grid[j][k] = i+1;
                }
            }
        }

        int minRow = 2000,minCol = 2000;
        int maxRow = 0,maxCol = 0;

        for(int i = 0; i < 2001; i++){
                for(int j = 0; j < 2001; j++){
                    if(grid[i][j]==1){
                        minRow = Math.min(minRow,i);
                        minCol = Math.min(minCol,j);
                        maxRow = Math.max(maxRow,i);
                        maxCol = Math.max(maxCol,j);
                    }
                }
            }

        //System.out.println("minRow: "+minRow+",minCol:"+minCol+",maxRow:"+maxRow+",maxCol:"+maxCol);

        System.out.println((maxRow-minRow+1)*(maxCol-minCol+1));

    }
}