import java.util.Scanner;

public class recfund {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number");
        int n1 = input.nextInt();
        System.out.print("enter second number");
        int n2 = input.nextInt();
        System.out.print("your greatest common divisor is " + ret(n1, n2));

    }
    public static int ret(int n1, int n2){
        if ( n2 != 0){
            return ret(n2, n1 % n2);
        }
        else {
            return n1;
        }
    }
}
