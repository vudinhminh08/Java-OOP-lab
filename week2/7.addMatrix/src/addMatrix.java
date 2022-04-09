import java.util.Arrays;
import java.util.Scanner;

public class addMatrix {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so hang doc, ngang cua ma tran: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        System.out.println("Nhap ma tran thu nhat");
        for(int i=0; i< a; i++) {
            for( int j=0; j< b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap ma tran thu hai");
        for(int i=0; i< a; i++) {
            for( int j=0; j< b; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<a; i++) {
            for( int j=0; j<b; j++) {
                arr1[i][j] += arr2[i][j];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
}
