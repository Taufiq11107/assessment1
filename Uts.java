import java.util.Scanner;

public class  Uts {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double d = scanner.nextDouble();
		System.out.println((a + b) / c * d);
	}
}