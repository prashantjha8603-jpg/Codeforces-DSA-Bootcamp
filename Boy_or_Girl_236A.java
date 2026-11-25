import java.util.Scanner;

public class Boy_or_Girl_236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {

            flag[s.charAt(i)-'a'] = true;

        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (flag[i]) {
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
