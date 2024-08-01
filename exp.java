
import java.util.Scanner;

class exp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of a is:");
        float a  = sc.nextFloat();
        System.out.println("Value of b is:");
        float b = sc.nextFloat();
        float sum = a+b;
        float sub = a-b;
        float mul = a*b;
        float div = a/b;
        System.out.println("Addition "+ sum);
        System.out.println("Division "+sub);
        System.out.println("Multiplication "+mul);
        System.out.println("Division "+div);
    }
}