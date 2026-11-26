import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cLower = 0;
        int cUpper = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                cLower++;
            } else {
                cUpper++;
            }
        }
        if (cUpper > cLower) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(Character.toUpperCase(s.charAt(i)));
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }
        }
        sc.close();
    }
}
