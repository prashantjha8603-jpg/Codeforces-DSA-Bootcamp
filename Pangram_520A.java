import java.util.Scanner;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        boolean ch[] = new boolean[26];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char p = Character.toLowerCase(s.charAt(i));
            if (!ch[p - 'a']) {
                ch[p - 'a'] = true;
                count++;
            }
        }
        if (count == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
