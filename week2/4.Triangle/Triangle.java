import java.util.Scanner;

public class Triangle {
    static int n;
    public static void solve() {

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.printf("  ");

            for(int k = 1; k <= (2*i-1); k++)
                System.out.printf("* ");

            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {

        System.out.println("Moi ban nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        solve();
        
    }
}
