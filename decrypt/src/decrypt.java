import java.io.*;
import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a file name for the decrypted file");
        File e = new File(input.nextLine());
        try (
        BufferedInputStream in =new BufferedInputStream( new FileInputStream("Exercise17_14"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(e));
        ){
            int value;
            while ((value = in.read()) != -1) {
                out.write(value + 5);
            }
        }
    }
}
