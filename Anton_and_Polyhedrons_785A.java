import java.util.Scanner;

public class Anton_and_Polyhedrons_785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int face = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(0) == 'T') {
                face += 4;
            } else if (s.charAt(0) == 'C') {
                face += 6;
            } else if (s.charAt(0) == 'O') {
                face += 8;
            } else if (s.charAt(0) == 'D') {
                face += 12;
            } else {
                face += 20;
            }
        }
        System.out.println(face);
        sc.close();
    }
}
