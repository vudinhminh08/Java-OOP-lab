import java.util.Arrays;
import java.util.Scanner;

public class sort {
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum =0;
        System.out.println("Nhap so phan tu trong array");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< n; i++) {
            System.out.println("Nhap so thu " + (i+1) + " : ");

            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        Arrays.sort(arr);
        System.out.print("Sort: " + Arrays.toString(arr));
        System.out.println("\nTong cua cac so trong mang la: " + sum + ", va trung binh cong cac so la: " + (sum/n));
    }
}
