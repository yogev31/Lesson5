import java.util.Scanner;
import java.util.Random;
public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ex6();
    }
    public static void ex1(String n1, String n2, String n3)
    {
        if (n1.compareTo(n2) == -1 && n1.compareTo(n3) == -1)
        {
            if (n2.compareTo(n3) == -1)
            {
                System.out.println("1 = " + n1 + " 2 = " + n2 + " 3 = " + n3);
            }
            else
            {
                System.out.println("1 = " + n1 + " 2 = " + n3 + " 3 = " + n2);
            }
        }
        else if (n2.compareTo(n1) == -1 && n2.compareTo(n3) == -1)
        {
            if (n1.compareTo(n3) == -1)
            {
                System.out.println("1 = " + n2 + " 2 = " + n1 + " 3 = " + n3);
            }
            else
            {
                System.out.println("1 = " + n2 + " 2 = " + n3 + " 3 = " + n1);
            }
        }
        else if (n3.compareTo(n1) == -1 && n3.compareTo(n2) == -1)
        {
            if (n1.compareTo(n2) == -1)
            {
                System.out.println("1 = " + n3 + " 2 = " + n1 + " 3 = " + n2);
            }
            else
            {
                System.out.println("1 = " + n3 + " 2 = " + n2 + " 3 = " + n1);
            }
        }
    }
    public static void ex2(Scanner scan)
    {
        String idk = scan.nextLine();
        System.out.println("The length is " + idk.length());
    }
    public static boolean ex3(String machrozet, int size, int start)
    {
        if (size == 0)
        {
            return true;
        }
        if (machrozet.substring(start,start+1) != machrozet.substring(size-1,size))
        {
            return false;
        }
        ex3(machrozet,size-1,start+1);
        return false;
    }
    public static void ex4(String machrozet, int size)
    {
        if (size == 0)
        {
            return;
        }
        System.out.print(machrozet.substring(size-1,size));
        ex4(machrozet, size-1);
    }
    public static void ex5(String idk) {
        String modifiedString = idk.replaceAll("[aeiou]", "*");

        System.out.println(modifiedString);
    }
    public static void ex6()
    {
        Random r = new Random();
        int newnum = r.nextInt(100)+1;
        System.out.println("newnum = " + newnum);
        if (newnum/100 == 0 && newnum/10 != 0)
        {
            System.out.println("two numbers num!");
        }
        else if(newnum/100 != 0)
        {
            System.out.println("three numbers num!");
        }
        if (newnum % 2 == 0)
        {
            System.out.println("And num can be divided by 2");
        }
        else if (newnum % 3 == 0)
        {
            System.out.println("And num can be divided by 3");
        }
    }

}
