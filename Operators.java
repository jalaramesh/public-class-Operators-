 import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.pow(a, b));
        sc.close();
    }
}