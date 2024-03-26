import java.io.*;

public class text {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("Exercise17_01.txt");
        for (int i = 0; i < 100; i++ ) {
            String s = String.valueOf((int)(Math.random() * 100));
            output.print(s);
            output.print( ' ');
        }
        output.close();
            }
}
