import java.io.*;
import java.util.Scanner;

public class text {
    public static void main(String[] args) throws FileNotFoundException {
    create();
    outputData();

    }

    static void create() throws FileNotFoundException {
        PrintWriter output = new PrintWriter("Exercise17_03.txt");
        for (int i = 0; i < 100; i++) {
            String s = String.valueOf((int) (Math.random() * 100));
            output.print(s);
            output.print(' ');
        }
        output.close();
    }

    static void outputData() {
        double a = 0;
        try (
                Scanner input = new Scanner(new File("Exercise17_03.txt"));
        ) {

            while (true) {

                a = input.nextInt() + a;
                System.out.println(a);

            }
            


        } catch (IOException e) {
            System.out.print("error");
        }
    }
}



