
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        int hra = basicSalary%10;
        System.out.println(hra);
    }
}
