import java.io.*;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a file name");
        File in = new File(input.nextLine());
        System.out.println("enter encrypted file name");
        File out = new File(input.nextLine());

        try (
                BufferedInputStream buffin = new BufferedInputStream(
                        new FileInputStream(in));
                BufferedOutputStream buffout = new BufferedOutputStream(
                        new FileOutputStream(out));
                ){
            int value;
            while ((value = buffin.read()) != -1){
                buffout.write(value + 5);
            }
        }






    }
}
