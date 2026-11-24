import java.util.Scanner;
import java.util.Arrays;

public class Helpful_Maths_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("+", "");
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String p = "";
        for (int i = 0; i < arr.length - 1; i++) {
            p = p + arr[i] + "+";
        }
        p=p+arr[arr.length-1];
        System.out.println(p);
        sc.close();
    }
}
