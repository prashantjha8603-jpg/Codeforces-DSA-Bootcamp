import java.util.Scanner;

public class Way_Too_Long_Words_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        int k[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            k[i] = s[i].length() - 2;
        }
        for (int i = 0; i < n; i++) {
            if (k[i] <= 8) {
                System.out.println(s[i]);
            } else {
                System.out.println(""+s[i].charAt(0) + (k[i]) + s[i].charAt(k[i] + 1));
            }
        }
        sc.close();
    }
}
