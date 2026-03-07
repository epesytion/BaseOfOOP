package l_arrayLists;

import java.util.Scanner;

public class BugWithScanner {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String a = scanner.nextLine();
        System.out.println("int: ");

        int x = scanner.nextInt();

        scanner.nextLine(); //Need to reboot buffer, when after input int goes String input.
        System.out.println("String: ");
        String b = scanner.nextLine();
        System.out.println(a);
        System.out.println(x);
        System.out.println(b);




        scanner.close();
    }
}
