import java.util.Scanner;

public class pro{
					  private int idx;
					  private String text, rexText;
		    /** Main method */
		public static void main(String[] args) {
		      // Create a Scanner
		      Scanner input = new Scanner(System.in);
		      System.out.print("Enter a line : ");
		     String n = input.nextLine();

		      // Display factorial

		      System.out.print("reverse of " + n + " is " );
			reverseDisplay(n);

		    }


				       public static void reverseDisplay(String n) {
					while (true) {
						if ((null == n) || (n.length() <= 1)) {
							System.out.print(n);
							break;
						}
						String r = reverse(n.substring(1)) + n.charAt(0);
						System.out.print(r);
						break;
					}

		    }
					  public static String reverse(String str) {
						  if ((null == str) || (str.length() <= 1)) {
							  return str;
						  }
						  return reverse(str.substring(1)) + str.charAt(0);
					  }
	         }