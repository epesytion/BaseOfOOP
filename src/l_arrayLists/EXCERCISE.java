package l_arrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class EXCERCISE {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of foods to order: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter your " + (i+1) + " food you want to order: ");
            list.add(sc.next());
        }
        System.out.println();

        System.out.print("Your order list: ");
        printList(list);


        sc.close();
    }
    public static void printList(ArrayList<String> list){
        System.out.print('{');
        for(int i = 0; i < list.size(); i++){
            System.out.print("\""+list.get(i) + "\", ");
        }
        System.out.print('}');
    }
}
