import java.util.Scanner;

public class Facto {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("factorial is "+factorial(n));

    }
    public static int factorial(int n){
        if (n==0 || n==1){ //  && and || or
            return 1; //base case condition end
        }
        else{
            return n* factorial(n-1);
        }
    }
}
