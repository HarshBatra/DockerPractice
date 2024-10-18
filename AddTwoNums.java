import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Enter c:");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        int smallest = Math.min(a, Math.min(b, c));

        System.out.println(largest+smallest);
        sc.close();
    }
}
