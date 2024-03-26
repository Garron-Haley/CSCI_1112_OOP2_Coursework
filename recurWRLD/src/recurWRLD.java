import java.util.Scanner;

public class recurWRLD {
    private int idx;
    private String text, rexText;
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line : ");
        String n = input.nextLine();

        // Display factorial
        int u = 0;
        while (true) {
            System.out.print("Press + or - ");
            String ch = input.next();
            if (ch.equals("+")) {
                n =reverse(n);
                System.out.println(n);
                u++;
            }
            if (ch.equals("-") && u != 0){
                n = othreverse(n);
                System.out.println(n);
                u--;
            }
        }
    }


    public static void reverseDisplay(String n) {
        while (true) {
            if ((null == n) || (n.length() <= 1)) {
                System.out.print(n);
                break;
            }
            String r = (n.substring(1)) + n.charAt(0);
            System.out.println(r);
            break;
        }

    }
    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        char r = str.charAt(0);
        return (str.substring(1)) + str.charAt(0);
    }
    public static String othreverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        char r = str.charAt(str.length() - 1);
        return (r + str.substring(0, str.length() - 1));
    }
}