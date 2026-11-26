import java.util.Scanner;

public class Anton_and_Danik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
        int d = 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (s.charAt(left) == 'A') {
                a++;
            } else {
                d++;
            }
            if (left != right) {
                if (s.charAt(right) == 'A') {
                    a++;
                } else {
                    d++;
                }
            }
            left++;
            right--;
        }
        if (a > d) {
            System.out.println("Anton");
        } else if (a < d) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        sc.close();
    }
}
