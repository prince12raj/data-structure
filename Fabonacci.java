import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        System.out.println("fabonacci is "+fabonacci1(n));
    }
    public static int fabonacci1(int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else {
            return fabonacci1(n-1) +fabonacci1(n-2);
        }
    }
}
