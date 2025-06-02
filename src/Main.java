//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int sum = a + b;
        System.out.println(sum);

        int difference = a - b;
        System.out.println(difference);

        int product = a * b;
        System.out.println(product);

        int quotient = a / b;
        System.out.println(quotient);

        int remainder = a % b;
        System.out.println(remainder);

        a += 5;
        System.out.println(a);

        b -= 1;         // 3 -1
        System.out.println(b);

        b *= 4;         // 2 * 4
        System.out.println(b);

        b /= 2;         // 8 / 2
        System.out.println(b);

        b %= 3;         // 4 % 3
        System.out.println(b);
    }
}