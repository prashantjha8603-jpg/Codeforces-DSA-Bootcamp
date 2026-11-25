import java.util.Scanner;

public class Word_Capitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "";
        p = p + Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            p = p + s.charAt(i);
        }
        System.out.println(p);
        sc.close();
    }
}
