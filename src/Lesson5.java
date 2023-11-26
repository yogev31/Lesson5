// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            ex7('a','b','c');
        }
        public static void nameP(Scanner scan) {
            System.out.println("Enter your name: ");
            String name = scan.next();
            System.out.println("Hello, " + name);
        }
        public static void ex2(int num)
        {
            System.out.println(num/5);
        }
        public static int ex3(int a, int b)
        {
            return a*b;
        }
        public static double ex4(int a, int b, int c)
        {
            System.out.println("Sum = " + a+b+c);
            return (a+b+c/3.0);
        }
        public static void ex5(int r)
        {
            System.out.println("area = " + r*r*3.14);
            System.out.println("Peremiter = " + 2*3.14*r);
        }
        public static double ex6(int a, int b)
        {
            return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        }
    public static void ex7(char a,char b,char c)
    {
        System.out.println(c + "" + b + "" + a);
    }
    public static double ex8(int a1, int d, int n)
    {
        return a1+d*(n-1);
    }
}
